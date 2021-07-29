package by.guzypaul.first.service;

import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertEquals;

public class ArithmeticCalcTest {

    ArithmeticCalc calculator = new ArithmeticCalc();

    @Test
    public void testFindArithmeticMeanOfCubes() {
        double numberOneFromUser = 2;
        double numberTwoFromUser = 3;
        double expectedResult = 17.5;
        double actualResult = calculator.findArithmeticMeanOfCubes(numberOneFromUser,numberTwoFromUser);
        assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testFindGeometricMeanOfModules() {
        double expectedResult = 4;
        double actualResult = calculator.findGeometricMeanOfModules(10,6);
        assertEquals(actualResult,expectedResult);
    }
}
