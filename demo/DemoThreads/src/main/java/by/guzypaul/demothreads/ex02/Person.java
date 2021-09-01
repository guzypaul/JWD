package by.guzypaul.demothreads.ex02;

public class Person {
    private String surname;

    public Person() {
    }

    public Person(final String newSurname) {surname = newSurname;}

    public String getSurname() {
        return surname;
    }

    public void setSurname(final String newSurname) {
        surname = newSurname;
    }
}
