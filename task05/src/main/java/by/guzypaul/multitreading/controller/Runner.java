package by.guzypaul.multitreading.controller;

import by.guzypaul.multitreading.controller.command.CommandException;
import by.guzypaul.multitreading.dao.exception.DaoException;
import by.guzypaul.multitreading.view.UserLocale;
import by.guzypaul.multitreading.view.UserView;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ResourceBundle;

public class Runner {
    private static final Logger logger = LogManager.getLogger(UserView.class);
    public static void main(String[] args) throws DaoException, InterruptedException, CommandException {
        UserLocale userLocale = new UserLocale();
        ResourceBundle resourceBundle = userLocale.defineLanguage();
        UserView userView = new UserView(resourceBundle);
        userView.userInteraction();
    }
}
