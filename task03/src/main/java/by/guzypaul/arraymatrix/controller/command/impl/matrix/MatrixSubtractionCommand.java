package by.guzypaul.arraymatrix.controller.command.impl.matrix;

import by.guzypaul.arraymatrix.controller.Command;
import by.guzypaul.arraymatrix.entity.exception.MatrixException;
import by.guzypaul.arraymatrix.service.exception.ServiceException;
import by.guzypaul.arraymatrix.service.factory.ServiceFactory;
import by.guzypaul.arraymatrix.service.calculator.MatrixSubtraction;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MatrixSubtractionCommand implements Command {
    private static final Logger logger = LogManager.getLogger(MatrixSubtractionCommand.class);
    String response = null;
    @Override
    public String execute() {
        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        MatrixSubtraction subtractor = serviceFactory.getMatrixSubtraction();

        try {
            response = subtractor.substract().toString();
        } catch (MatrixException | ServiceException e) {
            logger.log(Level.ERROR, e.getMessage());
        }
        return response;
    }
}
