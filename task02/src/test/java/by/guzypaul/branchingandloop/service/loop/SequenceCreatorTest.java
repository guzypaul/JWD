package by.guzypaul.branchingandloop.service.loop;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.internal.junit.ArrayAsserts.assertArrayEquals;

public class SequenceCreatorTest {
    SequenceCreator sequenceCreator = new SequenceCreator();

    @DataProvider(name = "addNumbersData")
    public Object[][] createData() {
        return new Object[][]{
                {new int[]{5, 1}, new int[]{5, 4, 3, 2, 1}},
                {new int[]{5, -1}, new int[]{5, 4, 3, 2, 1, 0, -1}},
                {new int[]{-1, -5}, new int[]{-1, -2, -3, -4, -5}},
                {new int[]{4, 0}, new int[]{4, 3, 2, 1, 0}},
                {new int[]{0, -5}, new int[]{0, -1, -2, -3, -4, -5}},
                {new int[]{2, 1}, new int[]{2, 1}}
        };
    }

    @Test(dataProvider = "addNumbersData")
    public void testCreateDescendingSequence(int[] arrayOfNum, int[] expectedResult) {
        int[] actual = sequenceCreator.createDescendingSequence(arrayOfNum);
        assertArrayEquals(actual, expectedResult);
    }
}
