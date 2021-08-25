package by.guzypaul.arraymatrix.service.array.impl;

import by.guzypaul.arraymatrix.dao.ArrayDao;
import by.guzypaul.arraymatrix.dao.exception.DaoException;
import by.guzypaul.arraymatrix.dao.factory.DaoFactory;
import by.guzypaul.arraymatrix.entity.ArrayEntity;
import by.guzypaul.arraymatrix.entity.exception.ArrayException;
import by.guzypaul.arraymatrix.service.exception.ServiceException;
import by.guzypaul.arraymatrix.service.array.ShakerSort;

public class ShakerSortImpl implements ShakerSort {
    int[] array;
    @Override
    public void shakerSort() throws ServiceException {
        try{
            DaoFactory daoObjectFactory = DaoFactory.getInstance();
            ArrayDao arrayDao = daoObjectFactory.getArrayDaoImpl();
            array = arrayDao.getData();
        }catch(DaoException | ArrayException e){
            throw new ServiceException(e);
        }

        int left = 0;
        int right = array.length - 1;
        int temp;
        while (left <= right) {
            for (int i = right; i > left; --i) {
                if (array[i - 1] > array[i]) {
                    temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                }
            }
        }
    }
}
