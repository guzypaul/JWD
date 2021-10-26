package by.guzypaul.xml.service.handler;

import by.guzypaul.xml.entity.*;
import by.guzypaul.xml.service.ServiceException;
import by.guzypaul.xml.service.builder.PaperTagEnum;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class PaperHandler extends DefaultHandler {
    private Set<Paper> papers;
    private Paper currentPaper;
    private PaperTagEnum currentTag;
    private Chars currentChars;

    public PaperHandler() {
        currentChars = new Chars();
        papers = new HashSet<>();
    }

    public Set<Paper> getPapers() {
        return this.papers;
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException,
            ServiceException {
        PaperTagEnum currentPaperTag = PaperTagEnum.findPaperTag(qName);
        switch (currentPaperTag) {
            case BOOKLET:
                Booklet booklet = new Booklet();
                booklet.setId(attributes.getValue(0));
                currentPaper = booklet;
                break;

            case MAGAZINE:
                Magazine magazine = new Magazine();
                magazine.setId(attributes.getValue(0));
                magazine.setGenre(attributes.getValue(1));
                currentPaper = magazine;
                break;

            case NEWSPAPER:
                Newspaper newspaper = new Newspaper();
                newspaper.setId(attributes.getValue(0));
                currentPaper = newspaper;
                break;

            default:
                currentTag = currentPaperTag;
                break;
        }
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        String data = new String(ch, start, length).trim();
        if (currentTag != null) {
            switch (currentTag) {
                case TITLE:
                    currentPaper.setTitle(data);
                    break;

                case IS_COLOR:
                    currentChars.setColor(Boolean.parseBoolean(data));
                    break;

                case VOLUME:
                    currentChars.setVolume(Integer.parseInt(data));
                    break;

                case IS_MONTHLY:
                    currentPaper.setMonthly(Boolean.parseBoolean(data));
                    break;

                case DATE_OF_PRINT:
                    currentPaper.setDateOfPrint(LocalDate.parse(data));
                    break;

                case INDEX:
                    if (currentPaper instanceof Magazine) {
                        Magazine magazine = (Magazine) currentPaper;
                        magazine.setIndex(Integer.parseInt(data));
                    } else if (currentPaper instanceof Newspaper) {
                        Newspaper newspaper = (Newspaper) currentPaper;
                        newspaper.setIndex(Integer.parseInt(data));
                    }
                    break;

                case IS_GLOSS:
                    if (currentPaper instanceof Magazine) {
                        Magazine magazine = (Magazine) currentPaper;
                        magazine.setGloss(Boolean.parseBoolean(data));
                    } else if (currentPaper instanceof Booklet) {
                        Booklet booklet = (Booklet) currentPaper;
                        booklet.setGloss(Boolean.parseBoolean(data));
                    }
                    break;
            }
        }

        currentTag = null;
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        if (PaperTagEnum.BOOKLET == PaperTagEnum.findPaperTag(qName) ||
                PaperTagEnum.MAGAZINE == PaperTagEnum.findPaperTag(qName) ||
                PaperTagEnum.NEWSPAPER == PaperTagEnum.findPaperTag(qName)) {
            papers.add(currentPaper);
        } else if (PaperTagEnum.CHARS == PaperTagEnum.findPaperTag(qName)) {
            currentPaper.setChars(currentChars);
            currentChars = new Chars();
        }
    }
}
