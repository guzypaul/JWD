package by.guzypaul.branchingandloop.reader;

import by.guzypaul.branchingandloop.validator.ComplexFunctionCalcValidator;
import by.guzypaul.branchingandloop.view.PrintMessage;
import java.util.HashMap;
import java.util.ResourceBundle;
import java.util.Scanner;

public class ComplexFunctionCalcReader {
    ResourceBundle rb;
    public ComplexFunctionCalcReader(ResourceBundle rb){
        this.rb = rb;
    }

    public HashMap<String, Double> getDataFromUser() {
        double startPoint;
        double finishPoint;
        double step;
        HashMap<String, Double> pointsMap =  new HashMap<>();
        ComplexFunctionCalcValidator complexFunctionCalcValidator = new ComplexFunctionCalcValidator();
        PrintMessage messagePrinter = new PrintMessage();
        Scanner scanner = new Scanner(System.in);


        while (true) {
            messagePrinter.printMessage(rb.getString("ENTER_START_POINT"));
            if (scanner.hasNextDouble()) {
                startPoint = scanner.nextDouble();
                break;
            } else {
                scanner.nextLine(); //throw not Double
                messagePrinter.printMessage(rb.getString("INCORRECT_NUMBER"));
            }
        }

        while (true) {
            messagePrinter.printMessage(rb.getString("ENTER_FINISH_POINT") + " "+ startPoint);
            if (scanner.hasNextDouble()) {
                double tempFinishPoint = scanner.nextDouble();
                if (complexFunctionCalcValidator.checkFinishPoint(startPoint, tempFinishPoint)) {
                    finishPoint = tempFinishPoint;
                    break;
                } else {
                    messagePrinter.printMessage(rb.getString("INCORRECT_NUMBER"));
                }
            } else {
                scanner.nextLine(); //throw not Double
                messagePrinter.printMessage(rb.getString("INCORRECT_NUMBER"));
            }
        }

        while (true) {
            messagePrinter.printMessage(rb.getString("ENTER_STEP"));
            if (scanner.hasNextDouble()) {
                double tempStep = scanner.nextDouble();
                if (complexFunctionCalcValidator.checkStep(startPoint, finishPoint, tempStep)) {
                    step = tempStep;
                    break;
                } else {
                    messagePrinter.printMessage(rb.getString("INCORRECT_NUMBER"));

                }
            } else {
                scanner.nextLine(); //throw not Int
                messagePrinter.printMessage(rb.getString("INCORRECT_NUMBER"));
            }
        }
        pointsMap.put("startPoint", startPoint);
        pointsMap.put("finishPoint", finishPoint);
        pointsMap.put("step", step);
        return pointsMap;
    }
}
