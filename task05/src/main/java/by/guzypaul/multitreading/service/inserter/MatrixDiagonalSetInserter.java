package by.guzypaul.multitreading.service.inserter;

import by.guzypaul.multitreading.dao.MatrixDao;
import by.guzypaul.multitreading.dao.factory.DaoFactory;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MatrixDiagonalSetInserter extends Thread {
    private static final Lock LOCK = new ReentrantLock();
    private static Set<Integer> replaceableIndexes = fillSetIndexes();
    private static AtomicInteger counter = new AtomicInteger(0);
    private int element;


    public MatrixDiagonalSetInserter(int element) {
        this.element = element;
    }

    @Override
    public void run() {
        try {
            MatrixDao matrixDao = DaoFactory.getInstance().getMatrixDaoImpl();
            while (counter.get() < DaoFactory.getInstance().getMatrixDaoImpl().findMatrix().getHorizontalSize() - 1) {
                TimeUnit.MILLISECONDS.sleep(20);
                LOCK.lock();
                if (!replaceableIndexes.add(counter.get())) {
                    matrixDao.setElement(counter.get(), counter.get(), element);
                    System.out.println(DaoFactory.getInstance().getMatrixDaoImpl().findMatrix());
                    replaceableIndexes.remove(counter.get());
                    counter.incrementAndGet();
                }
                LOCK.unlock();
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static Set<Integer> fillSetIndexes() {
        Set<Integer> indexes = new HashSet<>();
        for (int i = 0; i < DaoFactory.getInstance().getMatrixDaoImpl().findMatrix().getHorizontalSize(); i++) {
            indexes.add(i);
        }

        return indexes;
    }

    public static void resetCounter() {
        counter.set(0);
        replaceableIndexes = fillSetIndexes();
    }
}
