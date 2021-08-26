package by.guzypaul.arraymatrix.dao.impl;

import by.guzypaul.arraymatrix.dao.MatrixDao;
import by.guzypaul.arraymatrix.dao.creator.MatrixCreator;
import by.guzypaul.arraymatrix.dao.exception.DaoException;

public class MatrixDaoImpl implements MatrixDao {

        int[][] newMatrix = null;

        @Override
        public int[][] getDataOne() throws DaoException{
            MatrixCreator matrixCreator = new MatrixCreator();
            int[][] newMatrix = matrixCreator.createCustomMatrixFromFile("src/data/matrixOne.txt");
            return newMatrix;
        }

         @Override
        public int[][] getDataTwo() throws DaoException{
             MatrixCreator matrixCreator = new MatrixCreator();
            int[][] newMatrix = matrixCreator.createCustomMatrixFromFile("src/data/matrixTwo.txt");
            return newMatrix;
        }
}
