package by.guzypaul.multitreading.service.inserter;

import by.guzypaul.multitreading.dao.MatrixDao;
import by.guzypaul.multitreading.dao.factory.DaoFactory;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MatrixDiagonalLockInserter extends Thread {
    private static final Lock LOCK = new ReentrantLock();
    private static AtomicInteger counter = new AtomicInteger(0);
    private int element;

    public MatrixDiagonalLockInserter(int element) {
        this.element = element;
    }

    @Override
    public void run() {
        try {
            MatrixDao matrixDao = DaoFactory.getInstance().getMatrixDaoImpl();

            while (counter.get() < matrixDao.findMatrix().getHorizontalSize()) {
                TimeUnit.MILLISECONDS.sleep(20);
                LOCK.lock();

                if (counter.get() < matrixDao.findMatrix().getHorizontalSize()) {
                    matrixDao.setElement(counter.get(), counter.get(), element);
                    counter.incrementAndGet();
                }
                LOCK.unlock();

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
