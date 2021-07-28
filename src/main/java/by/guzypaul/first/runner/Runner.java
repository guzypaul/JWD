package by.guzypaul.first.runner;

import java.util.Scanner;

import by.guzypaul.first.service.FunctionCalc;
import by.guzypaul.first.service.RectangleCalc;
import by.guzypaul.first.service.ArithmeticCalc;
import by.guzypaul.first.service.Exponentiation;
import by.guzypaul.first.service.TimeCalculator;
import by.guzypaul.first.view.MessageForUser;


public class Runner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        MessageForUser showMessage = new MessageForUser();

        while (true) {
            showMessage.showInvitation();

            int choice = scanner.nextInt();


            switch (choice) {

                case 1:
                    showMessage.enterNumber();
                    double arg = scanner.nextInt();
                    FunctionCalc function = new FunctionCalc();
                    System.out.println("Result: " + function.additionWithSpecificNumber(arg) + "\n");
                    break;

                case 2:
                    System.out.println("Enter width of a rectangle: ");
                    double width = scanner.nextInt();
                    RectangleCalc rectangle = new RectangleCalc();
                    System.out.println("Square of rectangle: " + rectangle.findSquareByWidth(width) + "\n");
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
                    Exponentiation power = new Exponentiation();
                    power.raisingNumberToPower(num);
                    System.out.println("Num in 8 power: " + power.getNumInEightPower());
                    System.out.println("Num in 10 power: " + power.getNumInTenPower() + "\n");
                    break;

                case 5:
                    System.out.println("Enter hours: ");
                    int hours = scanner.nextInt();
                    System.out.println("Enter minutes: ");
                    int minutes = scanner.nextInt();
                    System.out.println("Enter seconds: ");
                    int seconds = scanner.nextInt();

                    TimeCalculator time = new TimeCalculator();
                    System.out.println("Start time: " + "\n" + time.getHours() + ":" + time.getMinutes() + ":"
                            + time.getSeconds() + "\n");
                    System.out.println("Interval: " + hours + ":" + minutes + ":" + seconds);
                    time.countTime(hours, minutes, seconds);
                    System.out.println("Expected time: " + "\n" + time.getHours() + ":" + time.getMinutes() + ":"
                            + time.getSeconds() + "\n");
                    break;

                case 6:
                    break;

                default:
                    showMessage.correctUser();
            }
        }
    }
}
