package by.guzypaul.arraymatrix.service.array.impl;

import by.guzypaul.arraymatrix.entity.ArrayEntity;
import by.guzypaul.arraymatrix.service.exception.ServiceException;
import by.guzypaul.arraymatrix.service.array.InsertionSort;

public class InsertionSortImpl implements InsertionSort {
    @Override
    public void insertionSort(ArrayEntity newArray) throws ServiceException {
        int[] array = newArray.getArray();
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
