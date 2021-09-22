package by.guzypaul.arraymatrix.service.impl;

import by.guzypaul.arraymatrix.entity.ArrayEntity;
import by.guzypaul.arraymatrix.service.ArrayService;
import by.guzypaul.arraymatrix.service.sorter.ArraySorter;
import by.guzypaul.arraymatrix.service.sorter.impl.BubbleSortImpl;

public class ArrayServiceImpl implements ArrayService {
    @Override
    public ArrayEntity sortByBubbleSort(ArrayEntity array) {
        ArraySorter bubbleArraySorter = new BubbleSortImpl();
        return bubbleArraySorter.sort(array);
    }
}
