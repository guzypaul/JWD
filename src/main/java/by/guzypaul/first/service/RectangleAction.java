package by.guzypaul.first.service;

/**
 * Task07
 * Дан прямоугольник, ширина которого в два раза меньше длины. Найти его
 * площадь. (пользователь вводит ширину или длину).
 *
 */

public class RectangleAction {

    public double findSquareByWidth(double width) {
        double square = 2 * Math.pow(width, 2);
        return square;
    }
}
