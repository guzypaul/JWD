package by.guzypaul.arraymatrix.controller.command.impl.array;

import by.guzypaul.arraymatrix.controller.command.CommandArray;
import by.guzypaul.arraymatrix.entity.ArrayEntity;
import by.guzypaul.arraymatrix.service.exception.ServiceException;
import by.guzypaul.arraymatrix.service.array.BubbleSort;
import by.guzypaul.arraymatrix.service.array.impl.BubbleSortImpl;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BubbleSortCommandArray implements CommandArray {
    private static final Logger logger = LogManager.getLogger(BubbleSortCommandArray.class);
    @Override
    public void execute(ArrayEntity array) {
        try{
            BubbleSort sorter = new BubbleSortImpl();
            sorter.bubbleSort(array);
        }catch (ServiceException e){
            logger.log(Level.ERROR, e.getMessage());
        }
    }
}
