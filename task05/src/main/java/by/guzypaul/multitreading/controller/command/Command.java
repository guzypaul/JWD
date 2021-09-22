package by.guzypaul.multitreading.controller.command;

public interface Command {
    String execute() throws CommandException;
}
