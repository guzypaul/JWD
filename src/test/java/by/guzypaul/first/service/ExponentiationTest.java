package by.guzypaul.first.service;

import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertEquals;

public class ExponentiationTest {
    Exponentiation calc = new Exponentiation();

    @Test
    public void testFindArithmeticMeanOfCubes() {

        double numberFromUser = 7;
        calc.raisingNumberToPower(numberFromUser);

        double expectedResultInEightPower = 117649;
        double actualResultInEightPower = calc.getNumInEightPower();
        assertEquals(actualResultInEightPower, expectedResultInEightPower);

        double expectedResultInTenPower = 5764801;
        double actualResultInTenPower = calc.getNumInTenPower();
        assertEquals(actualResultInTenPower, expectedResultInTenPower);
    }
}
