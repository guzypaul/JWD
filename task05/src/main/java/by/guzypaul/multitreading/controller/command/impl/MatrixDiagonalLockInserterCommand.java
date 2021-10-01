package by.guzypaul.multitreading.controller.command.impl;

import by.guzypaul.multitreading.controller.command.Command;
import by.guzypaul.multitreading.controller.CommandException;
import by.guzypaul.multitreading.dao.factory.DaoFactory;
import by.guzypaul.multitreading.service.factory.ServiceFactory;
import by.guzypaul.multitreading.service.inserter.MatrixDiagonalBooleanInserter;
import by.guzypaul.multitreading.service.inserter.MatrixDiagonalLockInserter;

public class MatrixDiagonalLockInserterCommand implements Command {
    @Override
    public String execute() throws CommandException {
        try{
            MatrixDiagonalLockInserter firstThread = new MatrixDiagonalLockInserter(1);
            MatrixDiagonalLockInserter secondThread = new MatrixDiagonalLockInserter(2);
            MatrixDiagonalLockInserter thirdThread = new MatrixDiagonalLockInserter(3);
            System.out.println(DaoFactory.getInstance().getMatrixDaoImpl().findMatrix());

            firstThread.start();
            secondThread.start();
            thirdThread.start();

            firstThread.join();
            secondThread.join();
            thirdThread.join();
            System.out.println(DaoFactory.getInstance().getMatrixDaoImpl().findMatrix());

            MatrixDiagonalBooleanInserter.resetCounter();
            ServiceFactory.getInstance().getMatrixService().matrixReset();
            return " Diagonal was filled!";
        } catch (InterruptedException e) {
            throw new CommandException(e.getMessage());
        }
    }
}
