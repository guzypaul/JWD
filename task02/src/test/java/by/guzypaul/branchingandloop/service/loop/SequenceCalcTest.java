package by.guzypaul.branchingandloop.service.loop;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class SequenceCalcTest {
    private static final double DELTA = 0.001;
    SequenceCalc sequenceCalc = new SequenceCalc();

    @DataProvider(name = "addNumbersData")
    public Object[][] createData() {
        return new Object[][]{
                {new double[]{1, 1}, 1},
                {new double[]{1, 2}, 2},
                {new double[]{1, 3}, 6},
                {new double[]{1.12, 5}, 156.270},
                {new double[]{0, 5}, 0},
                {new double[]{-1,10}, 0},
                {new double[]{-2.3,4}, -0.627},

        };
    }

    @Test(dataProvider = "addNumbersData")
    public void testFindMultiplicationMembersOfSequence(double[] dataList, double expectedResult) {
        double actual = sequenceCalc.findMultiplicationMembersOfSequence(dataList);
        assertEquals(actual, expectedResult, DELTA);
    }
}
