package by.guzypaul.branchingandloop.reader;

import by.guzypaul.branchingandloop.view.PrintMessage;
import java.util.ResourceBundle;
import java.util.Scanner;

public class SequenceCalcReader {
    ResourceBundle rb;

    public SequenceCalcReader(ResourceBundle rb){
        this.rb = rb;
    }

    public double[] getDataFromUser() {
        PrintMessage messagePrinter = new PrintMessage();
        Scanner scanner = new Scanner(System.in);
        double[] resultList = new double[2];

        while (true) {
            messagePrinter.printMessage(rb.getString("ENTER_DOUBLE_NUMBER_A"));
            if (scanner.hasNextDouble()) {
                resultList[0] = scanner.nextDouble();
                break;
            } else {
                scanner.nextLine(); //throw not Double
                messagePrinter.printMessage(rb.getString("INCORRECT_NUMBER"));
            }
        }

        while (true) {
            messagePrinter.printMessage(rb.getString("ENTER_INTEGER_NUMBER_N"));
            if (scanner.hasNextInt()) {
                resultList[1] = (double) scanner.nextInt();
                break;
            } else {
                scanner.nextLine(); //throw not Int
                messagePrinter.printMessage(rb.getString("INCORRECT_NUMBER"));
            }
        }
        return resultList;
    }
}
