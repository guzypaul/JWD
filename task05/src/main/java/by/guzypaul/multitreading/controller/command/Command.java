package by.guzypaul.multitreading.controller.command;

import by.guzypaul.multitreading.controller.CommandException;

public interface Command {
    String execute() throws CommandException;
}
