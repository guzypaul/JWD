package by.guzypaul.arraymatrix.dao.impl;

import by.guzypaul.arraymatrix.dao.ArrayDao;
import by.guzypaul.arraymatrix.dao.creator.ArrayCreator;
import by.guzypaul.arraymatrix.dao.exception.DaoException;

public class ArrayDaoImpl implements ArrayDao {
    @Override
    public int[] getData() throws DaoException {
        ArrayCreator arrayCreator = new ArrayCreator();
        int[] newArray = arrayCreator.createCustomArraysFromFile("src/data/array.txt");
        return newArray;
    }
}
