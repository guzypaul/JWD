package by.guzypaul.figures.observer;

import by.guzypaul.figures.entity.Pyramid;

import java.util.EventObject;

public class PyramidEvent extends EventObject {
    /**
     * Constructs a prototypical Event.
     *
     * @param source the object on which the Event initially occurred
     * @throws IllegalArgumentException if source is null
     */
    public PyramidEvent(Object source) {
        super(source);
    }

    @Override
    public Pyramid getSource() {
        return (Pyramid)super.getSource();
    }
}
