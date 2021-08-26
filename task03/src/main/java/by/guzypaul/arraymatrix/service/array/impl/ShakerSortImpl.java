package by.guzypaul.arraymatrix.service.array.impl;

import by.guzypaul.arraymatrix.dao.ArrayDao;
import by.guzypaul.arraymatrix.dao.exception.DaoException;
import by.guzypaul.arraymatrix.dao.factory.DaoFactory;
import by.guzypaul.arraymatrix.entity.ArrayEntity;
import by.guzypaul.arraymatrix.entity.exception.ArrayException;
import by.guzypaul.arraymatrix.service.exception.ServiceException;
import by.guzypaul.arraymatrix.service.array.ShakerSort;

public class ShakerSortImpl implements ShakerSort {

    @Override
    public ArrayEntity shakerSort() throws ServiceException {
        ArrayEntity arrayEntity = null;

        DaoFactory daoObjectFactory = DaoFactory.getInstance();
        ArrayDao arrayDao = daoObjectFactory.getArrayDaoImpl();

        try{
            arrayEntity = new ArrayEntity(arrayDao.getData());
        }catch(DaoException | ArrayException e){
            throw new ServiceException(e);
        }

        int left = 0;
        int right = arrayEntity.array.length - 1;
        int temp;
        while (left <= right) {
            for (int i = right; i > left; --i) {
                if (arrayEntity.array[i - 1] > arrayEntity.array[i]) {
                    temp = arrayEntity.array[i];
                    arrayEntity.array[i] = arrayEntity.array[i - 1];
                    arrayEntity.array[i - 1] = temp;
                }
            }
        }
        return arrayEntity;
    }
}
