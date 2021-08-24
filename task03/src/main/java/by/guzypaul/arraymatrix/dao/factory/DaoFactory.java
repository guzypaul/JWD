package by.guzypaul.arraymatrix.dao.factory;

import by.guzypaul.arraymatrix.dao.ArrayDao;
import by.guzypaul.arraymatrix.dao.MatrixDao;
import by.guzypaul.arraymatrix.dao.impl.ArrayDaoImpl;
import by.guzypaul.arraymatrix.dao.impl.MatrixDaoImpl;

public final class DaoFactory {
    private static final DaoFactory instance = new DaoFactory();

    private final ArrayDao arrayDaoImpl = new ArrayDaoImpl();
    private final MatrixDao matrixDaoImpl = new MatrixDaoImpl();

    private DaoFactory(){}
    public static DaoFactory getInstance(){
        return instance;
    }
    public ArrayDao getArrayDaoImpl(){
        return arrayDaoImpl;
    }
    public MatrixDao getMatrixDaoImpl(){
        return matrixDaoImpl;
    }

}
