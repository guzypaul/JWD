package by.guzypaul.arraymatrix.service.array.impl;

import by.guzypaul.arraymatrix.dao.ArrayDao;
import by.guzypaul.arraymatrix.dao.exception.DaoException;
import by.guzypaul.arraymatrix.dao.factory.DaoFactory;
import by.guzypaul.arraymatrix.entity.exception.ArrayException;
import by.guzypaul.arraymatrix.service.exception.ServiceException;
import by.guzypaul.arraymatrix.service.array.BubbleSort;

public class BubbleSortImpl implements BubbleSort {
    int[] array;
    @Override
    public void bubbleSort() throws ServiceException {

        try{
            DaoFactory daoObjectFactory = DaoFactory.getInstance();
            ArrayDao arrayDao = daoObjectFactory.getArrayDaoImpl();
            array = arrayDao.getData();
        }catch(DaoException | ArrayException e){
            throw new ServiceException(e);
        }

        boolean isSorted = false;
        int temp;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    isSorted = false;
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }
    }
}
