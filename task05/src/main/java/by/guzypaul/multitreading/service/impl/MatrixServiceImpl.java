package by.guzypaul.multitreading.service.impl;

import by.guzypaul.multitreading.dao.factory.DaoFactory;
import by.guzypaul.multitreading.service.MatrixService;

public class MatrixServiceImpl implements MatrixService {
    @Override
    public void matrixReset() {
        for(int i = 0; i < DaoFactory.getInstance().getMatrixDaoImpl().findMatrix().getHorizontalSize(); i++){
            DaoFactory.getInstance().getMatrixDaoImpl().setElement(i, i, 0);
        }
    }
}
