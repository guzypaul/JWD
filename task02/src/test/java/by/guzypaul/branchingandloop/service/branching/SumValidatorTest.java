package by.guzypaul.branchingandloop.service.branching;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertEquals;
import static org.testng.internal.junit.ArrayAsserts.assertArrayEquals;

public class SumValidatorTest {
    private static final double DELTA = 0.001;
    SumValidator sumValidator = new SumValidator();

    @DataProvider(name = "findSumEveryPairsData")
    public Object[][] findSumEveryPairs() {
        return new Object[][]{
                {new double[]{1,2,3}, new double[]{3,4,5}},
                {new double[]{0,0,0}, new double[]{0,0,0}},
                {new double[]{0,0,3}, new double[]{0,3,3}},
                {new double[]{0,2,0}, new double[]{2,0,2}},
                {new double[]{1,0,0}, new double[]{1,1,0}},
                {new double[]{-1,-2,-3}, new double[]{-3,-4,-5}},
                {new double[]{-1,2,3}, new double[]{1,2,5}},
                {new double[]{1,-2,3}, new double[]{-1,4,1}},
                {new double[]{1,2,-3}, new double[]{3,-2,-1}}
        };
    }

    @Test(dataProvider = "findSumEveryPairsData")
    public void testfindSumEveryPairs(double[] arrayOfNumbers,double[] expectedResult) {
        double[] actual = sumValidator.findSumEveryPairs(arrayOfNumbers[0], arrayOfNumbers[1], arrayOfNumbers[2]);
        assertArrayEquals(actual, expectedResult, DELTA);
    }

    @DataProvider(name = "addFindPositiveSumData")
    public Object[][] findPositiveSumData() {
        return new Object[][]{
                {new double[]{1,2,3}, true},
                {new double[]{-1,-2,3}, true},
                {new double[]{1,-2,-3}, true},
                {new double[]{-1,2,-3}, true},
                {new double[]{0,0,3}, true},
                {new double[]{0,3,0}, true},
                {new double[]{3,0,0}, true},
                {new double[]{0,0,0}, false},
                {new double[]{-1,-2,-3}, false},
        };
    }

    @Test(dataProvider = "addFindPositiveSumData")
    public void testFindPositiveSum(double[] arrayOfSum,boolean expectedResult) {
        boolean actual = sumValidator.findPositiveSum(arrayOfSum);
        assertEquals(actual, expectedResult);
    }
}
