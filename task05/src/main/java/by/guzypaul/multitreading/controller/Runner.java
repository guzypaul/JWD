package by.guzypaul.multitreading.controller;

import by.guzypaul.multitreading.dao.exception.DaoException;
import by.guzypaul.multitreading.dao.factory.DaoFactory;
import by.guzypaul.multitreading.dao.parser.FileDataParser;
import by.guzypaul.multitreading.dao.reader.TextFileReader;
import by.guzypaul.multitreading.service.inserter.MatrixDiagonalLockInserter;

public class Runner {
    public static void main(String[] args) throws DaoException, InterruptedException {
//        TextFileReader testReader = new TextFileReader();
//
//        FileDataParser testParser = new FileDataParser();
//        //System.out.println(testParser.parseMatrix(testReader.readStringsFromFile("matrixData.txt")));
        MatrixDiagonalLockInserter test1 = new MatrixDiagonalLockInserter(1);
        MatrixDiagonalLockInserter test2 = new MatrixDiagonalLockInserter(2);
        MatrixDiagonalLockInserter test3 = new MatrixDiagonalLockInserter(3);
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
