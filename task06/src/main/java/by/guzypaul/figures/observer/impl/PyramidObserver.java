package by.guzypaul.figures.observer.impl;

import by.guzypaul.figures.entity.Pyramid;
import by.guzypaul.figures.observer.Observer;
import by.guzypaul.figures.observer.PyramidEvent;
import by.guzypaul.figures.service.ShapeCalculator;
import by.guzypaul.figures.service.impl.PyramidCalculator;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PyramidObserver implements Observer {
    public static final Logger logger = LogManager.getLogger();
    private Warehouse warehouse= Warehouse.getInstance();;
    private ShapeCalculator calculator = new PyramidCalculator();;
    private ShapeParametersStorage shapeParametersStorage;
    private Pyramid pyramid;

    @Override
    public void parameterChanged(PyramidEvent event) {
    }
}
