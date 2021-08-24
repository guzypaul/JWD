package by.guzypaul.arraymatrix.dao.impl;

import by.guzypaul.arraymatrix.dao.MatrixDao;
import by.guzypaul.arraymatrix.dao.exception.DaoException;
import by.guzypaul.arraymatrix.dao.reader.StringFromTextFileReader;

public class MatrixDaoImpl implements MatrixDao {

    @Override
    public void getData() throws DaoException {

        StringFromTextFileReader reader = new StringFromTextFileReader();
    //TODO matrix reader
    }
}
