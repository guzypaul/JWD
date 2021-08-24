package by.guzypaul.arraymatrix.controller.command.impl.matrix;

import by.guzypaul.arraymatrix.controller.command.CommandMatrix;
import by.guzypaul.arraymatrix.entity.MatrixEntity;
import by.guzypaul.arraymatrix.entity.exception.MatrixException;
import by.guzypaul.arraymatrix.service.matrix.MatrixSum;
import by.guzypaul.arraymatrix.service.matrix.impl.MatrixSumImpl;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MatrixSumCommandArray implements CommandMatrix {
    private static final Logger logger = LogManager.getLogger(MatrixSumCommandArray.class);
    @Override
    public void execute(MatrixEntity matrixOne, MatrixEntity matrixTwo) {
        try {
            MatrixSum matrixSum = new MatrixSumImpl();
            matrixSum.sum(matrixOne, matrixTwo);
        } catch (MatrixException e) {
            logger.log(Level.ERROR, e.getMessage());
        }
    }
}
