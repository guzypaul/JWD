package by.guzypaul.branchingandloop.service.branching;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

/**
 * @author Guzy Paul
 * Task17 (branching): compare two numbers (int m,int n). if n!=m -> n = max(n,m), m = max(n,m);
 * if n==m -> n = 0, m = 0;
 */

public class SpecificComparator {
    private static final Logger logger = LogManager.getLogger();
    /**
     * @param arrayOfNumbers that contains m & n - numbers for comparison and changing;
     * @return resultList - variable with value;
     */
    public int[] compareAndChangeNumbers(int[] arrayOfNumbers) {
        logger.log(Level.INFO, "Income data: " + Arrays.toString(arrayOfNumbers));
        int m = arrayOfNumbers[0];
        int n = arrayOfNumbers[1];
        int[] resultArray = new int[2]; //???? 2 - magic number????
        if (m != n) {
            resultArray[0] = Math.max(m, n);
            resultArray[1] = Math.max(m, n);
        } else {
            resultArray[0] = 0;
            resultArray[1] = 0;
        }
        logger.log(Level.INFO, "Result: " + Arrays.toString(resultArray));
        return resultArray;
    }
}
