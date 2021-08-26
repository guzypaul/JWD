package by.guzypaul.arraymatrix.service.array;

import by.guzypaul.arraymatrix.entity.ArrayEntity;
import by.guzypaul.arraymatrix.service.exception.ServiceException;

/**
 * The interface SortBubble
 * @author Guzy Paul
 */

public interface BubbleSort {

    ArrayEntity bubbleSort() throws ServiceException;
}
