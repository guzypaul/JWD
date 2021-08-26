package by.guzypaul.arraymatrix.service.matrix.impl;

import by.guzypaul.arraymatrix.dao.MatrixDao;
import by.guzypaul.arraymatrix.dao.exception.DaoException;
import by.guzypaul.arraymatrix.dao.factory.DaoFactory;
import by.guzypaul.arraymatrix.entity.MatrixEntity;
import by.guzypaul.arraymatrix.entity.exception.MatrixException;
import by.guzypaul.arraymatrix.service.exception.ServiceException;
import by.guzypaul.arraymatrix.service.matrix.MatrixSubtraction;

public class MatrixSubtractionImpl implements MatrixSubtraction {
    @Override
    public MatrixEntity substract() throws MatrixException, ServiceException {
        MatrixEntity matrixOne = null;
        MatrixEntity matrixTwo = null;

        DaoFactory daoObjectFactory = DaoFactory.getInstance();
        MatrixDao matrixDao = daoObjectFactory.getMatrixDaoImpl();

        try{
            matrixOne = new MatrixEntity(matrixDao.getDataOne());
            matrixTwo = new MatrixEntity(matrixDao.getDataTwo());
        }catch(DaoException e) {
            throw new ServiceException(e);
        }

        int verticalSize = matrixOne.getVerticalSize();
        int horizontalSize = matrixTwo.getHorizontalSize();

        MatrixEntity result = new MatrixEntity(verticalSize, horizontalSize);
        for (int i = 0; i < result.getVerticalSize(); i++) {
            for (int j = 0; j < result.getHorizontalSize(); j++) {
                result.setElement(i, j, matrixOne.getElement(i, j) - matrixTwo.getElement(i, j));
            }
        }

        return result;
    }
}
