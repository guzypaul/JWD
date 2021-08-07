package by.guzypaul.branchingandloop.service.branching;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class ValueComparatorTest {
    private static final double DELTA = 0.001;
    ValueComparator valueComparator = new ValueComparator();

    @DataProvider(name = "addNumbersData")
    public Object[][] createData() {
        return new Object[][]{
                {1, 2, 3, 4, 3},
                {13, 20, 3, 4, 13},
                {0, 20, 0, 4, 0},
                {-13, 20, -3, 4, -3},
                {0, 0, 0, 0, 0},
                {-13, -20, -3, -4, -4},
                {13.123123, 20.323, 3.4241, 4.42355, 13.123},
        };
    }

    @Test(dataProvider = "addNumbersData")
    public void testFindMaxAmongMin(double a, double b, double c, double d, double expectedResult) {
        double actual = valueComparator.findMaxAmongMin(a, b, c, d);
        assertEquals(actual, expectedResult, DELTA);
    }
}
