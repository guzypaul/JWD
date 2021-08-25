package by.guzypaul.arraymatrix.service.array.impl;

import by.guzypaul.arraymatrix.dao.ArrayDao;
import by.guzypaul.arraymatrix.dao.exception.DaoException;
import by.guzypaul.arraymatrix.dao.factory.DaoFactory;
import by.guzypaul.arraymatrix.entity.ArrayEntity;
import by.guzypaul.arraymatrix.entity.exception.ArrayException;
import by.guzypaul.arraymatrix.service.exception.ServiceException;
import by.guzypaul.arraymatrix.service.array.ShellSort;

public class ShellSortImpl implements ShellSort {
    int[] array;
    @Override
    public void shellSort() throws ServiceException {
        try{
            DaoFactory daoObjectFactory = DaoFactory.getInstance();
            ArrayDao arrayDao = daoObjectFactory.getArrayDaoImpl();
            array = arrayDao.getData();
        }catch(DaoException | ArrayException e){
            throw new ServiceException(e);
        }

        int h = 1;
        while (h * 3 < array.length)
            h = h * 3 + 1;

        while (h >= 1) {
            hSort(array, h);
            h = h / 3;
        }
    }

    @Override
    public void hSort(int[] array, int h) throws ServiceException {
        int length = array.length;
        int temp;
        for (int i = h; i < length; i++) {
            for (int j = i; j >= h; j = j - h) {
                if (array[j] < array[j - h]) {
                    //swap(array, j, j - h);
                    temp = array[j];
                    array[j] = array[j - h];
                    array[j - h] = temp;
                } else {
                    break;
                }
            }
        }
    }
}
