package by.guzypaul.arraymatrix.service.array;

import by.guzypaul.arraymatrix.entity.ArrayEntity;
import by.guzypaul.arraymatrix.exception.ServiceException;

public interface ShellSort {
    void shellSort(ArrayEntity array) throws ServiceException;
    void hSort(int[] array, int h) throws ServiceException;
}
