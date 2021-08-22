package by.guzypaul.arraymatrix.service.arrayImpl;

import by.guzypaul.arraymatrix.service.array.SortInsertion;

public class SortInsertionImpl implements SortInsertion {
    @Override
    public void sortInsertion(int[] array) throws SecurityException {
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
