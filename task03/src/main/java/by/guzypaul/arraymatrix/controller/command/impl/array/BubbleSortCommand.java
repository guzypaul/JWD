package by.guzypaul.arraymatrix.controller.command.impl.array;

import by.guzypaul.arraymatrix.controller.command.Command;
import by.guzypaul.arraymatrix.service.array.impl.BubbleSortImpl;

public class BubbleSortCommand implements Command {

    BubbleSortImpl sort;

    public BubbleSortCommand(BubbleSortImpl sort) {
        this.sort = sort;
    }

    @Override
    public void execute() {
        //sort.bubbleSort();
    }
}
