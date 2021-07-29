package by.guzypaul.first.service;

import by.guzypaul.first.entity.Time;
import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertEquals;

public class TimeCalculatorTest {

    TimeCalculator calc = new TimeCalculator();

        @Test
        public void testAddTime (){
            int startHoursUser = 10;
            int startMinutesUser = 20;
            int startSecondsUser = 30;
            int intervalHoursUser = 5;
            int intervalMinutesUser = 5;
            int intervalSecondsUser = 5;

            Time time = new Time(startHoursUser, startMinutesUser, startSecondsUser );
            Time interval = new Time(intervalHoursUser, intervalMinutesUser, intervalSecondsUser);

            calc.addTime(time, interval);

            int actualHours = time.getHours();
            int actualMinutes = time.getMinutes();
            int actualSeconds = time.getSeconds();
            int expectedHours = 15;
            int expectedMinutes = 25;
            int expectedSeconds = 35;

            assertEquals(actualHours,expectedHours);
            assertEquals(actualMinutes,expectedMinutes);
            assertEquals(actualSeconds, expectedSeconds);
        }
}
