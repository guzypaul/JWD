package by.guzypaul.first.service;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertEquals;

public class FunctionCalcTest {

    FunctionCalc functionCalc = new FunctionCalc();

    @DataProvider(name = "positiveDataForFunctionCalc")
    public Object[][] createPositiveDataForFunctionCalc(){
        return new Object[][]{
                {3,6},
                {0,3},
                {-1,2},
                {-1000,-997},
                {100,103},
                {3.1, 6.1},
                {0.000001,3.000001}
        };
    }

    @Test(dataProvider = "positiveDataForFunctionCalc")
    public void testAdditionWithSpecificNumber (double arg1, double arg2){
        double actual = functionCalc.additionWithSpecificNumber(arg1);
        assertEquals(actual,arg2);
    }
}
