package by.guzypaul.multitreading.controller;

import by.guzypaul.multitreading.controller.command.CommandException;
import by.guzypaul.multitreading.dao.exception.DaoException;
import by.guzypaul.multitreading.dao.factory.DaoFactory;
import by.guzypaul.multitreading.dao.parser.FileDataParser;
import by.guzypaul.multitreading.dao.reader.TextFileReader;
import by.guzypaul.multitreading.service.inserter.MatrixDiagonalBooleanInserter;
import by.guzypaul.multitreading.service.inserter.MatrixDiagonalLockInserter;
import by.guzypaul.multitreading.service.inserter.MatrixDiagonalQueueInserter;
import by.guzypaul.multitreading.service.inserter.MatrixDiagonalSetInserter;
import by.guzypaul.multitreading.view.UserView;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Runner {
    private static final Logger logger = LogManager.getLogger(UserView.class);
    public static void main(String[] args) throws DaoException, InterruptedException, CommandException {

        MatrixDiagonalSetInserter test1 = new MatrixDiagonalSetInserter(1);
        MatrixDiagonalSetInserter test2 = new MatrixDiagonalSetInserter(2);
        MatrixDiagonalSetInserter test3 = new MatrixDiagonalSetInserter(3);
        System.out.println(DaoFactory.getInstance().getMatrixDaoImpl().findMatrix());

        test1.start();
        test2.start();
        test3.start();

        test1.join();
        test2.join();
        test3.join();
        System.out.println(DaoFactory.getInstance().getMatrixDaoImpl().findMatrix());

        //System.out.println(CommandProvider.findCommandByName("INSERT_BY_LOCK").getCommand());
        logger.info("fsdfd");
    }
}
