package by.guzypaul.arraymatrix.service.sorter.impl;

import by.guzypaul.arraymatrix.dao.ArrayDao;
import by.guzypaul.arraymatrix.dao.exception.DaoException;
import by.guzypaul.arraymatrix.dao.factory.DaoFactory;
import by.guzypaul.arraymatrix.entity.ArrayEntity;
import by.guzypaul.arraymatrix.entity.exception.ArrayException;
import by.guzypaul.arraymatrix.service.sorter.ArraySorter;
import by.guzypaul.arraymatrix.service.exception.ServiceException;

public class BubbleSortImpl implements ArraySorter {


    @Override
    public ArrayEntity sort() throws ServiceException {
        ArrayEntity arrayEntity = null;
        DaoFactory daoObjectFactory = DaoFactory.getInstance();
        ArrayDao arrayDao = daoObjectFactory.getArrayDaoImpl();
        //TODO ServiceArray

        try{
            arrayEntity = new ArrayEntity(arrayDao.getData());
        }catch(DaoException | ArrayException e){
            throw new ServiceException(e);
        }


        boolean isSorted = false;
        int temp;
        while(!isSorted) {
            isSorted = true; //TODO while -> for
            for (int i = 0; i < arrayEntity.array.length - 1; i++) {
                if (arrayEntity.array[i] > arrayEntity.array[i + 1]) {
                    isSorted = false;
                    temp = arrayEntity.array[i];
                    arrayEntity.array[i] = arrayEntity.array[i + 1];
                    arrayEntity.array[i + 1] = temp;
                }
            }
        }
        return arrayEntity;
    }
}
