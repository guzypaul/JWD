package by.guzypaul.branchingandloop.view;

import by.guzypaul.branchingandloop.service.branching.*;
import by.guzypaul.branchingandloop.service.loop.ComplexFunctionCalc;
import by.guzypaul.branchingandloop.service.loop.DividerCalc;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class UserInterface {

    private static final Logger logger = LogManager.getLogger();

    Scanner scanner = new Scanner(System.in);

    private static final String SELECT_MENU = "Select a menu item:" + "\n"
            + "1. Find expression module of a*x*x + b*x + с;" + "\n"
            + "2. Сompare if number one less than number two" + "\n"
            + "3. Сompare two numbers (int m,int n). if n!=m -> n = max(n,m), m = max(n,m)" + "\n"
            + "4. Find positive sum of numbers pairs from three number" + "\n"
            + "5. Find max{min(a,b), minc(c,d))" + "\n"
            + "6. Find value of function on a slice [a,b] with step h. y = x, if x >2 && y = -x, if x<=2" + "\n"
            + "7. Find all dividers for all natural numbers on slice [m, n] (instead of 1 and the number itself)" + "\n"
            + "8. Find a*(a+1)...(a + n - 1). Condition: a - double, n - int" + "\n"
            + "9. Print all numbers from 5 to 1" + "\n"
            + "10. Check the string for a specific condition. " + "\n"
            + "11. Exit";
    private static final String WRONG_CHOISE = "Wrong menu item is selected, re-enter.";
    private static final String ENTER_NUMBER = "Enter number ";
    private static final String A = "a";
    private static final String B = "b";
    private static final String C = "c";
    private static final String D = "d";
    private static final String X = "x";
    private static final String ONE = "one";
    private static final String TWO = "two";
    private static final String THREE = "three";
    private static final String M = "m";
    private static final String N = "n";
    private static final String ENTER_START_POINT = "Enter start point:";
    private static final String ENTER_FINISH_POINT = "Enter finish point:";
    private static final String ENTER_STEP = "Enter step:";

    public void userInteraction() {
        logger.log(Level.INFO, "APP START ");
        boolean trigger = true;

        while (trigger) {
            printMessage(SELECT_MENU);
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    printMessage(ENTER_NUMBER + A);
                    double a = scanner.nextDouble();
                    printMessage(ENTER_NUMBER + B);
                    double b = scanner.nextDouble();
                    printMessage(ENTER_NUMBER + C);
                    double c = scanner.nextDouble();
                    printMessage(ENTER_NUMBER + X);
                    double x = scanner.nextDouble();
                    FunctionCalc functionCalc = new FunctionCalc();
                    double resultOfFunctionCalculator = functionCalc.functionCalculator(a, b, c, x);
                    logger.log(Level.INFO, "Result: " + resultOfFunctionCalculator);
                    break;

                case 2:
                    printMessage(ENTER_NUMBER + ONE);
                    int numberOne = scanner.nextInt();
                    printMessage(ENTER_NUMBER + TWO);
                    int numberTwo = scanner.nextInt();
                    NumComparator numComparator = new NumComparator();
                    String resultOfNumberComparator = numComparator.numberComparator(numberOne, numberTwo);
                    logger.log(Level.INFO, "Result: " + resultOfNumberComparator);
                    break;

                case 3:
                    printMessage(ENTER_NUMBER + M);
                    int m = scanner.nextInt();
                    printMessage(ENTER_NUMBER + N);
                    int n = scanner.nextInt();
                    SpecificComparator specificComparator = new SpecificComparator();
                    specificComparator.compareAndChangeNumbers(m, n);
                    int resultM = specificComparator.getM();
                    int resultN = specificComparator.getN();
                    logger.log(Level.INFO, "Result: " + "m = " + resultM + "n = " + resultN);
                    break;

                case 4:
                    printMessage(ENTER_NUMBER + ONE);
                    double numOne = scanner.nextDouble();
                    printMessage(ENTER_NUMBER + TWO);
                    double numTwo = scanner.nextDouble();
                    printMessage(ENTER_NUMBER + THREE);
                    double numThree = scanner.nextDouble();
                    SumValidator sumValidator = new SumValidator();
                    sumValidator.findSumEveryPairs(numOne, numTwo,numThree);
                    double[] arrayOfNumber = sumValidator.getSumArray();
                    boolean resultFindPositiveSum = sumValidator.findPositiveSum(arrayOfNumber);
                    logger.log(Level.INFO, "Result: " + resultFindPositiveSum);
                    break;

                case 5:
                    printMessage(ENTER_NUMBER + A);
                    double numA = scanner.nextDouble();
                    printMessage(ENTER_NUMBER + B);
                    double numB = scanner.nextDouble();
                    printMessage(ENTER_NUMBER + C);
                    double numC = scanner.nextDouble();
                    printMessage(ENTER_NUMBER + D);
                    double numD = scanner.nextDouble();
                    ValueComparator valueComparator = new ValueComparator();
                    double resultFindMaxAmongMin = valueComparator.findMaxAmongMin(numA, numB, numC, numD);
                    logger.log(Level.INFO, "Result: " + resultFindMaxAmongMin);
                    break;

                case 6:
                    printMessage(ENTER_START_POINT);
                    double startPoint = scanner.nextDouble();
                    printMessage(ENTER_FINISH_POINT);
                    double finishPoint = scanner.nextDouble();
                    printMessage(ENTER_STEP);
                    int step = scanner.nextInt();
                    ComplexFunctionCalc complexFunctionCalc = new ComplexFunctionCalc();
                    ArrayList<Double> valueList = complexFunctionCalc.findFunctionValue(startPoint, finishPoint, step);
                    logger.log(Level.INFO, "Result: " + valueList);
                    break;

                case 7:
                    printMessage(ENTER_START_POINT);
                    int startNum = scanner.nextInt();
                    printMessage(ENTER_FINISH_POINT);
                    int finishNum = scanner.nextInt();
                    DividerCalc dividerCalc = new DividerCalc();
                    dividerCalc.findAllDividers(startNum, finishNum);
                    //HashMap<Integer, ArrayList> numberAndDividerList

                    break;

                case 8:
                    break;

                case 9:
                    break;

                case 10:
                    break;

                case 11:
                    trigger = false;

                default:
                    printMessage(WRONG_CHOISE);
            }
        }
    }

    public void printMessage(String string) {
        System.out.println(string);
    }
}
