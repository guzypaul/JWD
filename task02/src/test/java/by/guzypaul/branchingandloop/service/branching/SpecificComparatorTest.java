package by.guzypaul.branchingandloop.service.branching;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Arrays;

import static org.testng.AssertJUnit.assertEquals;

public class SpecificComparatorTest {
    SpecificComparator specificComparator = new SpecificComparator();
    private static final Logger logger = LogManager.getLogger();

    @DataProvider(name = "addSpecificComparatorData")
    public Object[][] createAddSpecificComparatorDataData() {
        return new Object[][]{
                {new int[]{2,2}, new int[]{0,0}},
                {new int[]{1,1}, new int[]{0,0}},
                {new int[]{2,1}, new int[]{2,2}},
                {new int[]{1,2}, new int[]{2,2}},
                {new int[]{-2,-2}, new int[]{0,0}},
                {new int[]{-2,1}, new int[]{1,1}},
                {new int[]{2,-1}, new int[]{2,2}},
                {new int[]{100,5}, new int[]{100,100}},
                {new int[]{100,5}, new int[]{100,100}},
                {new int[]{2,5000}, new int[]{5000,5000}}
        };
    }

    @Test(dataProvider = "addSpecificComparatorData")
    public void testNumberComparator(int[] arrayOfNumbers,int[] expectedResult) {
        int[] actual = specificComparator.compareAndChangeNumbers(arrayOfNumbers);
        Assert.assertTrue(Arrays.equals(actual, expectedResult));
    }
}
