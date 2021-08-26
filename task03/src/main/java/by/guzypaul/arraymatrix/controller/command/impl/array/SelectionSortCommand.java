package by.guzypaul.arraymatrix.controller.command.impl.array;

import by.guzypaul.arraymatrix.controller.Command;
import by.guzypaul.arraymatrix.service.array.ArraySorter;
import by.guzypaul.arraymatrix.service.exception.ServiceException;
import by.guzypaul.arraymatrix.service.factory.ServiceFactory;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SelectionSortCommand implements Command {
    private static final Logger logger = LogManager.getLogger(SelectionSortCommand.class);
    String response = null;
    @Override
    public String execute() {
        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        ArraySorter sorter = serviceFactory.getSelectionSort();

        try {
            response = sorter.sort().toString();;
        } catch (ServiceException e) {
            logger.log(Level.ERROR, e.getMessage());
        }
        return response;
    }
}
