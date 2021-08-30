package by.guzypaul.classes.controller;

import by.guzypaul.classes.controller.command.CommandName;

import java.util.HashMap;
import java.util.Map;

public class CommandProvider {

    private Map<CommandName, Command> repository = new HashMap<>();

    public CommandProvider() {
       /* repository.put(CommandName.BUBBLE_SORT, new BubbleSortCommand());
        repository.put(CommandName.INSERTION_SORT, new InsertionSortCommand());
        repository.put(CommandName.SELECTION_SORT, new SelectionSortCommand());
        repository.put(CommandName.SHAKER_SORT, new ShakerSortCommand());
        repository.put(CommandName.SHELL_SORT, new ShellSortCommand());

        repository.put(CommandName.MATRIX_MULTIPLICATOR, new MatrixMultiplicatorCommand());
        repository.put(CommandName.MATRIX_SUBTRACTOR, new MatrixSubtractionCommand());
        repository.put(CommandName.MATRIX_SUM, new MatrixSumCommand());*/

    }

    public Command getCommand(String commandName) {
        Command command = repository.get(commandName);
        return command;
    }
}
