package by.guzypaul.branchingandloop.service.loop;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class SequenceCalcTest {
    SequenceCalc sequenceCalc = new SequenceCalc();

    @DataProvider(name = "addNumbersData")
    public Object[][] createData() {
        return new Object[][]{
        };
    }

    @Test(dataProvider = "addNumbersData")
    public void testFindMultiplicationMembersOfSequence(double[] dataList, double expectedResult) {
        double actual = sequenceCalc.findMultiplicationMembersOfSequence (dataList);
        assertEquals(actual, expectedResult);
    }
}
