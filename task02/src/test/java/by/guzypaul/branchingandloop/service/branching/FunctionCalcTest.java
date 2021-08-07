package by.guzypaul.branchingandloop.service.branching;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class FunctionCalcTest {
    private static final double DELTA = 0.001;
    FunctionCalc functionCalc = new FunctionCalc();

    @DataProvider(name = "addFunctionCalcData")
    public Object[][] createAddFunctionCalcData() {
        return new Object[][]{
                {0, 0, 0, 0, 0},
                {1.5, 1.5, 1.5, 1.25, 5.718},
                {1, 1, 1, 1, 3},
                {0, 1, 1, 1, 2},
                {1, 0, 1, 1, 2},
                {1, 1, 0, 1, 2},
                {1, 1, 1, 0, 1},
                {-1, 1, 1, 1, 1},
                {1, -1, 1, 1, 1},
                {1, 1, -1, 1, 1},
                {1, 1, 1, -1, 1},
                {2.489, 13.435, 0.323, -0.00013, 0.321}
        };
    }

    @Test(dataProvider = "addFunctionCalcData")
    public void testFunctionCalculator(double a, double b, double c, double x, double expectedResult) {
        double actual = functionCalc.functionCalculator(a, b, c, x);
        assertEquals(actual, expectedResult, DELTA);
    }
}
