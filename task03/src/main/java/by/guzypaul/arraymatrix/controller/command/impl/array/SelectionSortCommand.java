package by.guzypaul.arraymatrix.controller.command.impl.array;

import by.guzypaul.arraymatrix.controller.Command;
import by.guzypaul.arraymatrix.service.exception.ServiceException;
import by.guzypaul.arraymatrix.service.array.SelectionSort;
import by.guzypaul.arraymatrix.service.array.impl.SelectionSortImpl;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SelectionSortCommand implements Command {
    private static final Logger logger = LogManager.getLogger(SelectionSortCommand.class);
    @Override
    public void execute() {
        try {
            SelectionSort sorter = new SelectionSortImpl();
            sorter.selectionSort();
        } catch (ServiceException e) {
            logger.log(Level.ERROR, e.getMessage());
        }
    }
}
