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
        ArrayList<Double> resultArray01 = new ArrayList<>();
        resultArray01.add(3.0);
        resultArray01.add(4.0);
        resultArray01.add(5.0);
        resultArray01.add(6.0);
        resultArray01.add(7.0);

        ArrayList<Double> resultArray02 = new ArrayList<>();
        resultArray02.add(-1.0);
        resultArray02.add(-2.0);
        resultArray02.add(3.0);
        resultArray02.add(4.0);

        ArrayList<Double> resultArray03 = new ArrayList<>();
        resultArray03.add(-2.0);
        resultArray03.add(22.0);
        resultArray03.add(42.0);
        resultArray03.add(62.0);

        ArrayList<Double> resultArray04 = new ArrayList<>();
        resultArray04.add(5.0);
        resultArray04.add(4.0);
        resultArray04.add(3.0);
        resultArray04.add(2.0);
        resultArray04.add(1.0);

        Object[][] objects = {
                {3, 7, 1, resultArray01},
                {1, 4, 1, resultArray02},
                {2, 80, 20, resultArray03},
                {-5, -1, 1, resultArray04}
        };
        return objects;
    }

    @Test(dataProvider = "addNumbersData")
    public void testFindFunctionValue(double startPoint, double finishPoint, double step, ArrayList<Double> expectedResult) {
        ArrayList<Double> actual = complexFunctionCalc.findFunctionValue(startPoint, finishPoint, step);
        assertEquals(actual, expectedResult);
    }
}
