package by.guzypaul.xml.entity;

import java.time.LocalDate;
import java.util.Objects;

public class Newspaper extends Paper{
    private int index;

    public Newspaper() {
    }

    public Newspaper(int index) {
        this.index = index;
    }

    public Newspaper(String id, String title, boolean isMonthly, LocalDate dateOfPrint, Chars chars, int index) {
        super(id, title, isMonthly, dateOfPrint, chars);
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Newspaper)) return false;
        if (!super.equals(o)) return false;
        Newspaper newspaper = (Newspaper) o;
        return getIndex() == newspaper.getIndex();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getIndex());
    }

    @Override
    public String toString() {
        return super.toString() +
                " index=" + index +
                '}';
    }
}
