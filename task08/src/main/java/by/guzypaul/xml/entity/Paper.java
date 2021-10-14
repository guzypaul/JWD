package by.guzypaul.xml.entity;

import java.time.LocalDate;
import java.util.Objects;

public abstract class Paper {
    private String id;
    private String title;
    private Chars chars;
    private LocalDate dateOfPrint;

    public Paper() {
    }

    public Paper(String id, String title, Chars chars, LocalDate dateOfPrint) {
        this.id = id;
        this.title = title;
        this.chars = chars;
        this.dateOfPrint = dateOfPrint;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
        return Objects.equals(getId(), paper.getId()) && Objects.equals(getTitle(), paper.getTitle()) && Objects.equals(getChars(), paper.getChars()) && Objects.equals(getDateOfPrint(), paper.getDateOfPrint());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getTitle(), getChars(), getDateOfPrint());
    }

    @Override
    public String toString() {
        return "Paper{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", chars=" + chars +
                ", dateOfPrint=" + dateOfPrint +
                '}';
    }
}
