package by.guzypaul.branchingandloop.service.branching;

/**
 * @author Guzy Paul
 * Task07 (branching): find expression module of a*x*x + b*x + с;
 */
public class FunctionCalc {
    private double functionResult;
    private final int QUADRATE = 2;

    /**
     * @param a, b, с ,x;
     * @return result of function (a*x*x + b*x + с) ;
     */
    public double functionCalculator(double a, double b, double c, double x) {
        functionResult = Math.abs(a * Math.pow(x, QUADRATE) + (b * x) + c);
        return functionResult;
    }
}
