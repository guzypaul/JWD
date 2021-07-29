package by.guzypaul.first.service;

import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertEquals;

public class FunctionCalcTest {

    FunctionCalc functionCalc = new FunctionCalc();

    @Test
    public void testAddTime(){
        double numberFromUser = 7;
        double expectedResult = 10;
        double actualResult = functionCalc.additionWithSpecificNumber(numberFromUser);
        assertEquals(actualResult,expectedResult);
    }
}
