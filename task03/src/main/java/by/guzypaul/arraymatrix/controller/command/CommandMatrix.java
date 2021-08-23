package by.guzypaul.arraymatrix.controller.command;

import by.guzypaul.arraymatrix.entity.MatrixEntity;

public interface CommandMatrix {
    void execute(MatrixEntity objectOne, MatrixEntity objectTwo );
}
