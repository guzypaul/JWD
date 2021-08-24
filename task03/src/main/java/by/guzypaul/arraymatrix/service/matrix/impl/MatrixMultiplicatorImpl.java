package by.guzypaul.arraymatrix.service.matrix.impl;

import by.guzypaul.arraymatrix.entity.MatrixEntity;
import by.guzypaul.arraymatrix.entity.exception.MatrixException;
import by.guzypaul.arraymatrix.service.matrix.MatrixMultiplicator;

public class MatrixMultiplicatorImpl implements MatrixMultiplicator {
    @Override
    public MatrixEntity multiply(MatrixEntity p, MatrixEntity q) throws MatrixException {
        int v = p.getVerticalSize();
        int h = q.getHorizontalSize();
        int controlSize = p.getHorizontalSize();
        if (controlSize != q.getVerticalSize()) {
            throw new MatrixException("incompatible matrices");
        }
        MatrixEntity result = new MatrixEntity(v, h);
        try {
            for (int i = 0; i < v; i++) {
                for (int j = 0; j < h; j++) {
                    int value = 0;
                    for (int k = 0; k < controlSize; k++) {
                        value += p.getElement(i, k) * q.getElement(k, j);
                    }
                    result.setElement(i, j, value);
                }
            }
        } catch (MatrixException e) {
        // log: exception impossible
        }
        return result;
    }
}
