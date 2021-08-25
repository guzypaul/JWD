package by.guzypaul.arraymatrix.view;

import by.guzypaul.arraymatrix.controller.Controller;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ResourceBundle;
import java.util.Scanner;

public class  UserView {
    private static final Logger logger = LogManager.getLogger(UserView.class);
    Controller controller = new Controller();
    Scanner scanner = new Scanner(System.in);
    PrintMessage messagePrinter = new PrintMessage();
    ResourceBundle rb;

    public UserView(ResourceBundle resourceBundle ){
        rb = resourceBundle;
    }

    public void userInteraction() {
        boolean trigger = true;
        while (trigger) {
            messagePrinter.printMessage(rb.getString("SELECT_MENU"));
            int choice = scanner.nextInt();
            switch (choice) {
                case 1://BubbleSort
                   controller.executeTask("BUBBLE_SORT");

                    break;
                case 2://InsertionSort
                    break;
                case 3://SelectionSort
                    break;
                case 4://ShakerSort
                    break;
                case 5://ShellSort
                    break;
                case 6://Multiplication
                    break;
                case 7://Subtraction
                    break;
                case 8://Sum
                    break;
                case 9:
                    trigger = false;
                    logger.log(Level.INFO, "EXIT");
                    break;

                default:
                    messagePrinter.printMessage(rb.getString("WRONG_CHOISE"));
            }
        }
    }
}
