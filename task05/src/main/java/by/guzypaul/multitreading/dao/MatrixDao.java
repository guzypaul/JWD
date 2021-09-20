package by.guzypaul.multitreading.dao;

import by.guzypaul.multitreading.entity.Matrix;

public interface MatrixDao {
    Matrix findMatrix();
    void setElement(int i, int j, int element);
}
