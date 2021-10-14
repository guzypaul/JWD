package by.guzypaul.xml.handler;

public enum PaperXmlTag {

    STUDENTS("students"),
    LOGIN("login");

    private String value;
    PaperXmlTag(String value) {
        this.value = value;
    }
    public String getValue() {
        return value;
    }
}
