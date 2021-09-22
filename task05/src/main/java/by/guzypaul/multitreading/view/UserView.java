package by.guzypaul.multitreading.view;

import by.guzypaul.multitreading.controller.Controller;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ResourceBundle;
import java.util.Scanner;

public class UserView {

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
                    response = controller.executeTask("INSERT_BY_BOOLEAN");
                    logger.log(Level.INFO, "INSERT_BY_BOOLEANT: " + response);
                    System.out.println(response);
                    break;
                case 2:
                    response = controller.executeTask("INSERT_BY_LOCK");
                    logger.log(Level.INFO, "INSERT_BY_LOCK: " + response);
                    System.out.println(response);
                    break;
                case 3:
                    response = controller.executeTask("INSERT_BY_QUEUE");
                    logger.log(Level.INFO, "INSERT_BY_QUEUE: " + response);
                    System.out.println(response);
                    break;
                case 4:
                    response = controller.executeTask("INSERT_BY_SET");
                    logger.log(Level.INFO, "INSERT_BY_SET: " + response);
                    System.out.println(response);
                    break;

                case 5:
                    trigger = false;
                    logger.log(Level.INFO, "EXIT");
                    break;
                default:
                    messagePrinter.printMessage(rb.getString("WRONG_CHOISE"));
            }
        }
    }
}
