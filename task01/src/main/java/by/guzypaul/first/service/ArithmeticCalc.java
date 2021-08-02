package by.guzypaul.first.service;
/**
 * Task17
 *
 * Даны два числа. Найти среднее арифметическое кубов этих чисел и среднее
 * геометрическое модулей этих чисел.
 *
 */

public class ArithmeticCalc {

    private final static int CUBE = 3;
    private final static int DENOMINATOR = 2;

    public double findArithmeticMeanOfCubes(double arg1, double arg2) {
        double arithmeticMeanOfCubes = (Math.pow(arg1, CUBE) + Math.pow(arg2, CUBE)) / DENOMINATOR;
        return arithmeticMeanOfCubes;
    }

    public double findGeometricMeanOfModules(double arg1, double arg2) {
        double geometricMeanOfModules = Math.sqrt(Math.abs(arg1) + Math.abs(arg2));
        return geometricMeanOfModules;
    }
}
