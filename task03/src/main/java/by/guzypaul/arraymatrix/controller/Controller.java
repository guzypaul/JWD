package by.guzypaul.arraymatrix.controller;

public class Controller {

    private final CommandProvider provider = new CommandProvider();

    public String executeTask(String commandName){
        Command executionCommand = provider.getCommand(commandName);
        String response = executionCommand.execute();
        return response;
    }
}
