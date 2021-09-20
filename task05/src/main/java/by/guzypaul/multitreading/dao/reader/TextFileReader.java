package by.guzypaul.multitreading.dao.reader;

import by.guzypaul.multitreading.dao.exception.DaoException;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class TextFileReader {
    private static final Logger logger = LogManager.getLogger();
    private static final String FILE_INPUT_EXCEPTION_MESSAGE = "File input exception";
    private static final String PATH_INFO = "info/";
    private static final String READ_STRING_FROM_FILE = "read string from file : ";

    public List<String> readStringsFromFile(String fileName) throws DaoException {
        String filePath = new File(getClass().getClassLoader()
                .getResource(PATH_INFO + fileName).getFile()).getAbsolutePath();
        List<String> stringsFromFile;
        try {
            stringsFromFile= Files.lines(Paths.get(filePath))
                    .collect(Collectors.toList());
        } catch (IOException e) {
            throw new DaoException(FILE_INPUT_EXCEPTION_MESSAGE,e);
        }
        logger.log(Level.INFO,READ_STRING_FROM_FILE + stringsFromFile );
        return stringsFromFile;
    }
}
