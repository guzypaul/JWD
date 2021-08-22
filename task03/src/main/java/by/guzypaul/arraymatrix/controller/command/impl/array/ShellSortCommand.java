package by.guzypaul.arraymatrix.controller.command.impl.array;

import by.guzypaul.arraymatrix.controller.command.Command;
import by.guzypaul.arraymatrix.service.array.impl.ShellSortImpl;

public class ShellSortCommand implements Command {

    ShellSortImpl sort;

    public ShellSortCommand(ShellSortImpl sort) {
        this.sort = sort;
    }

    @Override
    public void execute() {
       // sort.shellSort();
    }
}
