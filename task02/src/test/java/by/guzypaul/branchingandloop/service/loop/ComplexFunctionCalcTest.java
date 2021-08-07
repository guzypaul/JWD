package by.guzypaul.branchingandloop.service.loop;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;

import static org.testng.AssertJUnit.assertEquals;

public class ComplexFunctionCalcTest {
    //private static final double DELTA = 0.001;
    ComplexFunctionCalc complexFunctionCalc = new ComplexFunctionCalc();
    @DataProvider(name = "addNumbersData")
    public Object[][] createData() {
        return new Object[][]{
                //{1,7,3,new ArrayList[]{3,6}}
                //List<Integer> list = new ArrayList<>();

        };
    }

    @Test(dataProvider = "addNumbersData")
    public void testFindMaxAmongMin(double startPoint, double finishPoint, double step, ArrayList expectedResult) {
        ArrayList actual = complexFunctionCalc.findFunctionValue(startPoint, finishPoint, step);
        assertEquals(actual, expectedResult);
    }
}
