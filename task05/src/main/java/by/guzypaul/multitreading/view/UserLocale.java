package by.guzypaul.multitreading.view;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.util.Locale;
import java.util.ResourceBundle;

public class UserLocale {
    private static final Logger logger = LogManager.getLogger(UserLocale.class);
    private static final String SELECT_LANGUAGE = "Choose language, plese!/Пожалуйста, выберите язык! " + "\n"
            + "1. English/ 2.Русский";

    public ResourceBundle defineLanguage(){
        PrintMessage printMessage = new PrintMessage();
        printMessage.printMessage(SELECT_LANGUAGE);
        char i = 0;
        try {
            i = (char) System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String country = "";
        String language = "";
        switch (i) {
            case '1':
                country = "US";
                language = "us";
                break;
            case '2':
                country = "RU";
                language = "ru";
                break;
        }
        Locale current = new Locale(language, country);
        ResourceBundle rb = ResourceBundle.getBundle("property.text", current);
        logger.log(Level.INFO, rb.getString("choiceLanguage"));
        return rb;
    }
}
