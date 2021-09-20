package by.guzypaul.multitreading.dao.impl;

import by.guzypaul.multitreading.dao.MatrixDao;
import by.guzypaul.multitreading.entity.Matrix;

public class MatrixDaoImpl implements MatrixDao {
    private Matrix parseMatrix;

    public MatrixDaoImpl() {
        parseMatrix = readMatrix();
    }

    @Override
    public Matrix findMatrix() {
        return parseMatrix;
    }

    public Matrix readMatrix(){
        //TODO
    }
}
