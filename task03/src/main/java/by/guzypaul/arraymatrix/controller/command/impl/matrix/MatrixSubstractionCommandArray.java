package by.guzypaul.arraymatrix.controller.command.impl.matrix;

import by.guzypaul.arraymatrix.controller.command.CommandMatrix;
import by.guzypaul.arraymatrix.entity.MatrixEntity;
import by.guzypaul.arraymatrix.exception.MatrixException;
import by.guzypaul.arraymatrix.service.matrix.MatrixSubstraction;
import by.guzypaul.arraymatrix.service.matrix.impl.MatrixSubstractionImpl;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MatrixSubstractionCommandArray implements CommandMatrix {

    private static final Logger logger = LogManager.getLogger(MatrixSubstractionCommandArray.class);
    @Override
    public void execute(MatrixEntity matrixOne, MatrixEntity matrixTwo) {
        try {
            MatrixSubstraction multiplicator = new MatrixSubstractionImpl();
            multiplicator.substract(matrixOne, matrixTwo);
        } catch (MatrixException e) {
            logger.log(Level.ERROR, e.getMessage());
        }
    }
}
