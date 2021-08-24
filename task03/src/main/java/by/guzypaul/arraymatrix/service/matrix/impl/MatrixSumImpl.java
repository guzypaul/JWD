package by.guzypaul.arraymatrix.service.matrix.impl;

import by.guzypaul.arraymatrix.entity.MatrixEntity;
import by.guzypaul.arraymatrix.entity.exception.MatrixException;
import by.guzypaul.arraymatrix.service.matrix.MatrixSum;

public class MatrixSumImpl implements MatrixSum {
    @Override
    public MatrixEntity sum(MatrixEntity matrixOne, MatrixEntity matrixTwo) throws MatrixException {

        int verticalSize = matrixOne.getVerticalSize();
        int horizontalSize = matrixTwo.getHorizontalSize();

        MatrixEntity result = new MatrixEntity(verticalSize, horizontalSize);
        for (int i = 0; i < result.getVerticalSize(); i++) {
            for (int j = 0; j < result.getHorizontalSize(); j++) {
                result.setElement(i, j, matrixOne.getElement(i, j) + matrixTwo.getElement(i, j));
            }
        }

        return result;
    }
}
