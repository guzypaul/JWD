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

public class ArrayCreator {
    public final static Logger logger = LogManager.getLogger();

    Parser customParser;
    StringFromTextFileReader reader;

    public int[] createCustomArraysFromFile(String filePath) throws ArrayException, DaoException {
        int[] tmpArray = null;

        customParser = new Parser();
        reader = new StringFromTextFileReader();
        List<String> stringsFromFile = reader.readStringsFromFile(filePath);
        for (String string : stringsFromFile) {
            if (CheckStringFromFile.isStringValid(string)) {
                tmpArray = customParser.parseArrayFromString(string);
                ArrayEntity customArray = new ArrayEntity(tmpArray);

                logger.log(Level.INFO, "created CustomArray object, " );
            }
        }
        logger.log(Level.INFO, "return CustomArrayList");
        return tmpArray;
    }
}
