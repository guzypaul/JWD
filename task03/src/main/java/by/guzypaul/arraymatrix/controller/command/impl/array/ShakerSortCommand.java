package by.guzypaul.arraymatrix.controller.command.impl.array;

import by.guzypaul.arraymatrix.controller.Command;
import by.guzypaul.arraymatrix.service.exception.ServiceException;
import by.guzypaul.arraymatrix.service.array.ShakerSort;
import by.guzypaul.arraymatrix.service.array.impl.ShakerSortImpl;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ShakerSortCommand implements Command {
    private static final Logger logger = LogManager.getLogger(ShakerSortCommand.class);
    @Override
    public void execute() {
        try {
            ShakerSort sorter = new ShakerSortImpl();
            sorter.shakerSort();
        } catch (ServiceException e) {
            logger.log(Level.ERROR, e.getMessage());
        }
    }
}
