package by.guzypaul.branchingandloop.view;

import by.guzypaul.branchingandloop.reader.*;
import by.guzypaul.branchingandloop.service.branching.*;
import by.guzypaul.branchingandloop.service.loop.*;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

import java.util.ResourceBundle;

public class UserView {
    ResourceBundle rb;
    public UserView(ResourceBundle resourceBundle ){
        rb = resourceBundle;
    }

    private static final Logger logger = LogManager.getLogger(UserView.class);

    Scanner scanner = new Scanner(System.in);
    PrintMessage messagePrinter = new PrintMessage();

    private static final String SELECT_LANGUAGE = "Choose language, plese!/Пожалуйста, выберите язык! " + "\n"
            + "1. English/ 2.Русский";
    private static final String A = "a";
    private static final String B = "b";
    private static final String C = "c";
    private static final String D = "d";
    private static final String X = "x";

    public void userInteraction() {
        boolean trigger = true;

        while (trigger) {
            messagePrinter.printMessage(rb.getString("SELECT_MENU"));
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    messagePrinter.printMessage(rb.getString("ENTER_NUMBER") + A);
                    double a = scanner.nextDouble();
                    messagePrinter.printMessage(rb.getString("ENTER_NUMBER") + B);
                    double b = scanner.nextDouble();
                    messagePrinter.printMessage(rb.getString("ENTER_NUMBER") + C);
                    double c = scanner.nextDouble();
                    messagePrinter.printMessage(rb.getString("ENTER_NUMBER") + X);
                    double x = scanner.nextDouble();
                    FunctionCalc functionCalc = new FunctionCalc();
                    double resultOfFunctionCalculator = functionCalc.functionCalculator(a, b, c, x);
                    logger.log(Level.INFO, "Result: " + resultOfFunctionCalculator);
                    break;

                case 2:
                    messagePrinter.printMessage(rb.getString("ENTER_NUMBER") + rb.getString("ONE"));
                    int numberOne = scanner.nextInt();
                    messagePrinter.printMessage(rb.getString("ENTER_NUMBER") + rb.getString("TWO"));
                    int numberTwo = scanner.nextInt();
                    NumComparator numComparator = new NumComparator();
                    String resultOfNumberComparator = numComparator.numberComparator(numberOne, numberTwo);
                    logger.log(Level.INFO, "Result: " + resultOfNumberComparator);
                    break;

                case 3:
                    SpecificComparatorReader specificComparatorReader = new SpecificComparatorReader(rb);
                    int[] arrayOfNumbers = specificComparatorReader.getDataFromUser();
                    SpecificComparator specificComparator = new SpecificComparator();
                    int[] resultList = specificComparator.compareAndChangeNumbers(arrayOfNumbers);
                    logger.log(Level.INFO, "Result: " + "m = " + resultList[0] + "; n = " + resultList[1]);
                    break;

                case 4:
                    messagePrinter.printMessage(rb.getString("ENTER_NUMBER") + rb.getString("ONE"));
                    double numOne = scanner.nextDouble();
                    messagePrinter.printMessage(rb.getString("ENTER_NUMBER") + rb.getString("TWO"));
                    double numTwo = scanner.nextDouble();
                    messagePrinter.printMessage(rb.getString("ENTER_NUMBER") + rb.getString("THREE"));
                    double numThree = scanner.nextDouble();
                    SumValidator sumValidator = new SumValidator();
                    double[] arrayOfSum = sumValidator.findSumEveryPairs(numOne, numTwo, numThree);
                    boolean resultFindPositiveSum = sumValidator.findPositiveSum(arrayOfSum);
                    logger.log(Level.INFO, "Result: " + resultFindPositiveSum);
                    break;

                case 5:
                    messagePrinter.printMessage(rb.getString("ENTER_NUMBER") + A);
                    double numA = scanner.nextDouble();
                    messagePrinter.printMessage(rb.getString("ENTER_NUMBER") + B);
                    double numB = scanner.nextDouble();
                    messagePrinter.printMessage(rb.getString("ENTER_NUMBER") + C);
                    double numC = scanner.nextDouble();
                    messagePrinter.printMessage(rb.getString("ENTER_NUMBER") + D);
                    double numD = scanner.nextDouble();
                    ValueComparator valueComparator = new ValueComparator();
                    double resultFindMaxAmongMin = valueComparator.findMaxAmongMin(numA, numB, numC, numD);
                    logger.log(Level.INFO, "Result: " + resultFindMaxAmongMin);
                    break;

                case 6:
                    ComplexFunctionCalcReader complexFunctionCalcReader = new ComplexFunctionCalcReader(rb);
                    HashMap<String, Double> newPointsMap = complexFunctionCalcReader.getDataFromUser();
                    double startPoint = newPointsMap.get("startPoint");
                    double finishPoint = newPointsMap.get("finishPoint");
                    double step = newPointsMap.get("step");
                    ComplexFunctionCalc complexFunctionCalc = new ComplexFunctionCalc();
                    ArrayList<Double> resultValueList = complexFunctionCalc.findFunctionValue(startPoint, finishPoint, step);
                    logger.log(Level.INFO, "Result: " + resultValueList);
                    break;

                case 7:
                    DividerCalcReader dividerCalcReader = new DividerCalcReader(rb);
                    int[] arrayOfPoints = dividerCalcReader.getData();
                    DividerCalc dividerCalc = new DividerCalc();
                    HashMap<Integer, ArrayList> resultNumberAndDividerList = dividerCalc.findAllDividers(arrayOfPoints);
                    logger.log(Level.INFO, "Result: " + resultNumberAndDividerList);
                    break;

                case 8:
                    SequenceCalcReader sequenceCalcReader = new SequenceCalcReader(rb);
                    double[] dataList = sequenceCalcReader.getDataFromUser();
                    SequenceCalc sequenceCalc = new SequenceCalc();
                    double resultFindMultiplicationMembersOfSequence = sequenceCalc.findMultiplicationMembersOfSequence(dataList);
                    logger.log(Level.INFO, "Result: " + resultFindMultiplicationMembersOfSequence);
                    break;

                case 9:
                    SequenceCreatorReader sequenceCreatorReader = new SequenceCreatorReader(rb);
                    int[] arrayOfNum = sequenceCreatorReader.getDataForCreateDescendingSequence();
                    SequenceCreator sequenceCreator = new SequenceCreator();
                    int[] resultCreateDescendingSequence = sequenceCreator.createDescendingSequence(arrayOfNum);
                    logger.log(Level.INFO, "Result: " + Arrays.toString(resultCreateDescendingSequence));
                    break;

                case 10:
                    messagePrinter.printMessage(rb.getString("ENTER_STRING_FOR_CHECKING"));
                    String inputString = scanner.nextLine();
                    StringValidator  stringValidator = new StringValidator();
                    stringValidator.stringToCharArray(inputString);
                    break;

                case 11:
                    trigger = false;
                    logger.log(Level.INFO, "EXIT");
                    break;

                default:
                    messagePrinter.printMessage(rb.getString("WRONG_CHOISE"));
            }
        }
    }
}
