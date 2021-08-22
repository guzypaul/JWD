package by.guzypaul.arraymatrix.service.array.impl;

import by.guzypaul.arraymatrix.exception.ServiceException;
import by.guzypaul.arraymatrix.service.array.ShellSort;

public class ShellSortImpl implements ShellSort {
    @Override
    public void shellSort(int[] array) throws ServiceException {
        int h = 1;
        while (h * 3 < array.length)
            h = h * 3 + 1;

        while (h >= 1) {
            hSort(array, h);
            h = h / 3;
        }
    }

    private void hSort(int[] array, int h) {
        int length = array.length;
        int temp;
        for (int i = h; i < length; i++) {
            for (int j = i; j >= h; j = j - h) {
                if (array[j] < array[j - h]) {
                    //swap(array, j, j - h);
                    temp = array[j];
                    array[j] = array[j - h];
                    array[j - h] = temp;
                } else {
                    break;
                }
            }
        }
    }
}
