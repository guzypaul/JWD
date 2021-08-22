package by.guzypaul.arraymatrix.service.impl;

import by.guzypaul.arraymatrix.service.SortShaker;

public class SortShakerImpl implements SortShaker {
    @Override
    public void sortShaker(int[] array) throws SecurityException {
        int left = 0;
        int right = array.length - 1;
        int temp;
        while (left <= right) {
            for (int i = right; i > left; --i) {
                if (array[i - 1] > array[i]) {
                    //swap(array, i - 1, i);
                    temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                }
            }
        }
    }
}
