package by.guzypaul.arraymatrix.controller.command.impl.array;

import by.guzypaul.arraymatrix.controller.command.CommandArray;
import by.guzypaul.arraymatrix.entity.ArrayEntity;
import by.guzypaul.arraymatrix.exception.ServiceException;
import by.guzypaul.arraymatrix.service.array.ShellSort;
import by.guzypaul.arraymatrix.service.array.impl.ShellSortImpl;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ShellSortCommandArray implements CommandArray {

    private static final Logger logger = LogManager.getLogger(ShellSortCommandArray.class);
    @Override
    public void execute(ArrayEntity array) {
        try {
            ShellSort sorter = new ShellSortImpl();
            sorter.shellSort(array);
        } catch (ServiceException e) {
            logger.log(Level.ERROR, e.getMessage());
        }
    }
}
