package by.guzypaul.classes.controller;

import by.guzypaul.classes.controller.command.Command;

import java.util.Arrays;

public enum CommandProvider {
//    INSERT_BY_BOOLEAN(new MatrixDiagonalBooleanInserterCommand()),
//    INSERT_BY_LOCK(new MatrixDiagonalLockInserterCommand()),
//    INSERT_BY_QUEUE(new MatrixDiagonalQueueInserterCommand()),
//    INSERT_BY_SET(new MatrixDiagonalSetInserterCommand());

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
