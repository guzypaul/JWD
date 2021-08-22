package by.guzypaul.arraymatrix.service.impl;

import by.guzypaul.arraymatrix.service.SortBubble;

public class SortBubbleImpl  implements SortBubble{
    @Override
    public void sortBubble(int[] array) throws SecurityException {

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
