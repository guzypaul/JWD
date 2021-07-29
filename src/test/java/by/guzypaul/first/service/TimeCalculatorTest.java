package by.guzypaul.first.service;

import by.guzypaul.first.entity.Time;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class TimeCalculatorTest {

    @DataProvider(name = "addTimeData")
    public Object[][] addTimeData() {
        return new Object[][]{
                {new Time(0,0,0), new Time(0,0,0), new Time(0,0,0)},
                {new Time(1,1,1), new Time(1,1,1), new Time(2,2,2)},
                {new Time(23,59,59), new Time(23,59,59), new Time(23,59,58)},
                {new Time(23,0,0), new Time(1,0,0), new Time(0,0,0)},
                {new Time(0,30,0), new Time(0,30,0), new Time(1,0,0)},
                {new Time(0,0,30), new Time(0,0,30), new Time(0,1,0)},
        };
    }

    @Test (dataProvider = "addTimeData")
    public void testAddTime(Time testTime, Time interval, Time expectedResult) {
        TimeCalculator calculator = new TimeCalculator();
        calculator.addTime(testTime, interval);
        assertEquals(testTime, expectedResult);
    }
}
