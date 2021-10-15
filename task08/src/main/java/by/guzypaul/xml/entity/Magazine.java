package by.guzypaul.xml.entity;

import java.time.LocalDate;
import java.util.Objects;

public class Magazine extends Paper{
    private int index;
    private boolean isGloss;

    public Magazine() {
    }

    public Magazine(int index, boolean isGloss) {
        this.index = index;
        this.isGloss = isGloss;
    }

    public Magazine(String id, String title, boolean isMonthly, LocalDate dateOfPrint, Chars chars, int index, boolean isGloss) {
        super(id, title, isMonthly, dateOfPrint, chars);
        this.index = index;
        this.isGloss = isGloss;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public boolean isGloss() {
        return isGloss;
    }

    public void setGloss(boolean gloss) {
        isGloss = gloss;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Magazine)) return false;
        if (!super.equals(o)) return false;
        Magazine magazine = (Magazine) o;
        return getIndex() == magazine.getIndex() && isGloss() == magazine.isGloss();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getIndex(), isGloss());
    }

    @Override
    public String toString() {
        return super.toString() +
                "index=" + index +
                ", isGloss=" + isGloss +
                '}';
    }
}
