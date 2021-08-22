package by.guzypaul.arraymatrix.controller.command.impl.array;

import by.guzypaul.arraymatrix.controller.command.Command;
import by.guzypaul.arraymatrix.service.array.impl.SelectionSortImpl;

public class SelectionSortCommand implements Command {

    SelectionSortImpl sort;

    public SelectionSortCommand(SelectionSortImpl sort) {
        this.sort = sort;
    }

    @Override
    public void execute() {
        //sort.selectionSort();
    }
}
