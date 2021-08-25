package by.guzypaul.arraymatrix.service.array.impl;

import by.guzypaul.arraymatrix.dao.ArrayDao;
import by.guzypaul.arraymatrix.dao.exception.DaoException;
import by.guzypaul.arraymatrix.dao.factory.DaoFactory;
import by.guzypaul.arraymatrix.entity.exception.ArrayException;
import by.guzypaul.arraymatrix.service.exception.ServiceException;
import by.guzypaul.arraymatrix.service.array.InsertionSort;

public class InsertionSortImpl implements InsertionSort {
    int[] array;
    @Override
    public void insertionSort() throws ServiceException {

        try{
            DaoFactory daoObjectFactory = DaoFactory.getInstance();
            ArrayDao arrayDao = daoObjectFactory.getArrayDaoImpl();
            array = arrayDao.getData();
        }catch(DaoException | ArrayException e){
            throw new ServiceException(e);
        }

        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;
            while (j >= 0 && current < array[j]) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = current;
        }
    }
}
