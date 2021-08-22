package by.guzypaul.arraymatrix.controller.command.impl.matrix;

import by.guzypaul.arraymatrix.controller.command.Command;
import by.guzypaul.arraymatrix.service.matrix.impl.MatrixSubstractionImpl;

public class MatrixSubstractionCommand implements Command {

    MatrixSubstractionImpl substractor;

    public MatrixSubstractionCommand(MatrixSubstractionImpl sort) {

        this.substractor = substractor;
    }

    @Override
    public void execute() {
        //substractor.substract();
    }
}
