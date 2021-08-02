package by.guzypaul.first.service;

import by.guzypaul.first.entity.Time;

/**
 * Task32
 * Текущее показание электронных часов: m ч(0<=m<=23) n мин(0<=n<=59) k
 * с(o<=k<=59). Какое время будут показывать часы через p(часов) q(мин) r(cек).
 */

public class TimeCalculator {
    public void addTime(Time time,Time interval) {

        int tempHours = 0;
        int tempMinutes = 0;
        int tempSeconds;

        tempSeconds = time.getSeconds() + interval.getSeconds();
        if (tempSeconds > 59) {
            tempSeconds = tempSeconds - 60;
            tempMinutes++;
        }

        tempMinutes = time.getMinutes() + interval.getMinutes() + tempMinutes;
        if (tempMinutes > 59) {
            tempMinutes = tempMinutes - 60;
            tempHours++;
        }

        tempHours = time.getHours() + interval.getHours() + tempHours;
        if (tempHours > 23) {
            tempHours = tempHours - 24;
        }

        time.setHours(tempHours);
        time.setMinutes(tempMinutes);
        time.setSeconds(tempSeconds);
    }
}