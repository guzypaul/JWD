package by.guzypaul.branchingandloop.service.loop;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.testng.AssertJUnit.assertEquals;

public class DividerCalcTest {
    DividerCalc dividerCalc = new DividerCalc();

    @DataProvider(name = "addNumbersData")
    public Object[][] createData() {
        return new Object[][]{
                {new int[]{1,20}, }


        };
    }

    @Test(dataProvider = "addNumbersData")
    public void testFindAllDividers(int[] arrayOfPoints, HashMap<Integer, ArrayList> expectedResult) {
        HashMap<Integer, ArrayList> actual = dividerCalc.findAllDividers(arrayOfPoints);
        assertEquals(actual, expectedResult);
    }
    //TODO test
}


