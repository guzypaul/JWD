package by.guzypaul.arraymatrix.service.matrix.impl;

import by.guzypaul.arraymatrix.entity.MatrixEntity;
import by.guzypaul.arraymatrix.exception.MatrixException;
import by.guzypaul.arraymatrix.service.matrix.MatrixCreator;

public class MatrixCreatorImpl implements MatrixCreator {
    @Override
    public void fillRandomized(MatrixEntity matrix, int minValue, int maxValue) throws MatrixException {
        int v = matrix.getVerticalSize();
        int h = matrix.getHorizontalSize();
        for (int i = 0; i < v; i++) {
            for (int j = 0; j < h; j++) {
                try {
                    int value = (int) ((Math.random() * (maxValue - minValue)) + minValue);
                    matrix.setElement(i, j, value);
                } catch (MatrixException e) {
                // log: exception impossible
                }
            }
        }
    }
}
