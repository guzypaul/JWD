package by.guzypaul.first.view;

import by.guzypaul.first.validator.TimeValidator;
import java.util.Scanner;

public class TimeReader {

    final private int hours;
    final private int minutes;
    final private int seconds;

    public TimeReader(){
        Scanner scanner = new Scanner(System.in);
        TimeValidator timeValidator = new TimeValidator();

        while(true){
            System.out.println("Enter hours: ");
            int tempHours = scanner.nextInt();
            if (timeValidator.checkHours(tempHours)){
                hours = tempHours;
                break;
            } else {
                System.out.print("Incorrect hours! ");
            }
        }

        while(true){
            System.out.println("Enter minutes: ");
            int tempMinutes = scanner.nextInt();
            if (timeValidator.checkMinutes(tempMinutes)){
                minutes = tempMinutes;
                break;
            } else {
                System.out.print("Incorrect minutes! ");
            }
        }

        while(true){
            System.out.println("Enter seconds: ");
            int tempSeconds = scanner.nextInt();
            if (timeValidator.checkSeconds(tempSeconds)){
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
