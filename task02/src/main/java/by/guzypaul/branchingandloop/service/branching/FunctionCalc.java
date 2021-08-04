package by.guzypaul.branchingandloop.service.branching;

/**
 * @author Guzy Paul
 * Task07 (branching): find expression module of a*x*x + b*x + с;
 */
public class FunctionCalc {
    private final int QUADRATE;
    private double a;
    private double b;
    private double c;
    private double x;

    public FunctionCalc() {
        QUADRATE = 2;
    }

    /**
     * @param a, b, с, x - arguments for function;
     * @return result of function (a*x*x + b*x + с) ;
     */
    public double functionCalculator(double a, double b, double c, double x) {
        double functionResult;
        functionResult = Math.abs(a * Math.pow(x, QUADRATE) + (b * x) + c);
        return functionResult;
    }
}
