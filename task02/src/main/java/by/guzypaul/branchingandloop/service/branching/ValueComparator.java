package by.guzypaul.branchingandloop.service.branching;

/**
 * @author Guzy Paul
 * Task27 (branching): find max{min(a,b), minc(c,d))};
 */

public class ValueComparator {

    /**
     * @param a, b, с ,d;
     * @return result of max{min(a,b), minc(c,d))};
     */
    public double findMaxAmongMin(double a, double b, double c, double d) {
        double result = Math.max((Math.min(a, b)), Math.min(c, d));
        return result;
    }
}