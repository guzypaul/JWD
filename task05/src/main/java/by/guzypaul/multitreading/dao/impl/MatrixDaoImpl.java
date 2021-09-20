package by.guzypaul.multitreading.dao.impl;

import by.guzypaul.multitreading.dao.MatrixDao;
import by.guzypaul.multitreading.dao.exception.DaoException;
import by.guzypaul.multitreading.dao.parser.FileDataParser;
import by.guzypaul.multitreading.dao.reader.TextFileReader;
import by.guzypaul.multitreading.entity.Matrix;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MatrixDaoImpl implements MatrixDao {
    private Matrix parseMatrix;

    public MatrixDaoImpl() throws DaoException {
        parseMatrix = readMatrix();
    }

    @Override
    public Matrix findMatrix() {
        return parseMatrix;
    }

    @Override
    public void setElement(int i, int j, int element) {
        parseMatrix.setElement(i, i, element);
    }


    private Matrix readMatrix() throws DaoException {
        TextFileReader dataReader = new TextFileReader();
        FileDataParser dataParser = new FileDataParser();
//        Function<String, Integer> rangeFunction = new Function<String, Integer>() { //annonymous
//            @Override
//            public Integer apply(String newString) {
//                return Integer.parseInt(newString);
//            }
//        };

//        Function<String, Integer> rangeFunction = newString -> Integer.parseInt(newString); //lambda
        Function<String, Integer> rangeFunction = Integer::parseInt;

        List<Integer> ranges = dataReader.readStringsFromFile("matrixRange.txt").stream()
                .map(rangeFunction) //.map(Integer::parseInt)
                .collect(Collectors.toList());

        return dataParser.parseMatrix(ranges.get(0), ranges.get(1),
                dataReader.readStringsFromFile("matrixData.txt"));
    }
}
