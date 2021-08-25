package by.guzypaul.arraymatrix.dao;

import by.guzypaul.arraymatrix.dao.exception.DaoException;
import by.guzypaul.arraymatrix.entity.MatrixEntity;

public interface MatrixDao{
        MatrixEntity getData() throws DaoException;
}
