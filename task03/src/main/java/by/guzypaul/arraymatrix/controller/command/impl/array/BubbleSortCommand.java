package by.guzypaul.arraymatrix.controller.command.impl.array;

import by.guzypaul.arraymatrix.controller.Command;
import by.guzypaul.arraymatrix.service.ArrayService;
import by.guzypaul.arraymatrix.service.sorter.ArraySorter;
import by.guzypaul.arraymatrix.service.exception.ServiceException;
import by.guzypaul.arraymatrix.service.factory.ServiceFactory;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BubbleSortCommand implements Command {
    private static final Logger logger = LogManager.getLogger(BubbleSortCommand.class);
    String response = null;
    @Override
    public String execute() {
        ArrayService arrayService = ServiceFactory.getInstance().getArrayService();
        //arrayService.getArray(); //getArray
        try{
            response = sorter.sort().toString();

        }catch (ServiceException e){
            logger.log(Level.ERROR, e.getMessage());
        }
        return response;
    }
}
