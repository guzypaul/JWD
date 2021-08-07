package by.guzypaul.branchingandloop.service.loop;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class SequenceCreatorTest {
    SequenceCreator sequenceCreator = new SequenceCreator();

    @DataProvider(name = "addNumbersData")
    public Object[][] createData() {
        return new Object[][]{
        };
    }

    @Test(dataProvider = "addNumbersData")
    public void testCreateDescendingSequence(int[] arrayOfNum, int[] expectedResult) {
        int[] actual = sequenceCreator.createDescendingSequence(arrayOfNum);
        assertEquals(actual, expectedResult);
    }
}
