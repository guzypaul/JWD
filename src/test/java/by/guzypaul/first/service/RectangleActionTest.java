package by.guzypaul.first.service;

import by.guzypaul.first.entity.Rectangle;
import by.guzypaul.first.entity.Time;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertEquals;

public class RectangleActionTest {

    RectangleAction calc = new RectangleAction();

    @DataProvider(name = "addCalcData")
    public Object[][] addCalcData() {
        return new Object[][]{
                {7,98},
                {1,2},
                {1.5,4.5},
                {1,2}
        };
    }

    @Test (dataProvider = "addCalcData")
    public void testFindSquare(double width, double expectedResult) {
        Rectangle rectangle = new Rectangle(width);
        double actualResult = calc.findSquare(rectangle);
        assertEquals(actualResult,expectedResult);
    }
}

