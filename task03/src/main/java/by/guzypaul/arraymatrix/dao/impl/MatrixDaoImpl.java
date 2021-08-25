package by.guzypaul.arraymatrix.dao.impl;

import by.guzypaul.arraymatrix.dao.MatrixDao;
import by.guzypaul.arraymatrix.dao.exception.DaoException;
import by.guzypaul.arraymatrix.dao.reader.StringFromTextFileReader;
import by.guzypaul.arraymatrix.entity.MatrixEntity;

public class MatrixDaoImpl implements MatrixDao {

    @Override
    public MatrixEntity getData() throws DaoException {
        MatrixEntity newMatrix = null;
        StringFromTextFileReader reader = new StringFromTextFileReader();
        //reader.readStringsFromFile(String filePath);

        return newMatrix;
    //TODO matrix reader
    }
}
