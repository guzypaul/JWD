package by.guzypaul.arraymatrix.entity;

import by.guzypaul.arraymatrix.entity.exception.ArrayException;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class ArrayEntity {


    public final static Logger logger = LogManager.getLogger();
    public int[] array;

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


    public void setArray(int[] array) throws ArrayException {
        if (array != null) {
            this.array = array;
            logger.log(Level.INFO, "set array");
        } else {
            throw new ArrayException("array equals null");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ArrayEntity)) return false;

        ArrayEntity that = (ArrayEntity) o;

        return Arrays.equals(getArray(), that.getArray());
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(getArray());
    }

    @Override
    public String toString() {
        return "ArrayEntity{" +
                "array=" + Arrays.toString(array) +
                '}';
    }
}
