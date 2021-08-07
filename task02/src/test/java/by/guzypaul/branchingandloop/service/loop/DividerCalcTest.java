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

        ArrayList<Integer> dividerListFor4 = new ArrayList<>();
        dividerListFor4.add(2);
        ArrayList<Integer> dividerListFor6 = new ArrayList<>();
        dividerListFor6.add(2);
        dividerListFor6.add(3);
        ArrayList<Integer> dividerListFor8 = new ArrayList<>();
        dividerListFor8.add(2);
        dividerListFor8.add(4);
        ArrayList<Integer> dividerListFor9 = new ArrayList<>();
        dividerListFor9.add(3);
        ArrayList<Integer> dividerListFor10 = new ArrayList<>();
        dividerListFor10.add(2);
        dividerListFor10.add(5);

        HashMap<Integer, ArrayList> dataMap1 = new HashMap<>();
        dataMap1.put(4, dividerListFor4);

        HashMap<Integer, ArrayList> dataMap2 = new HashMap<>();
        dataMap2.put(6, dividerListFor6);

        HashMap<Integer, ArrayList> dataMap3 = new HashMap<>();
        dataMap3.put(4, dividerListFor4);
        dataMap3.put(6, dividerListFor6);

        HashMap<Integer, ArrayList> dataMap4 = new HashMap<>();
        dataMap4.put(4, dividerListFor4);
        dataMap4.put(6, dividerListFor6);
        dataMap4.put(8, dividerListFor8);
        dataMap4.put(9, dividerListFor9);
        dataMap4.put(10, dividerListFor10);

        return new Object[][]{
                {new int[]{4, 5}, dataMap1},
                {new int[]{5, 7}, dataMap2},
                {new int[]{3, 7}, dataMap3},
                {new int[]{1, 11}, dataMap4}
        };
    }

    @Test(dataProvider = "addNumbersData")
    public void testFindAllDividers(int[] arrayOfPoints, HashMap<Integer, ArrayList> expectedResult) {
        HashMap<Integer, ArrayList> actual = dividerCalc.findAllDividers(arrayOfPoints);
        assertEquals(actual, expectedResult);
    }
}
