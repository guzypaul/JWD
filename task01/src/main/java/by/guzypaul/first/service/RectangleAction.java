package by.guzypaul.first.service;

import by.guzypaul.first.entity.Rectangle;

/**
 * Task07
 * Дан прямоугольник, ширина которого в два раза меньше длины. Найти его
 * площадь. (пользователь вводит ширину или длину).
 */

public class RectangleAction {

    public double findSquare(Rectangle rectangle) {
        double square = rectangle.getWidth() * rectangle.getLength();
        return square;
    }
}
