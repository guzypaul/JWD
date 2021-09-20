package by.guzypaul.multitreading.dao.parser;

import by.guzypaul.multitreading.dao.exception.DaoException;
import by.guzypaul.multitreading.entity.Matrix;

import java.util.Iterator;
import java.util.List;

public class FileDataParser {
    public Matrix parseMatrix(int minSize, int maxSize, List<String> readData) throws DaoException {
        Iterator<String> matrixDataIterator = readData.iterator();
        String[] sizes = matrixDataIterator.next().split(" ");// todo const " "
        int horizontalSize = Integer.parseInt(sizes[0]);
        int verticalSize = Integer.parseInt(sizes[1]);

        if (horizontalSize < minSize || horizontalSize > maxSize) {
            throw new DaoException("incorrect size of matrix"); //todo
        }

        int[][] matrix = new int[horizontalSize][verticalSize];

        for (int i = 0; i < horizontalSize; i++) {
            String[] matrixLine = matrixDataIterator.next().split(" ");
            for (int j = 0; j < verticalSize; j++) {
                matrix[i][j] = Integer.parseInt(matrixLine[j]);
            }
        }

        return new Matrix(matrix);
    }
}
