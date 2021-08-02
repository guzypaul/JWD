package by.guzypaul.branchingandloop.service.branching;

/**
 * @author Guzy Paul
 * Task02 (branching): compare two numbers;
 */

public class NumComparator {
    private String positive = "yes";
    private String negative = "no";

    /**
     * @param numberTwo, numberTwo;
     * @return positive or negative String answer;
     */
    public String numberComparator(int numberOne, int numberTwo) {
        if (numberOne < numberTwo) {
            return positive;
        }
        return negative;
    }
}
