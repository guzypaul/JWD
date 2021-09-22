package by.guzypaul.multitreading.controller;

import by.guzypaul.multitreading.controller.command.Command;
import by.guzypaul.multitreading.controller.command.CommandException;
import by.guzypaul.multitreading.controller.command.impl.MatrixDiagonalBooleanInserterCommand;
import by.guzypaul.multitreading.controller.command.impl.MatrixDiagonalLockInserterCommand;

import java.util.Arrays;

public enum CommandProvider {
    INSERT_BY_BOOLEAN(new MatrixDiagonalBooleanInserterCommand()),
    INSERT_BY_LOCK(new MatrixDiagonalLockInserterCommand());

    private Command command;

    CommandProvider(Command command) {
        this.command = command;
    }

    public Command getCommand() {
        return command;
    }

    public static Command findCommandByName(String name) throws CommandException {
        return Arrays.stream(CommandProvider.values())
                .filter(currentCommandType -> currentCommandType.name().equals(name))
                .map(CommandProvider::getCommand)
                .findFirst()
                .orElseThrow(() -> new CommandException("Invalid command name"));
    }
}
