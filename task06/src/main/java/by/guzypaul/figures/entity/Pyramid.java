package by.guzypaul.figures.entity;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;


public class Pyramid {
    public static final Logger logger = LogManager.getLogger();

    private Point[] points;

    //private final long id;
    //private String name;
    //private List<PyramidObserver> listPyramidObservers;
    //private static final int BIT_OFFSET = 32;


    public Pyramid(Point pointA, Point pointB, Point pointC, Point pointD, Point pointE) {
        this.points = points;
        points = new Point[5];
        points[0] = pointA;
        points[1] = pointB;
        points[2] = pointC;
        points[3] = pointD;
        points[4] = pointC;
    }

    public Pyramid(Point[] points) {
        this.points = points;
    }

    public Point[] getPoints() {
        return points.clone();
    }

    public void setPoints(Point[] points) {
        this.points = points;
        //notifyObservers();
    }

    public Point getPointA() {
        return points[0];
    }

    public Point getPointB() {
        return points[1];
    }

    public Point getPointC() {
        return points[2];
    }

    public Point getPointD() {
        return points[3];
    }

    public Point getPointE() {
        return points[4];
    }

    public void setPointA(Point point) {
        points[0] = point;
        //notifyObservers();
        logger.log(Level.INFO, "changed point A: " + point);
    }

    public void setPointB(Point point) {
        points[1] = point;
        //notifyObservers();
        logger.log(Level.INFO, "changed point B: " + point);
    }

    public void setPointC(Point point) {
        points[2] = point;
        //notifyObservers();
        logger.log(Level.INFO, "changed point C: " + point);
    }


    public void setPointD(Point point) {
        points[3] = point;
        //notifyObservers();
        logger.log(Level.INFO, "changed point D: " + point);
    }

    public void setPointE(Point point) {
        points[4] = point;
        //notifyObservers();
        logger.log(Level.INFO, "changed point E: " + point);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pyramid)) return false;
        Pyramid pyramid = (Pyramid) o;
        return Arrays.equals(getPoints(), pyramid.getPoints());
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(getPoints());
    }

    @Override
    public String toString() {
        return "Pyramid{" +
                "points=" + Arrays.toString(points) +
                '}';
    }
}
