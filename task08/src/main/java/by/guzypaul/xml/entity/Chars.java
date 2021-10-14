package by.guzypaul.xml.entity;

import java.util.Objects;

public class Chars {
    private int volume;
    private boolean isColor;

    public Chars() {
    }

    public Chars(int volume, boolean isColor) {
        this.volume = volume;
        this.isColor = isColor;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isColor() {
        return isColor;
    }

    public void setColor(boolean color) {
        isColor = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Chars)) return false;
        Chars chars = (Chars) o;
        return getVolume() == chars.getVolume() && isColor() == chars.isColor();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getVolume(), isColor());
    }

    @Override
    public String toString() {
        return "Chars{" +
                "volume=" + volume +
                ", isColor=" + isColor +
                '}';
    }
}
