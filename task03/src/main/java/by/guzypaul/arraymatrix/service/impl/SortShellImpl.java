package by.guzypaul.arraymatrix.service.impl;

import by.guzypaul.arraymatrix.service.SortShell;

public class SortShellImpl implements SortShell {
    @Override
    public void sortShell(int[] array) throws SecurityException {
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
