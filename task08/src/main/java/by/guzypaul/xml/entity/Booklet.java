package by.guzypaul.xml.entity;

import java.time.LocalDate;
import java.util.Objects;

public class Booklet extends Paper{
    private boolean isGloss;

    public Booklet() {
    }

    public Booklet(String id, String title, boolean isMonthly, LocalDate dateOfPrint, Chars chars, boolean isGloss) {
        super(id, title, isMonthly, dateOfPrint, chars);
        this.isGloss = isGloss;
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
        if (!(o instanceof Booklet)) return false;
        if (!super.equals(o)) return false;
        Booklet booklet = (Booklet) o;
        return isGloss() == booklet.isGloss();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), isGloss());
    }

    @Override
    public String toString() {
        return super.toString() +
                "isGloss=" + isGloss +
                '}';
    }
}
