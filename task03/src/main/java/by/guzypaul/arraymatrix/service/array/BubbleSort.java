package by.guzypaul.arraymatrix.service.array;

import by.guzypaul.arraymatrix.entity.ArrayEntity;
import by.guzypaul.arraymatrix.exception.ServiceException;

/**
 * The interface SortBubble
 * @author Guzy Paul
 */

public interface BubbleSort {

    void bubbleSort(ArrayEntity array) throws ServiceException;
}
