package by.guzypaul.arraymatrix.service.array.impl;

import by.guzypaul.arraymatrix.exception.ServiceException;
import by.guzypaul.arraymatrix.service.array.SelectionSort;

public class SelectionSortImpl implements SelectionSort {
    @Override
    public void selectionSort(int[] array) throws ServiceException {
        for (int i = 0; i < array.length; i++) {
            int pos = i;
            int min = array[i];
            // loop of selection minimum element
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    pos = j;    // pos - index minimum element
                    min = array[j];
                }
            }
            array[pos] = array[i];
            array[i] = min;    // change minimum element and "array[i]"
        }
    }
}
