package by.guzypaul.arraymatrix.service.array.impl;

import by.guzypaul.arraymatrix.dao.ArrayDao;
import by.guzypaul.arraymatrix.dao.exception.DaoException;
import by.guzypaul.arraymatrix.dao.factory.DaoFactory;
import by.guzypaul.arraymatrix.entity.ArrayEntity;
import by.guzypaul.arraymatrix.entity.exception.ArrayException;
import by.guzypaul.arraymatrix.service.exception.ServiceException;
import by.guzypaul.arraymatrix.service.array.InsertionSort;

public class InsertionSortImpl implements InsertionSort {

    @Override
    public ArrayEntity insertionSort() throws ServiceException {
        ArrayEntity arrayEntity = null;

        DaoFactory daoObjectFactory = DaoFactory.getInstance();
        ArrayDao arrayDao = daoObjectFactory.getArrayDaoImpl();

        try{
            arrayEntity = new ArrayEntity(arrayDao.getData());
        }catch(DaoException | ArrayException e){
            throw new ServiceException(e);
        }

        for (int i = 1; i < arrayEntity.array.length; i++) {
            int current = arrayEntity.array[i];
            int j = i - 1;
            while (j >= 0 && current < arrayEntity.array[j]) {
                arrayEntity.array[j + 1] = arrayEntity.array[j];
                j--;
            }
            arrayEntity.array[j + 1] = current;
        }
        return arrayEntity;
    }
}
