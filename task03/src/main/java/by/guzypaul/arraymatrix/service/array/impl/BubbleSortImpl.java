package by.guzypaul.arraymatrix.service.array.impl;

import by.guzypaul.arraymatrix.exception.ServiceException;
import by.guzypaul.arraymatrix.service.array.BubbleSort;

public class BubbleSortImpl implements BubbleSort {
    @Override
    public void bubbleSort(int[] array) throws ServiceException {

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
