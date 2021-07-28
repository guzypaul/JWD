package by.guzypaul.first.service;

/**
 * Task32
 * Текущее показание электронных часов: m ч(0<=m<=23) n мин(0<=n<=59) k
 * с(o<=k<=59). Какое время будут показывать часы через p(часов) q(мин) r(cек).
 */

public class TimeCalculator {

    private int hours = 4;
    private int minutes = 45;
    private int seconds = 56;

    public void countTime(int p, int q, int r) {

        seconds = seconds + r;
        if (seconds > 59) {
            seconds = seconds - 60;
            minutes++;
        }

        minutes = minutes + q;
        if (minutes > 59) {
            minutes = minutes - 60;
            hours++;
        }

        hours = hours + p;
        if (hours > 23) {
            hours = hours - 24;
        }
    }

    public int getHours () {
        return hours;
    }

    public int getMinutes () {
        return minutes;
    }

    public int getSeconds () {
        return seconds;
    }
}