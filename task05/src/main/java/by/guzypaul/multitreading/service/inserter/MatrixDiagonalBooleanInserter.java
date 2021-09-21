package by.guzypaul.multitreading.service.inserter;

import by.guzypaul.multitreading.dao.MatrixDao;
import by.guzypaul.multitreading.dao.factory.DaoFactory;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MatrixDiagonalBooleanInserter extends Thread{
    private static final AtomicBoolean IS_BLOCKED = new AtomicBoolean(false);
    private static AtomicInteger counter = new AtomicInteger(0);
    private int element;

    public MatrixDiagonalBooleanInserter(int element) {
        this.element = element;
    }

    @Override
    public void run() {
        try {
            MatrixDao matrixDao = DaoFactory.getInstance().getMatrixDaoImpl();

            while (counter.get() < matrixDao.findMatrix().getHorizontalSize()) {
                TimeUnit.MILLISECONDS.sleep(20);

                if(!IS_BLOCKED.get()){
                    IS_BLOCKED.set(true);
                    if (counter.get() < matrixDao.findMatrix().getHorizontalSize()) {
                        matrixDao.setElement(counter.get(), counter.get(), element);
                        //System.out.println(DaoFactory.getInstance().getMatrixDaoImpl().findMatrix());
                        counter.incrementAndGet();
                    }
                    IS_BLOCKED.set(false);
                }

                TimeUnit.MILLISECONDS.sleep(20);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void resetCounter() {
        counter.set(0);
    }
}
