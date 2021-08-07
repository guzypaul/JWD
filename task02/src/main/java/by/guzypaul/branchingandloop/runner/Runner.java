package by.guzypaul.branchingandloop.runner;

import by.guzypaul.branchingandloop.view.UserLocale;
import by.guzypaul.branchingandloop.view.UserView;

import java.util.ResourceBundle;

public class Runner {
    public static void main(String[] args) {
        UserLocale userLocale = new UserLocale();
        ResourceBundle resourceBundle = userLocale.defineLanguage();
        UserView userView = new UserView(resourceBundle);
        userView.userInteraction();
    }
}
