package by.guzypaul.first.runner;

import java.util.Scanner;

import by.guzypaul.first.entity.Rectangle;
import by.guzypaul.first.entity.Time;
import by.guzypaul.first.service.*;
import by.guzypaul.first.service.RectangleAction;
import by.guzypaul.first.view.MessageForUser;
import by.guzypaul.first.view.RectangleReader;
import by.guzypaul.first.view.TimeReader;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Runner {
    private static final Logger logger = LogManager.getLogger();

    public static void main(String[] args) {

        logger.log(Level.INFO, "Main method START ");
        Scanner scanner = new Scanner(System.in);
        MessageForUser message = new MessageForUser();

        while (true) {
            message.showInvitation();
            int choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    message.enterNumber();
                    double arg = scanner.nextInt();
                    FunctionCalc function = new FunctionCalc();
                    double resultAdditionWithSpecificNumber = function.additionWithSpecificNumber(arg);
                    logger.log(Level.INFO, "Result: " + resultAdditionWithSpecificNumber + "\n");
                    break;

                case 2:
                    RectangleReader rectangleCreator = new RectangleReader();
                    Rectangle rectangle = new Rectangle(rectangleCreator.getWidth());
                    RectangleAction rectangleAction = new RectangleAction();
                    double resultFindSquare = rectangleAction.findSquare(rectangle);
                    logger.log(Level.INFO, "Square of rectangle: " + resultFindSquare + "\n");
                    break;

                case 3:
                    System.out.println("Enter number one: ");
                    double num1 = scanner.nextDouble();
                    System.out.println("Enter number two: ");
                    double num2 = scanner.nextDouble();

                    ArithmeticCalc arithmetic = new ArithmeticCalc();
                    double resultFindArithmeticMeanOfCubes = arithmetic.findArithmeticMeanOfCubes(num1, num2);
                    double resultFindGeometricMeanOfModules = arithmetic.findGeometricMeanOfModules(num1, num2);
                    logger.log(Level.INFO, "Arithmetic mean of cubes: " + resultFindArithmeticMeanOfCubes);
                    logger.log(Level.INFO, "Geometric Mean Of Modules: " + resultFindGeometricMeanOfModules + "\n");
                    break;

                case 4:
                    System.out.println("Enter number: ");
                    double num = scanner.nextInt();
                    Exponentiation exponentiationOfNum = new Exponentiation();
                    exponentiationOfNum.raisingNumberToPower(num);
                    double resultGetNumInEightPower = exponentiationOfNum.getNumInEightPower();
                    double resultGetNumInTenPower = exponentiationOfNum.getNumInTenPower();
                    logger.log(Level.INFO, "Num in 8 power: " + resultGetNumInEightPower);
                    logger.log(Level.INFO, "Num in 10 power: " + resultGetNumInTenPower);
                    break;

                case 5:
                    System.out.println("Enter start time");
                    TimeReader timeEnter = new TimeReader();
                    Time time = new Time(timeEnter.getHours(), timeEnter.getMinutes(), timeEnter.getSeconds());

                    System.out.println("Enter interval of time");
                    TimeReader intervalEnter = new TimeReader();
                    Time interval = new Time(intervalEnter.getHours(), intervalEnter.getMinutes(), intervalEnter.getSeconds());

                    logger.log(Level.INFO, "Start time: " + time);
                    logger.log(Level.INFO, "Interval: " + interval);

                    TimeCalculator timeCalc = new TimeCalculator();
                    timeCalc.addTime(time, interval);
                    logger.log(Level.INFO, "Expected time: " + time + "\n");
                    break;

                case 6:
                    break;

                default:
                    message.correctUser();
            }
        }
    }
}
