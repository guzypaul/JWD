package by.guzypaul.multitreading.controller;

import by.guzypaul.multitreading.dao.exception.DaoException;
import by.guzypaul.multitreading.dao.factory.DaoFactory;
import by.guzypaul.multitreading.dao.parser.FileDataParser;
import by.guzypaul.multitreading.dao.reader.TextFileReader;
import by.guzypaul.multitreading.service.inserter.MatrixDiagonalBooleanInserter;
import by.guzypaul.multitreading.service.inserter.MatrixDiagonalLockInserter;
import by.guzypaul.multitreading.service.inserter.MatrixDiagonalQueueInserter;
import by.guzypaul.multitreading.service.inserter.MatrixDiagonalSetInserter;

public class Runner {
    public static void main(String[] args) throws DaoException, InterruptedException {
//        TextFileReader testReader = new TextFileReader();
//
//        FileDataParser testParser = new FileDataParser();
//        //System.out.println(testParser.parseMatrix(testReader.readStringsFromFile("matrixData.txt")));
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
    }
}
