package by.guzypaul.arraymatrix.dao;

import by.guzypaul.arraymatrix.dao.exception.DaoException;

public interface MatrixDao{
        int[][]  getDataOne() throws DaoException;
        int[][]  getDataTwo() throws DaoException;
}
