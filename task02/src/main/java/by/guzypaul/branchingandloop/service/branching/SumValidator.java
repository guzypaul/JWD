package by.guzypaul.branchingandloop.service.branching;

/**
 * @author Guzy Paul
 * Task32 (branching): find positive sum of numbers pairs from three number;
 */

public class SumValidator {
    /**
     * @param numberTwo, numberTwo, numberThree - numbers for finding sum of every pairs;
     * @return array of sum of pairs numbers;
     */
    public double[] findSumEveryPairs(double numberOne, double numberTwo, double numberThree) {
        int numberOfParameters = 3;
        double[] sumArray = new double[numberOfParameters];
        sumArray[0] = numberOne + numberTwo;
        sumArray[1] = numberOne + numberThree;
        sumArray[2] = numberTwo + numberThree;
        return sumArray;
    }

    /**
     * @param sumArray of sum of pairs numbers;
     * @return result - show: positive sum exists or no;
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
