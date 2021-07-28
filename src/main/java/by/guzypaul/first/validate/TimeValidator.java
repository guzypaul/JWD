package by.guzypaul.first.validate;

public class TimeValidator {

    public boolean checkHours (int hours){
        if (hours > 0 && hours <= 23 ) {
            return true;
        }
        return false;
    }
    
    public boolean checkMinutes (int minutes){
        if (minutes > 0 && minutes <= 59 ){
            return true;
        }
        return false;
    }

    public boolean checkSeconds (int seconds){
        if (seconds > 0 && seconds <= 59 ) {
            return true;
        }
        return false;
    }
}
