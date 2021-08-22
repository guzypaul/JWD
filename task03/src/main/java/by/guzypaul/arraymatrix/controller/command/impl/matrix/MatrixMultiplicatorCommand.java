package by.guzypaul.arraymatrix.controller.command.impl.matrix;

import by.guzypaul.arraymatrix.controller.command.Command;
import by.guzypaul.arraymatrix.service.matrix.impl.MatrixMultiplicatorImpl;

public class MatrixMultiplicatorCommand implements Command {
    MatrixMultiplicatorImpl multiplicator;

    public MatrixMultiplicatorCommand(MatrixMultiplicatorImpl sort) {
        this.multiplicator = multiplicator;
    }

    @Override
    public void execute() {
        //multiplicator.multiply();
    }
}
