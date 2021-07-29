package by.guzypaul.first.service;

import by.guzypaul.first.entity.Rectangle;
import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertEquals;

public class RectangleActionTest {

    RectangleAction calc = new RectangleAction();

    @Test
    public void testFindSquare (){

        double widthFromUser = 7;
        Rectangle rectangle = new Rectangle(widthFromUser);
        double expectedResult = 98;
        double actualResult = calc.findSquare(rectangle);
        assertEquals(actualResult,expectedResult);
    }
}

