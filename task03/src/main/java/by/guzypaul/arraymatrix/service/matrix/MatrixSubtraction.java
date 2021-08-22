package by.guzypaul.arraymatrix.service.matrix;

import by.guzypaul.arraymatrix.entity.MatrixEntity;
import by.guzypaul.arraymatrix.exception.MatrixException;

public interface MatrixSubtraction {
    MatrixEntity substract(MatrixEntity matrixOne, MatrixEntity matrixTwo) throws MatrixException;
}
