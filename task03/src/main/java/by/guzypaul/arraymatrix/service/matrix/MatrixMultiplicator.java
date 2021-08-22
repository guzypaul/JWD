package by.guzypaul.arraymatrix.service.matrix;

import by.guzypaul.arraymatrix.entity.MatrixEntity;
import by.guzypaul.arraymatrix.exception.MatrixException;

public interface MatrixMultiplicator {
    MatrixEntity multiply(MatrixEntity matrixOne, MatrixEntity matrixTwo) throws MatrixException;
}
