package by.guzypaul.xml.service.builder;

public enum PaperTagEnum {
    MAGAZINE("magazine"),
    BOOKLET("booklet"),
    NEWSPAPER("newspaper"),
    ID("id"),
    TITLE("title"),
    CHARS("chars"),
    IS_COLOR("is-color"),
    VOLUME("volume"),
    IS_MONTHLY("is-monthly"),
    INDEX("index"),
    IS_GLOSS("is-gloss"),
    DATE_OF_PRINT("date-of-print"),
    GENRE("genre");

    private String tagName;

    PaperTagEnum(String tagName) {
        this.tagName = tagName;
    }

    public String getTagName() {
        return tagName;
    }
}

