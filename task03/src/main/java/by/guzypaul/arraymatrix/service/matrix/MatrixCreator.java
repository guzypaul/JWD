package by.guzypaul.arraymatrix.service.matrix;

import by.guzypaul.arraymatrix.entity.MatrixEntity;
import by.guzypaul.arraymatrix.exception.MatrixException;

public interface MatrixCreator {
    void fillRandomized(MatrixEntity matrix, int minValue, int maxValue) throws MatrixException;
}
