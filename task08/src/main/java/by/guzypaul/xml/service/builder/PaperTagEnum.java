package by.guzypaul.xml.service.builder;

import by.guzypaul.xml.service.ServiceException;

import java.util.Arrays;

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

    public static PaperTagEnum findPaperTag(String name) throws ServiceException {
        return Arrays.stream(PaperTagEnum.values())
                .filter(currentPaperTag -> currentPaperTag.getTagName().equals(name))
                .findFirst()
                .orElseThrow(() -> new ServiceException("No tag!")); // todo
    }
}

