package by.guzypaul.first.view;

import by.guzypaul.first.validate.TimeValidator;
import java.util.Scanner;

public class TimeCreator {

    private int hours;
    private int minutes;
    private int seconds;

    Scanner scanner = new Scanner(System.in);
    TimeValidator timeValidator = new TimeValidator();

    public void timeRequest (){

        while(true){
            System.out.println("Enter hours: ");
            int tempHours = scanner.nextInt();
            if (timeValidator.checkHours(tempHours) == true){
                hours = tempHours;
                break;
            } else {
                System.out.print("Incorrect hours! ");
            }
        }

        while(true){
            System.out.println("Enter minutes: ");
            int tempMinutes = scanner.nextInt();
            if (timeValidator.checkMinutes(tempMinutes) == true){
                minutes = tempMinutes;
                break;
            } else {
                System.out.print("Incorrect minutes! ");
            }
        }

        while(true){
            System.out.println("Enter seconds: ");
            int tempSeconds = scanner.nextInt();
            if (timeValidator.checkSeconds(tempSeconds) == true){
                seconds = tempSeconds;
                break;
            } else {
                System.out.print("Incorrect seconds! ");
            }
        }
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }
}
