package by.guzypaul.arraymatrix.entity;

import by.guzypaul.arraymatrix.exception.ArrayException;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ArrayEntity {


    public final static Logger logger = LogManager.getLogger();
    private int[] array;

    public ArrayEntity(int[] array) throws ArrayException {
        if (array == null) {
            throw new ArrayException("array equals null");
        }
        this.array = array;
    }

    public int[] getArray() {
        logger.log(Level.INFO, "get array");
        return array.clone();
    }

    public int getArrayElementByIndex(int index) throws ArrayException {
        if (index <= array.length - 1 & index >= 0) {
            logger.log(Level.INFO, "get element " + array[index] + " index: " + index);
            return array[index];
        } else {
            throw new ArrayException("Index Out of bond");
        }
    }

    public void setArrayElementNyIndex(int index, int element) throws ArrayException {
        if (index <= array.length - 1 & index >= 0) {
            array[index] = element;
            logger.log(Level.INFO, "set element " + element + " index: " + index);
        } else {
            throw new ArrayException("Index Out of bond");
        }
    }

    public void setArray(int[] array) throws ArrayException {
        if (array != null) {
            this.array = array;
            logger.log(Level.INFO, "set array");
        } else {
            throw new ArrayException("array equals null");
        }
    }
}
