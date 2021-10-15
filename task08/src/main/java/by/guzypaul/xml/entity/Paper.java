package by.guzypaul.xml.entity;

import java.time.LocalDate;
import java.util.Objects;

public abstract class Paper {
    private String id;
    private String title;
    private boolean isMonthly;
    private LocalDate dateOfPrint;
    private Chars chars;

    public Paper() {
    }

    public Paper(String id, String title, boolean isMonthly, LocalDate dateOfPrint, Chars chars) {
        this.id = id;
        this.title = title;
        this.isMonthly = isMonthly;
        this.dateOfPrint = dateOfPrint;
        this.chars = chars;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isMonthly() {
        return isMonthly;
    }

    public void setMonthly(boolean monthly) {
        isMonthly = monthly;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Chars getChars() {
        return chars;
    }

    public void setChars(Chars chars) {
        this.chars = chars;
    }

    public LocalDate getDateOfPrint() {
        return dateOfPrint;
    }

    public void setDateOfPrint(LocalDate dateOfPrint) {
        this.dateOfPrint = dateOfPrint;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Paper)) return false;
        Paper paper = (Paper) o;
        return isMonthly() == paper.isMonthly() && Objects.equals(getId(),
                paper.getId()) && Objects.equals(getTitle(),
                paper.getTitle()) && Objects.equals(getDateOfPrint(),
                paper.getDateOfPrint()) && Objects.equals(getChars(),
                paper.getChars());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getTitle(), isMonthly(), getDateOfPrint(), getChars());
    }

    @Override
    public String toString() {
        return "Paper{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", isMonthly=" + isMonthly +
                ", dateOfPrint=" + dateOfPrint +
                ", chars=" + chars +
                '}';
    }
}
