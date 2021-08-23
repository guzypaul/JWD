package by.guzypaul.arraymatrix.controller.command.impl.matrix;

import by.guzypaul.arraymatrix.controller.command.CommandMatrix;
import by.guzypaul.arraymatrix.entity.MatrixEntity;
import by.guzypaul.arraymatrix.exception.MatrixException;
import by.guzypaul.arraymatrix.service.matrix.MatrixSubtraction;
import by.guzypaul.arraymatrix.service.matrix.impl.MatrixSubtractionImpl;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MatrixSubtractionCommandArray implements CommandMatrix {

    private static final Logger logger = LogManager.getLogger(MatrixSubtractionCommandArray.class);
    @Override
    public void execute(MatrixEntity matrixOne, MatrixEntity matrixTwo) {
        try {
            MatrixSubtraction subtractor = new MatrixSubtractionImpl();
            subtractor.substract(matrixOne, matrixTwo);
        } catch (MatrixException e) {
            logger.log(Level.ERROR, e.getMessage());
        }
    }
}
