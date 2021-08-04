package by.guzypaul.branchingandloop.service.branching;

/**
 * @author Guzy Paul
 * Task02 (branching): compare if number one less than number two;
 */

public class NumComparator {
    private final String POSITIVE = "yes";
    private final String NEGATIVE = "no";

    /**
     * @param numberTwo, numberTwo - numbers for comparison;
     * @return positive or negative result of comparison two numbers;
     */
    public String numberComparator(int numberOne, int numberTwo) {
        if (numberOne < numberTwo) {
            return POSITIVE;
        }
        return NEGATIVE;
    }
}
