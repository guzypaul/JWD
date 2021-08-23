package by.guzypaul.arraymatrix.controller.command.impl.array;

import by.guzypaul.arraymatrix.controller.command.CommandArray;
import by.guzypaul.arraymatrix.entity.ArrayEntity;
import by.guzypaul.arraymatrix.exception.ServiceException;
import by.guzypaul.arraymatrix.service.array.ShakerSort;
import by.guzypaul.arraymatrix.service.array.impl.ShakerSortImpl;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ShakerSortCommandArray implements CommandArray {
    private static final Logger logger = LogManager.getLogger(ShakerSortCommandArray.class);
    @Override
    public void execute(ArrayEntity array) {
        try {
            ShakerSort sorter = new ShakerSortImpl();
            sorter.shakerSort(array);
        } catch (ServiceException e) {
            logger.log(Level.ERROR, e.getMessage());
        }
    }
}
