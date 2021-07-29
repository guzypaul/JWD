package by.guzypaul.first.entity;

import org.apache.logging.log4j.LogManager;

import java.util.Objects;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Rectangle {
    private double width;
    private double length;
    private static final Logger logger = LogManager.getLogger();
    public Rectangle() {
        logger.log(Level.ERROR, "created EmptyRectangle ");
    }

    public Rectangle(double width) {
        this.width = width;
        this.length = width * 2;
        logger.log(Level.ERROR, "created Rectangle ");
        logger.log(Level.INFO, "created Rectangle (logInfo) ");
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rectangle)) return false;

        Rectangle rectangle = (Rectangle) o;

        if (Double.compare(rectangle.getWidth(), getWidth()) != 0) return false;
        return Double.compare(rectangle.getLength(), getLength()) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(getWidth());
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getLength());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }
}
