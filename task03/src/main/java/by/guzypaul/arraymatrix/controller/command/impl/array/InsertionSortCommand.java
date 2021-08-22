package by.guzypaul.arraymatrix.controller.command.impl.array;

import by.guzypaul.arraymatrix.controller.command.Command;
import by.guzypaul.arraymatrix.service.array.impl.InsertionSortImpl;

public class InsertionSortCommand  implements Command {

    InsertionSortImpl sort;

    public InsertionSortCommand(InsertionSortImpl sort) {
        this.sort = sort;
    }

    @Override
    public void execute() {
        //sort.insertionSort();
    }
}
