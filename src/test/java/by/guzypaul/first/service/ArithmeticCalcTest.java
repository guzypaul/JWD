package by.guzypaul.first.service;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class ArithmeticCalcTest {

    ArithmeticCalc calculator = new ArithmeticCalc();

    @DataProvider(name = "positiveDataForFindArithmeticMeanOfCubes")
    public Object[][] createPositiveDataForFindArithmeticMeanOfCubes() {
        return new Object[][]{
                {0, 0, 0},
                {0, 3, 13.5},
                {3, 0, 13.5},
                {1, 3, 14},
                {3, 1, 14},
                {-1, 3, 13},
                {-3, 1, -13},
                {1.1, 3.1, 15.561000000000002},
                {3.1, 1.1, 15.561000000000002},
        };
    }

    @Test(dataProvider = "positiveDataForFindArithmeticMeanOfCubes")
    public void testFindArithmeticMeanOfCubes(double arg1, double arg2, double expectedResult) {
        double actual = calculator.findArithmeticMeanOfCubes(arg1, arg2);
        assertEquals(actual, expectedResult);
    }

    @DataProvider(name = "positiveDataForFindGeometricMeanOfModules")
    public Object[][] createPositiveDataForFindGeometricMeanOfModules() {
        return new Object[][]{
                {0, 0, 0},
                {0, 1, 1},
                {1, 0, 1},
                {-1, 3, 2},
                {-3, 1, 2},
                {-1, -3, 2},
                {3, 1, 2},
                {1.5, 2.5, 2},
        };
    }
    @Test(dataProvider = "positiveDataForFindGeometricMeanOfModules")
    public void testFindGeometricMeanOfModules(double arg1, double arg2, double expectedResult){
        double actual = calculator.findGeometricMeanOfModules(arg1, arg2);
        assertEquals(actual, expectedResult);
    }
}
