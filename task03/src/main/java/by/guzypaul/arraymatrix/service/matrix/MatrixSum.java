package by.guzypaul.arraymatrix.service.matrix;

import by.guzypaul.arraymatrix.entity.MatrixEntity;
import by.guzypaul.arraymatrix.entity.exception.MatrixException;

public interface MatrixSum {
    MatrixEntity sum(MatrixEntity matrixOne, MatrixEntity matrixTwo) throws MatrixException;
}
