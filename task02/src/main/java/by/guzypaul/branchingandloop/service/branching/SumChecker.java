package by.guzypaul.branchingandloop.service.branching;

/**
 * @author Guzy Paul
 * Task32 (branching): find positive sum of pairs from three number;
 */

public class SumChecker {

    private final int numberOfParameters = 3;
    private double[] sumArray = new double[numberOfParameters];

    /**
     * @param numberTwo, numberTwo, numberThree;
     * @return array of sum of pairs numbers;
     */
    public void findSumEveryPairs(double numberOne, double numberTwo, double numberThree) {
        sumArray[0] = numberOne + numberTwo;
        sumArray[1] = numberOne + numberThree;
        sumArray[2] = numberTwo + numberThree;
    }

    /**
     * @param sumArray of sum of pairs numbers;
     * @return boolean result;
     */
    public boolean findPositiveSum(double[] sumArray) {
        boolean result = false;
        for (double item : sumArray) {
            if (item > 0) {
                result = true;
                break;
            }
        }
        return result;
    }
}
