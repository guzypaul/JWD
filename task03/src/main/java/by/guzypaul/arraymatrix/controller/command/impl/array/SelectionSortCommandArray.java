package by.guzypaul.arraymatrix.controller.command.impl.array;

import by.guzypaul.arraymatrix.controller.command.CommandArray;
import by.guzypaul.arraymatrix.entity.ArrayEntity;
import by.guzypaul.arraymatrix.exception.ServiceException;
import by.guzypaul.arraymatrix.service.array.SelectionSort;
import by.guzypaul.arraymatrix.service.array.impl.SelectionSortImpl;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SelectionSortCommandArray implements CommandArray {
    private static final Logger logger = LogManager.getLogger(SelectionSortCommandArray.class);
    @Override
    public void execute(ArrayEntity array) {
        try {
            SelectionSort sorter = new SelectionSortImpl();
            sorter.selectionSort(array);
        } catch (ServiceException e) {
            logger.log(Level.ERROR, e.getMessage());
        }
    }
}
