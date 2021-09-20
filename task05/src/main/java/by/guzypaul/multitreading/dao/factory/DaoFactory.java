package by.guzypaul.multitreading.dao.factory;

import by.guzypaul.multitreading.dao.MatrixDao;
import by.guzypaul.multitreading.dao.impl.MatrixDaoImpl;

public class DaoFactory {
    private static final DaoFactory instance = new DaoFactory();
    private MatrixDao matrixDao;

    private DaoFactory() {
        matrixDao = new MatrixDaoImpl();
    }

    public static DaoFactory getInstance() {
        return instance;
    }

    public MatrixDao getMatrixDaoImpl() {
        return matrixDao;
    }
}
