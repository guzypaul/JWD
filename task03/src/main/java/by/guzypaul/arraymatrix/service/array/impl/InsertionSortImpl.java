package by.guzypaul.arraymatrix.service.array.impl;

import by.guzypaul.arraymatrix.exception.ServiceException;
import by.guzypaul.arraymatrix.service.array.InsertionSort;

public class InsertionSortImpl implements InsertionSort {
    @Override
    public void insertionSort(int[] array) throws ServiceException { //TODO ServiceException
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;
            while (j >= 0 && current < array[j]) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = current;
        }
    }
}
