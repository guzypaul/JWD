package by.guzypaul.arraymatrix.controller.command.impl.array;

import by.guzypaul.arraymatrix.controller.Command;
import by.guzypaul.arraymatrix.service.exception.ServiceException;
import by.guzypaul.arraymatrix.service.array.InsertionSort;
import by.guzypaul.arraymatrix.service.array.impl.InsertionSortImpl;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class InsertionSortCommand implements Command {
    private static final Logger logger = LogManager.getLogger(InsertionSortCommand.class);
    @Override
    public void execute() {
        try {
            InsertionSort sorter = new InsertionSortImpl();
            sorter.insertionSort();
        } catch (ServiceException e) {
            logger.log(Level.ERROR, e.getMessage());
        }
    }
}
