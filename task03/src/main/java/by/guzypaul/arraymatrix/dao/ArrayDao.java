package by.guzypaul.arraymatrix.dao;

import by.guzypaul.arraymatrix.dao.exception.DaoException;
import by.guzypaul.arraymatrix.entity.exception.ArrayException;

import java.util.List;

public interface ArrayDao {
    int[] getData() throws DaoException, ArrayException;
}
