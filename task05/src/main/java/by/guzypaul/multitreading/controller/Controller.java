package by.guzypaul.multitreading.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Controller {
    private static final Logger logger = LogManager.getLogger();
    public String executeTask(String commandName) {
        try{
            String response = CommandProvider.findCommandByName(commandName).execute();
            return response;
        } catch (CommandException e) {
            logger.error(e.getMessage());
            return "Kaput!";
        }
    }
}
