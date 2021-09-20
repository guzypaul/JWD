package by.guzypaul.figures.entity;

import java.util.List;

public class Pyramid {
    private final long id;
    private String name;
    private List<Point> pyramidPoints;
    private static final int TOP_POINT_IN_ARRAY = 3;
    private transient List<PyramidObserver> listPyramidObservers;
    private static final int BIT_OFFSET = 32;

}
