package by.guzypaul.arraymatrix.service.sorter.impl;

import by.guzypaul.arraymatrix.dao.ArrayDao;
import by.guzypaul.arraymatrix.dao.exception.DaoException;
import by.guzypaul.arraymatrix.dao.factory.DaoFactory;
import by.guzypaul.arraymatrix.entity.ArrayEntity;
import by.guzypaul.arraymatrix.entity.exception.ArrayException;
import by.guzypaul.arraymatrix.service.sorter.ArraySorter;
import by.guzypaul.arraymatrix.service.exception.ServiceException;

public class SelectionSortImpl implements ArraySorter {

    @Override
    public ArrayEntity sort() throws ServiceException {
        ArrayEntity arrayEntity = null;

        DaoFactory daoObjectFactory = DaoFactory.getInstance();
        ArrayDao arrayDao = daoObjectFactory.getArrayDaoImpl();

        try{
            arrayEntity = new ArrayEntity(arrayDao.getData());
        }catch(DaoException | ArrayException e){
            throw new ServiceException(e);
        }


        for (int i = 0; i < arrayEntity.array.length; i++) {
            int pos = i;
            int min = arrayEntity.array[i];
            // loop of selection minimum element
            for (int j = i + 1; j < arrayEntity.array.length; j++) {
                if (arrayEntity.array[j] < min) {
                    pos = j;    // pos - index minimum element
                    min = arrayEntity.array[j];
                }
            }
            arrayEntity.array[pos] = arrayEntity.array[i];
            arrayEntity.array[i] = min;    // change minimum element and "array[i]"
        }
        return arrayEntity;
    }
}
