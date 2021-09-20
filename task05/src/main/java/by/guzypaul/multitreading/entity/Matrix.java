package by.guzypaul.multitreading.entity;

import java.util.Arrays;

public class Matrix {

    private int[][] matrix;

    public Matrix(int[][] newMatrix) {

        this.matrix = Arrays.stream(newMatrix)
                .map(int[]::clone)
                .toArray(int[][]::new);
    }

    public Matrix(int n, int m) throws MatrixException {
        if (n < 1 || m < 1) {// check input
            throw new MatrixException();
        }
        matrix = new int[n][m];
    }

    public int getVerticalSize() {
        return matrix.length;

    }

    public int getHorizontalSize() {

        return matrix[0].length;
    }

    public int getElement(int i, int j) throws MatrixException {
        if (checkRange(i, j)) { // check i & j
            return matrix[i][j];
        } else {
            throw new MatrixException();
        }
    }

    public void setElement(int i, int j, int value) throws MatrixException {
        if (checkRange(i, j)) {
            matrix[i][j] = value;
        } else {
            throw new MatrixException(String.format("No such element with indexes: i = %d and j = %d", i, j));
        }
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
        if (!(o instanceof Matrix)) return false;

        Matrix that = (Matrix) o;

        return Arrays.deepEquals(matrix, that.matrix);
    }

    @Override
    public int hashCode() {
        return Arrays.deepHashCode(matrix);
    }

    private boolean checkRange(int i, int j) {// check matrix range
        return (i >= 0 && i < matrix.length && j >= 0 && j < matrix[0].length);
    }
}
