package by.guzypaul.first.service;

/**
 * Task02
 * Найдите значение функции: с = 3 + a;
 */

public class FunctionCalc {

    private final int specificNumber = 3;

    public double additionWithSpecificNumber(double arg) {
        double result = specificNumber + arg;
        return result;
    }
}
