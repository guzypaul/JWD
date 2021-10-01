package by.guzypaul.classes.view;

import by.guzypaul.classes.controller.Controller;
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
//                    response = controller.executeTask("INSERT_BY_BOOLEAN");
//                    logger.log(Level.INFO, "INSERT_BY_BOOLEANT: " + response);
//                    System.out.println(response);
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:

                    break;
                case 7:

                    break;
                case 8:

                    break;
                case 9:
                    trigger = false;
                    logger.log(Level.INFO, "EXIT");
                    break;
                default:
                    messagePrinter.printMessage(rb.getString("WRONG_CHOICE"));
            }
        }
    }
}
