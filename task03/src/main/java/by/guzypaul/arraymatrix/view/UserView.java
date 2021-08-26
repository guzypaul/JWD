package by.guzypaul.arraymatrix.view;

import by.guzypaul.arraymatrix.controller.Controller;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.ResourceBundle;
import java.util.Scanner;

public class  UserView {
    private static final Logger logger = LogManager.getLogger(UserView.class);
    String response;
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
                case 1:
                    response = controller.executeTask("BUBBLE_SORT");
                    logger.log(Level.INFO, "BUBBLE_SORT: " + response);
                    break;
                case 2:
                    response = controller.executeTask("INSERTION_SORT");
                    logger.log(Level.INFO, "INSERTION_SORT: " + response);
                    break;
                case 3:
                    response = controller.executeTask("SELECTION_SORT");
                    logger.log(Level.INFO, "SELECTION_SORT: " + response);
                    break;
                case 4:
                    response = controller.executeTask("SHAKER_SORT");
                    logger.log(Level.INFO, "SHAKER_SORT: " + response);
                    break;
                case 5:
                    response = controller.executeTask("SHELL_SORT");
                    logger.log(Level.INFO, "SHELL_SORT: " + response);
                    break;
                case 6:
                    response = controller.executeTask("MATRIX_MULTIPLICATOR");
                    logger.log(Level.INFO, "MATRIX_MULTIPLICATOR: " + response);
                    break;
                case 7:
                    response = controller.executeTask("MATRIX_SUBTRACTOR");
                    logger.log(Level.INFO, "MATRIX_SUBTRACTOR: " + response);
                    break;
                case 8:
                    response = controller.executeTask("MATRIX_SUMR");
                    logger.log(Level.INFO, "MATRIX_SUM: " + response);
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
