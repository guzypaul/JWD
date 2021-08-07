package by.guzypaul.branchingandloop.reader;

import by.guzypaul.branchingandloop.validator.DividerCalcValidator;
import by.guzypaul.branchingandloop.view.PrintMessage;

import java.util.ResourceBundle;
import java.util.Scanner;

public class SpecificComparatorReader {
    ResourceBundle rb;

    public SpecificComparatorReader(ResourceBundle rb){
        this.rb = rb;
    }

    public int[] getDataFromUser(){
        int[] arrayOfNumbers = new int[2];
        PrintMessage messagePrinter = new PrintMessage();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            messagePrinter.printMessage(rb.getString("ENTER_INTEGER_NUMBER_M"));
            if (scanner.hasNextInt()){
                arrayOfNumbers[0] = scanner.nextInt();
                break;
            } else {
                scanner.nextLine(); //throw not valid
                messagePrinter.printMessage(rb.getString("INCORRECT_NUMBER"));
            }
        }

        while (true) {
            messagePrinter.printMessage(rb.getString("ENTER_INTEGER_NUMBER_N"));
            if (scanner.hasNextInt()){
                arrayOfNumbers[1] = scanner.nextInt();
                break;
            } else {
                scanner.nextLine(); //throw not valid
                messagePrinter.printMessage(rb.getString("INCORRECT_NUMBER"));
            }
        }
        return arrayOfNumbers;
    }
}
