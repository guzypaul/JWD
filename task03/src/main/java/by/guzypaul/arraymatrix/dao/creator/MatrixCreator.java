package by.guzypaul.arraymatrix.dao.creator;

import by.guzypaul.arraymatrix.dao.exception.DaoException;
import by.guzypaul.arraymatrix.dao.parser.Parser;
import by.guzypaul.arraymatrix.dao.reader.StringFromTextFileReader;
import by.guzypaul.arraymatrix.dao.validator.CheckStringFromFile;
import by.guzypaul.arraymatrix.entity.ArrayEntity;
import by.guzypaul.arraymatrix.entity.exception.ArrayException;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

public class MatrixCreator {
    public final static Logger logger = LogManager.getLogger();

    Parser customParser;
    StringFromTextFileReader reader;

    public int[][] createCustomMatrixFromFile(String filePath) throws DaoException {
        int[][] matrix = null;

        customParser = new Parser();
        reader = new StringFromTextFileReader();
        List<String> stringsFromFile = reader.readStringsFromFile(filePath);
        int i = 0;
        for (String string : stringsFromFile) {
            if (CheckStringFromFile.isStringValid(string)) {
                int[] tmpArray = customParser.parseArrayFromString(string);
                matrix[i] = tmpArray;
                i++;
                logger.log(Level.INFO, "created CustomArray object, " );
            }
        }
        logger.log(Level.INFO, "return matrix");
        return matrix;
    }
}
