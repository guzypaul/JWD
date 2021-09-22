package by.guzypaul.arraymatrix.service.sorter.impl;

import by.guzypaul.arraymatrix.dao.ArrayDao;
import by.guzypaul.arraymatrix.dao.exception.DaoException;
import by.guzypaul.arraymatrix.dao.factory.DaoFactory;
import by.guzypaul.arraymatrix.entity.ArrayEntity;
import by.guzypaul.arraymatrix.entity.exception.ArrayException;
import by.guzypaul.arraymatrix.service.sorter.ArraySorter;
import by.guzypaul.arraymatrix.service.exception.ServiceException;

public class ShakerSortImpl implements ArraySorter {

    public ArrayEntity sort() throws ServiceException {
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
        while (left <= right) {  //TODO incorrect
            for (int i = right; i > left; --i) {
                if (arrayEntity.array[i - 1] > arrayEntity.array[i]) {
                    temp = arrayEntity.array[i];
                    arrayEntity.array[i] = arrayEntity.array[i - 1];
                    arrayEntity.array[i - 1] = temp;
                }
            }
        }

       /* for(int  i = 0; i < array.legth / 2; i++){ //TODO Shaker
            boolean swapped = false;
            for (int j = i; j < array.Length - i - 1; j++){
                if (array[j] < array[j + 1]){

                }
            }
        }*/

        return arrayEntity;
    }
}
