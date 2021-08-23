package by.guzypaul.arraymatrix.controller.command.impl.array;

import by.guzypaul.arraymatrix.controller.command.CommandArray;
import by.guzypaul.arraymatrix.entity.ArrayEntity;
import by.guzypaul.arraymatrix.exception.ServiceException;
import by.guzypaul.arraymatrix.service.array.InsertionSort;
import by.guzypaul.arraymatrix.service.array.impl.InsertionSortImpl;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class InsertionSortCommandArray implements CommandArray {
    private static final Logger logger = LogManager.getLogger(InsertionSortCommandArray.class);
    @Override
    public void execute(ArrayEntity array) {
        try {
            InsertionSort sorter = new InsertionSortImpl();
            sorter.insertionSort(array);
        } catch (ServiceException e) {
            logger.log(Level.ERROR, e.getMessage());
        }
    }
}
