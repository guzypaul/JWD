package by.guzypaul.arraymatrix.controller.command.impl.matrix;

import by.guzypaul.arraymatrix.controller.Command;
import by.guzypaul.arraymatrix.entity.exception.MatrixException;
import by.guzypaul.arraymatrix.service.exception.ServiceException;
import by.guzypaul.arraymatrix.service.factory.ServiceFactory;
import by.guzypaul.arraymatrix.service.calculator.MatrixMultiplicator;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MatrixMultiplicatorCommand implements Command {
    private static final Logger logger = LogManager.getLogger(MatrixMultiplicatorCommand.class);
    String response = null;

    @Override
    public String execute() {

        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        MatrixMultiplicator multiplicator = serviceFactory.getMatrixMultiplicator();

        try {
            response = multiplicator.multiply().toString();
        } catch (MatrixException | ServiceException e) {
            logger.log(Level.ERROR, e.getMessage());
        }
        return response;
    }
}
