package by.guzypaul.arraymatrix.service.array.impl;

import by.guzypaul.arraymatrix.entity.ArrayEntity;
import by.guzypaul.arraymatrix.service.exception.ServiceException;
import by.guzypaul.arraymatrix.service.array.BubbleSort;

public class BubbleSortImpl implements BubbleSort {
    @Override
    public void bubbleSort(ArrayEntity newArray) throws ServiceException {
        int[] array = newArray.getArray();
        boolean isSorted = false;
        int temp;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    isSorted = false;
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }
    }
}
