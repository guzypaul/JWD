package by.guzypaul.xml.entity;

import java.time.LocalDate;
import java.util.Objects;

public class Magazine extends Paper{
    private int index;
    private boolean isGloss;
    private String genre;

    public Magazine() {
    }

    public Magazine(int index, boolean isGloss, String genre) {
        this.index = index;
        this.isGloss = isGloss;
        this.genre = genre;
    }

    public Magazine(String id, String title, boolean isMonthly, LocalDate dateOfPrint, Chars chars, int index, boolean isGloss, String genre) {
        super(id, title, isMonthly, dateOfPrint, chars);
        this.index = index;
        this.isGloss = isGloss;
        this.genre = genre;
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

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Magazine magazine = (Magazine) o;
        return index == magazine.index && isGloss == magazine.isGloss && Objects.equals(genre, magazine.genre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), index, isGloss, genre);
    }

    @Override
    public String toString() {
        return super.toString() + " {" +
                "index=" + index +
                ", isGloss=" + isGloss +
                ", genre='" + genre + '\'' +
                '}';
    }
}
