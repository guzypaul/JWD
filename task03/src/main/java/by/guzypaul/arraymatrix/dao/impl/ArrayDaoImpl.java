package by.guzypaul.arraymatrix.dao.impl;

import by.guzypaul.arraymatrix.dao.ArrayDao;
import by.guzypaul.arraymatrix.dao.exception.DaoException;
import by.guzypaul.arraymatrix.dao.reader.StringFromTextFileReader;

public class ArrayDaoImpl implements ArrayDao {
    @Override
    public void getData() throws DaoException {

        StringFromTextFileReader reader = new StringFromTextFileReader();

    } //TODO Array reader
}
