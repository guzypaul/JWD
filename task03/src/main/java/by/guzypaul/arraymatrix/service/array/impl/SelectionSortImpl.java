package by.guzypaul.arraymatrix.service.array.impl;

import by.guzypaul.arraymatrix.dao.ArrayDao;
import by.guzypaul.arraymatrix.dao.exception.DaoException;
import by.guzypaul.arraymatrix.dao.factory.DaoFactory;
import by.guzypaul.arraymatrix.entity.ArrayEntity;
import by.guzypaul.arraymatrix.entity.exception.ArrayException;
import by.guzypaul.arraymatrix.service.exception.ServiceException;
import by.guzypaul.arraymatrix.service.array.SelectionSort;

public class SelectionSortImpl implements SelectionSort {
    int[] array;
    @Override
    public void selectionSort() throws ServiceException {

        try{
            DaoFactory daoObjectFactory = DaoFactory.getInstance();
            ArrayDao arrayDao = daoObjectFactory.getArrayDaoImpl();
            array = arrayDao.getData();
        }catch(DaoException | ArrayException e){
            throw new ServiceException(e);
        }

        for (int i = 0; i < array.length; i++) {
            int pos = i;
            int min = array[i];
            // loop of selection minimum element
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    pos = j;    // pos - index minimum element
                    min = array[j];
                }
            }
            array[pos] = array[i];
            array[i] = min;    // change minimum element and "array[i]"
        }
    }
}
