package by.guzypaul.branchingandloop.service.branching;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class NumComparatorTest {
    NumComparator numComparator = new NumComparator();

    @DataProvider(name = "addNumComparatorData")
    public Object[][] createAddNumComparatorData() {
        return new Object[][]{
                {0, 0, "no"},
                {0, 1, "yes"},
                {-1, 0, "yes"},
                {-1000, -1, "yes"},
                {10, 20, "yes"},
                {10, 10, "no"},
                {10, 5, "no"},
                {-20, -100, "no"},
        };
    }

    @Test(dataProvider = "addNumComparatorData")
    public void testNumberComparator(int numberOne, int numberTwo, String expectedResult) {
        String actual = numComparator.numberComparator(numberOne, numberTwo);
        assertEquals(actual, expectedResult);
    }
}
