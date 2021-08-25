package by.guzypaul.arraymatrix.service.array;

import by.guzypaul.arraymatrix.service.exception.ServiceException;

public interface ShellSort {
    void shellSort() throws ServiceException;
    void hSort(int[] array, int h) throws ServiceException;
}
