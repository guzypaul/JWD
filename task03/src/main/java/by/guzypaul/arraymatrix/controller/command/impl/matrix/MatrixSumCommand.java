package by.guzypaul.arraymatrix.controller.command.impl.matrix;

import by.guzypaul.arraymatrix.controller.command.Command;
import by.guzypaul.arraymatrix.service.matrix.impl.MatrixSumImpl;

public class MatrixSumCommand implements Command {
    MatrixSumImpl sumCalc;

    public MatrixSumCommand(MatrixSumImpl sort) {

        this.sumCalc = sumCalc;
    }

    @Override
    public void execute() {
        //sumCalc.sum();
    }
}
