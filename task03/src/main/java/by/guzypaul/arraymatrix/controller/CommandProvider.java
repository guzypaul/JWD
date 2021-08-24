package by.guzypaul.arraymatrix.controller;

import by.guzypaul.arraymatrix.controller.command.CommandArray;
import by.guzypaul.arraymatrix.controller.command.impl.array.BubbleSortCommandArray;

import java.util.HashMap;
import java.util.Map;

public class CommandProvider {
    private Map<String, CommandArray> commands = new HashMap<>();

    public CommandProvider() {
        commands.put("BUBBLE_SORT", new BubbleSortCommandArray());
        commands.put("INSERTION_SORT", new BubbleSortCommandArray());
        commands.put("SELECTION_SORT", new BubbleSortCommandArray());
        commands.put("SHAKER_SORT", new BubbleSortCommandArray());
        commands.put("SHELL_SORT", new BubbleSortCommandArray());
    }

    public CommandArray getCommand(String commandName) {
        CommandArray command = commands.get(commandName);
        return command;
    }
}
