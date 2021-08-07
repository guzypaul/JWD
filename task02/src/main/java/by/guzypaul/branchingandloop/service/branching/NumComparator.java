package by.guzypaul.branchingandloop.service.branching;

/**
 * @author Guzy Paul
 * Task02 (branching): compare if number one less than number two;
 */
public class NumComparator {
    /**
     * @param numberTwo, numberTwo - numbers for comparison;
     * @return positive or negative result of comparison two numbers;
     */
    public String numberComparator(int numberOne, int numberTwo) {
        final String POSITIVE = "yes";
        final String NEGATIVE = "no";
        return (numberOne < numberTwo) ? POSITIVE : NEGATIVE;
    }
}
