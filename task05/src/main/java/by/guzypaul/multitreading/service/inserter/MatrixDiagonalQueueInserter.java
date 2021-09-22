package by.guzypaul.multitreading.service.inserter;

import by.guzypaul.multitreading.dao.MatrixDao;
import by.guzypaul.multitreading.dao.factory.DaoFactory;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MatrixDiagonalQueueInserter extends Thread {
    private static final Lock LOCK = new ReentrantLock();
    private static BlockingQueue<Integer> replaceableIndexes = fillIndexesQueue();
    private static AtomicInteger counter = new AtomicInteger(0);
    private int element;


    public MatrixDiagonalQueueInserter(int element) {
        this.element = element;
    }

    @Override
    public void run() {
        try {
            MatrixDao matrixDao = DaoFactory.getInstance().getMatrixDaoImpl();
            while(!replaceableIndexes.isEmpty()){
                TimeUnit.MILLISECONDS.sleep(20);
                LOCK.lock();
                if(!replaceableIndexes.isEmpty()){
                    int replaceableIndex = replaceableIndexes.poll();
                    matrixDao.setElement(replaceableIndex, replaceableIndex, element);
                    counter.incrementAndGet();
                }
                LOCK.unlock();
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static BlockingQueue<Integer> fillIndexesQueue(){
        BlockingQueue<Integer> indexes = new LinkedBlockingDeque<>();
        for(int i = 0; i < DaoFactory.getInstance().getMatrixDaoImpl().findMatrix().getHorizontalSize(); i++){
            indexes.add(i);
        }

        return indexes;
    }

    public static void resetCounter() {
        counter.set(0);
        replaceableIndexes = fillIndexesQueue();
    }
}
