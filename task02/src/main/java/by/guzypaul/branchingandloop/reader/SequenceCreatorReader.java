package by.guzypaul.branchingandloop.reader;

import by.guzypaul.branchingandloop.validator.SequenceCreatorValidator;
import by.guzypaul.branchingandloop.view.PrintMessage;
import java.util.ResourceBundle;
import java.util.Scanner;

public class SequenceCreatorReader {
    ResourceBundle rb;

    public SequenceCreatorReader(ResourceBundle rb){
        this.rb = rb;
    }

    public int[] getDataForCreateDescendingSequence (){
        SequenceCreatorValidator sequenceCreatorValidator = new SequenceCreatorValidator();
        PrintMessage messagePrinter = new PrintMessage();
        Scanner scanner = new Scanner(System.in);
        int[] numberList = new int[2];

        while (true) {
            messagePrinter.printMessage(rb.getString("ENTER_START_INTEGER_NUMBER"));
            if (scanner.hasNextInt()) {
                numberList[0] = scanner.nextInt();
                break;
            } else {
                scanner.nextLine(); //throw not Int
                messagePrinter.printMessage(rb.getString("INCORRECT_NUMBER"));
            }
        }

        while (true) {
            messagePrinter.printMessage(rb.getString("ENTER_FINISH_INTEGER_NUMBER"));
            if (scanner.hasNextInt()) {
                int tempFinish = scanner.nextInt();
                if (sequenceCreatorValidator.checkFinishPoint(numberList[0],tempFinish)) {
                    numberList[1] = tempFinish;
                    break;
                } else {
                    messagePrinter.printMessage(rb.getString("INCORRECT_NUMBER"));
                }
            } else {
                scanner.nextLine(); //throw not Int
                messagePrinter.printMessage(rb.getString("INCORRECT_NUMBER"));
            }
        }
        return numberList;
    }
}
