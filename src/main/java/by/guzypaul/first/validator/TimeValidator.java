package by.guzypaul.first.validator;

public class TimeValidator {

    public boolean checkHours (int hours){
        return hours > 0 && hours <= 23;
    }
    
    public boolean checkMinutes (int minutes){
        return minutes > 0 && minutes <= 59;
    }

    public boolean checkSeconds (int seconds){
        return seconds > 0 && seconds <= 59;
    }
}
