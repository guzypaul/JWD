package by.guzypaul.arraymatrix.dao;

import by.guzypaul.arraymatrix.dao.impl.ArrayDaoImpl;
import by.guzypaul.arraymatrix.dao.impl.MatrixDaoImpl;

public final class DaoFactory {
    private static final DaoFactory instance = new DaoFactory();

    /*private final ArrayDao arrayImpl = new ArrayDaoImpl();
    private final MatrixDao matrixImpl = new MatrixDaoImpl();

    private DaoFactory(){}
    public static DaoFactory getInstance(){
        return instance;
    }
    public ArrayDao getArrayDAO(){
        return arrayImpl;
    }
    public MatrixDao getMatrixDAO(){
        return matrixImpl;
    }*/
}
