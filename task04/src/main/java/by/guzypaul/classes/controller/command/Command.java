package by.guzypaul.classes.controller.command;

import by.guzypaul.classes.controller.CommandException;

public interface Command {
    String execute() throws CommandException;
}
