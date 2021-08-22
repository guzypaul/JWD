package by.guzypaul.arraymatrix.service.impl;

import by.guzypaul.arraymatrix.service.SortSelection;

public class SortSelectionImpl implements SortSelection {
    @Override
    public void sortSelection(int[] array) throws SecurityException {
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
