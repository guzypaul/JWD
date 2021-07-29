package by.guzypaul.first.service;

import by.guzypaul.first.entity.Time;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertEquals;

public class ExponentiationTest {

    /*@Test
    public void testFindArithmeticMeanOfCubes() {

        double numberFromUser = 7;
        calc.raisingNumberToPower(numberFromUser);

        double expectedResultInEightPower = 117649;
        double actualResultInEightPower = calc.getNumInEightPower();
        assertEquals(actualResultInEightPower, expectedResultInEightPower);

        double expectedResultInTenPower = 5764801;
        double actualResultInTenPower = calc.getNumInTenPower();
        assertEquals(actualResultInTenPower, expectedResultInTenPower);
    }*/

    @DataProvider(name = "raisingNumberToPowerData")
    public Object[][] raisingNumberToPowerData() {
        return new Object[][]{
                {7,117649,5764801},
                {1,1,1},
                {2,64,256},
                {-1,1,1},
                {0,0,0},
        };
    }

    @Test (dataProvider = "raisingNumberToPowerData")
    public void testRaisingNumberToPower(double numberToPower, double numInEightPower, double numInTenPower ) {
        Exponentiation actualResult = new Exponentiation();
        actualResult.raisingNumberToPower(numberToPower);
        Exponentiation expectedResult = new Exponentiation();
        expectedResult.setNumInEightPower(numInEightPower);
        expectedResult.setNumInTenPower(numInTenPower);
        assertEquals(actualResult, expectedResult);
    }
}
