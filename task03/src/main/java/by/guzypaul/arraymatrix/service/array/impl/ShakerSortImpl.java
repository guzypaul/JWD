package by.guzypaul.arraymatrix.service.array.impl;

import by.guzypaul.arraymatrix.entity.ArrayEntity;
import by.guzypaul.arraymatrix.service.exception.ServiceException;
import by.guzypaul.arraymatrix.service.array.ShakerSort;

public class ShakerSortImpl implements ShakerSort {
    @Override
    public void shakerSort(ArrayEntity newArray) throws ServiceException {
        int[] array = newArray.getArray();
        int left = 0;
        int right = array.length - 1;
        int temp;
        while (left <= right) {
            for (int i = right; i > left; --i) {
                if (array[i - 1] > array[i]) {
                    temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                }
            }
        }
    }
}
