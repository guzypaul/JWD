package by.guzypaul.arraymatrix.service.calculator.impl;

import by.guzypaul.arraymatrix.dao.MatrixDao;
import by.guzypaul.arraymatrix.dao.exception.DaoException;
import by.guzypaul.arraymatrix.dao.factory.DaoFactory;
import by.guzypaul.arraymatrix.entity.MatrixEntity;
import by.guzypaul.arraymatrix.entity.exception.MatrixException;
import by.guzypaul.arraymatrix.service.exception.ServiceException;
import by.guzypaul.arraymatrix.service.calculator.MatrixMultiplicator;

public class MatrixMultiplicatorImpl implements MatrixMultiplicator {
    MatrixEntity matrixOne = null;
    MatrixEntity matrixTwo = null;

    @Override
    public MatrixEntity multiply() throws ServiceException, MatrixException {

        DaoFactory daoObjectFactory = DaoFactory.getInstance();
        MatrixDao matrixDao = daoObjectFactory.getMatrixDaoImpl();

        try{
            matrixOne = new MatrixEntity(matrixDao.getDataOne());
            matrixTwo = new MatrixEntity(matrixDao.getDataTwo());
        }catch(DaoException e) {
            throw new ServiceException(e);
        }

        int v = matrixOne.getVerticalSize();
        int h = matrixTwo.getHorizontalSize();
        int controlSize = matrixOne.getHorizontalSize();
        if (controlSize != matrixTwo.getVerticalSize()) {
            throw new MatrixException("incompatible matrices");
        }
        MatrixEntity result = new MatrixEntity(v, h);
        try {
            for (int i = 0; i < v; i++) {
                for (int j = 0; j < h; j++) {
                    int value = 0;
                    for (int k = 0; k < controlSize; k++) {
                        value += matrixOne.getElement(i, k) * matrixTwo.getElement(k, j);
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
