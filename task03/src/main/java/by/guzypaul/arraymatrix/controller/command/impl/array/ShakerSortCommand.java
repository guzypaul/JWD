package by.guzypaul.arraymatrix.controller.command.impl.array;

import by.guzypaul.arraymatrix.controller.command.Command;
import by.guzypaul.arraymatrix.service.array.impl.ShakerSortImpl;

public class ShakerSortCommand implements Command {
    ShakerSortImpl sort;

    public ShakerSortCommand(ShakerSortImpl sort) {
        this.sort = sort;
    }

    @Override
    public void execute() {
        //sort.shakerSort();
    }
}
