package by.guzypaul.arraymatrix.service.matrix;

import by.guzypaul.arraymatrix.entity.MatrixEntity;
import by.guzypaul.arraymatrix.exception.MatrixException;

public interface Multiplicator {
    MatrixEntity multiply(MatrixEntity p, MatrixEntity q) throws MatrixException;
}
