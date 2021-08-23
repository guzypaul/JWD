package by.guzypaul.arraymatrix.controller.command.impl.matrix;

import by.guzypaul.arraymatrix.controller.command.CommandMatrix;
import by.guzypaul.arraymatrix.entity.MatrixEntity;
import by.guzypaul.arraymatrix.exception.MatrixException;
import by.guzypaul.arraymatrix.service.matrix.MatrixMultiplicator;
import by.guzypaul.arraymatrix.service.matrix.impl.MatrixMultiplicatorImpl;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MatrixMultiplicatorCommandArray implements CommandMatrix {
    private static final Logger logger = LogManager.getLogger(MatrixMultiplicatorCommandArray.class);
    @Override
    public void execute(MatrixEntity matrixOne, MatrixEntity matrixTwo) {
        try {
            MatrixMultiplicator multiplicator = new MatrixMultiplicatorImpl();
            multiplicator.multiply(matrixOne, matrixTwo);
        } catch (MatrixException e) {
            logger.log(Level.ERROR, e.getMessage());
        }
    }
}
