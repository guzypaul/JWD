package by.guzypaul.first.runner;

import java.util.Scanner;

import by.guzypaul.first.entity.Rectangle;
import by.guzypaul.first.entity.Time;
import by.guzypaul.first.service.*;
import by.guzypaul.first.service.RectangleAction;
import by.guzypaul.first.view.MessageForUser;
import by.guzypaul.first.validate.TimeValidator;
import by.guzypaul.first.view.RectangleCreator;
import by.guzypaul.first.view.TimeCreator;

public class Runner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        MessageForUser message = new MessageForUser();
        TimeValidator timeValidator = new TimeValidator();

        while (true) {
           // message.printMessage(showInvitation);
            message.showInvitation();

            int choice = scanner.nextInt();


            switch (choice) {

                case 1:
                    message.enterNumber();
                    double arg = scanner.nextInt();
                    FunctionCalc function = new FunctionCalc();
                    System.out.println("Result: " + function.additionWithSpecificNumber(arg) + "\n");
                    break;

                case 2:
                    RectangleCreator rectangleCreator = new RectangleCreator();
                    Rectangle rectangle = new Rectangle(rectangleCreator.getWidth());
                    RectangleAction rectangleAction = new RectangleAction();
                    System.out.println("Square of rectangle: " + rectangleAction.findSquare(rectangle) + "\n");
                    break;

                case 3:
                    System.out.println("Enter number one: ");
                    double num1 = scanner.nextInt();
                    System.out.println("Enter number two: ");
                    double num2 = scanner.nextInt();

                    ArithmeticCalc arithmetic = new ArithmeticCalc();

                    System.out.println("Arithmetic mean of cubes: " + arithmetic.findArithmeticMeanOfCubes(num1, num2));
                    System.out.println(
                            "Geometric Mean Of Modules: " + arithmetic.findGeometricMeanOfModules(num1, num2) + "\n");
                    break;

                case 4:
                    System.out.println("Enter number: ");
                    double num = scanner.nextInt();
                    Exponentiation exponentiationOfNum = new Exponentiation();
                    exponentiationOfNum.raisingNumberToPower(num);
                    System.out.println("Num in 8 power: " + exponentiationOfNum.getNumInEightPower());
                    System.out.println("Num in 10 power: " + exponentiationOfNum.getNumInTenPower() + "\n");
                    break;

                case 5:
                    System.out.println("Enter start time");
                    TimeCreator timeEnter = new TimeCreator();
                    Time time = new Time(timeEnter.getHours(), timeEnter.getMinutes(), timeEnter.getSeconds());

                    System.out.println("Enter interval of time");
                    TimeCreator intervalEnter = new TimeCreator();
                    Time interval = new Time(intervalEnter.getHours(), intervalEnter.getMinutes(), intervalEnter.getSeconds());

                    System.out.println("Start time: " + time);
                    System.out.println("Interval: " + interval);

                    TimeCalculator timeCalc = new TimeCalculator();
                    timeCalc.addTime(time, interval);
                    System.out.println("Expected time: " + time + "\n");
                    break;

                case 6:
                    break;

                default:
                    message.correctUser();
            }
        }
    }
}
