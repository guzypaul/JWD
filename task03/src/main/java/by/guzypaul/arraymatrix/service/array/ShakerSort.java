package by.guzypaul.arraymatrix.service.array;

import by.guzypaul.arraymatrix.entity.ArrayEntity;
import by.guzypaul.arraymatrix.exception.ServiceException;

public interface ShakerSort {

    void shakerSort(ArrayEntity array) throws ServiceException;
}
