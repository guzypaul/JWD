package by.guzypaul.branchingandloop.reader;

import by.guzypaul.branchingandloop.validator.DividerCalcValidator;
import by.guzypaul.branchingandloop.view.PrintMessage;
import java.util.ResourceBundle;
import java.util.Scanner;

public class DividerCalcReader {
    ResourceBundle rb;

    public DividerCalcReader(ResourceBundle rb){
        this.rb = rb;
    }

    public int[] getData() {
        int startPoint;
        int finishPoint;
        int[] arrayOfPoints = new int[2];
        DividerCalcValidator dividerCalcValidator = new DividerCalcValidator();
        PrintMessage messagePrinter = new PrintMessage();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            messagePrinter.printMessage(rb.getString("ENTER_START_POINT_MORE_ZERO"));
            int tempStartPoint = scanner.nextInt();
            if (dividerCalcValidator.checkStartPoint(tempStartPoint)) {
                startPoint = tempStartPoint;
                break;
            } else {
                messagePrinter.printMessage(rb.getString("INCORRECT_NUMBER"));
            }
        }

        while (true) {
            messagePrinter.printMessage(rb.getString("ENTER_FINISH_POINT_MORE_THAN") + startPoint);
            int tempFinishPoint = scanner.nextInt();
            if (dividerCalcValidator.checkFinishPoint(startPoint, tempFinishPoint)) {
                finishPoint = tempFinishPoint;
                break;
            } else {
                messagePrinter.printMessage(rb.getString("INCORRECT_NUMBER"));
            }
        }
        arrayOfPoints[0] = startPoint;
        arrayOfPoints[1] = finishPoint;
        return arrayOfPoints;
    }
}
