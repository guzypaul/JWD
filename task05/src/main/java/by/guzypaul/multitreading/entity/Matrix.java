package by.guzypaul.multitreading.entity;

import java.math.BigDecimal;
import java.util.Arrays;

public class Matrix {

    private int[][] matrix;

    public Matrix(int[][] newMatrix) {

        this.matrix = Arrays.stream(newMatrix)
                .map(int[]::clone)
                .toArray(int[][]::new);
    }

    public Matrix(int n, int m)  {
        matrix = new int[n][m];
    }

    public int getVerticalSize() {
        return matrix.length;

    }

    public int getHorizontalSize() {
        return matrix[0].length;
    }

    public int getElement(int i, int j) {
            return matrix[i][j];
    }

    public void setElement(int i, int j, int value) {
        matrix[i][j] = value;
    }

    @Override
    public String toString() {
        final String BLANK = " ";
        StringBuilder s = new StringBuilder("\nMatrix : " + matrix.length + "x"
                + matrix[0].length + "\n");
        for (int[] row : matrix) {
            for (int value : row) {
                s.append(value).append(BLANK);
            }
            s.append("\n");
        }
        return s.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Matrix matrix1 = (Matrix) o;
        return matrix1.getVerticalSize() == this.getVerticalSize()
                && matrix1.getHorizontalSize() == this.getHorizontalSize() && compareMatrices(matrix1);
    }

    @Override
    public int hashCode() {
        return Arrays.deepHashCode(matrix);
    }

    private boolean compareMatrices(Matrix matrix) {
        for (int i = 0; i < matrix.getHorizontalSize(); i++) {
            for (int j = 0; j < matrix.getVerticalSize(); j++) {
                if (matrix.getElement(i, j) != this.getElement(i, j)) {
                    return false;
                }
            }
        }

        return true;
    }

//    private boolean checkRange(int i, int j) {// check matrix range
//        return (i >= 0 && i < matrix.length && j >= 0 && j < matrix[0].length);
//    }
}
