package by.guzypaul.arraymatrix.controller;

public class Controller {
    private final CommandProvider provider = new CommandProvider();
    public void executeTask(String commandName){
        Command executionCommand = provider.getCommand(commandName);
    }
}
