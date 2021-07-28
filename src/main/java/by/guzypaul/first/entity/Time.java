package by.guzypaul.first.entity;

public class Time {
    private int hours;
    private int minutes;
    private int seconds;

    public Time () {
        this.hours = 0;
        this.minutes = 0;
        this.seconds = 0;
    }

    public Time (int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Time)) return false;

        Time time = (Time) o;

        if (getHours() != time.getHours()) return false;
        if (getMinutes() != time.getMinutes()) return false;
        return getSeconds() == time.getSeconds();
    }

    @Override
    public int hashCode() {
        int result = getHours();
        result = 31 * result + getMinutes();
        result = 31 * result + getSeconds();
        return result;
    }

    @Override
    public String toString() {
        return "Time{" +
                "hours=" + hours +
                ", minutes=" + minutes +
                ", seconds=" + seconds +
                '}';
    }


}
