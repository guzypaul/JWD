package by.guzypaul.xml.service.builder;

import by.guzypaul.xml.entity.*;
import by.guzypaul.xml.service.ServiceException;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.Set;

public class PaperStaxBuilder {
    private static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    private Set<Paper> papers; // todo to abstract
    private XMLInputFactory inputFactory;

    public PaperStaxBuilder() {
        inputFactory = XMLInputFactory.newInstance();
        papers = new HashSet<>();
    }

    public Set<Paper> getPapers() { // todo to abstract
        return papers;
    }

    public void buildSetPapers(String filePath) throws ServiceException { // todo to abstract
        try (FileInputStream inputStream = new FileInputStream(new File(filePath))) {
            XMLStreamReader reader = inputFactory.createXMLStreamReader(inputStream);

            while (reader.hasNext()) {
                int type = reader.next();
                if (type == XMLStreamReader.START_ELEMENT) {
                    if (PaperTagEnum.BOOKLET.getTagName().equals(reader.getLocalName())) {
                        Booklet booklet = buildBooklet(reader);
                        papers.add(booklet);
                    } else if (PaperTagEnum.MAGAZINE.getTagName().equals(reader.getLocalName())) {
                        Magazine magazine = buildMagazine(reader);
                        papers.add(magazine);
                    } else if (PaperTagEnum.NEWSPAPER.getTagName().equals(reader.getLocalName())) {
                        Newspaper newspaper = buildNewspaper(reader);
                        papers.add(newspaper);
                    }
                }
            }
        } catch (IOException | XMLStreamException e) {
            throw new ServiceException(e);
        }
    }

    private Newspaper buildNewspaper(XMLStreamReader reader) { //todo
        return null;
    }

    private Magazine buildMagazine(XMLStreamReader reader) { //todo
        return null;
    }

    private Booklet buildBooklet(XMLStreamReader reader) throws XMLStreamException, ServiceException {
        Booklet booklet = new Booklet();
        booklet.setId(reader.getAttributeValue(null, PaperTagEnum.ID.getTagName()));

        while (reader.hasNext()) {
            int type = reader.next();
            switch (type) {
                case XMLStreamReader.START_ELEMENT:
                    PaperTagEnum paperTag = PaperTagEnum.findPaperTag(reader.getLocalName());
                    if (paperTag == PaperTagEnum.IS_GLOSS) {
                        booklet.setGloss(Boolean.parseBoolean(getXMLText(reader)));
                    } else {
                        buildPaper(paperTag, booklet, reader);
                    }
                    break;

                case XMLStreamReader.END_ELEMENT:
                    PaperTagEnum paperEnumTag = PaperTagEnum.findPaperTag(reader.getLocalName());
                    if (paperEnumTag == PaperTagEnum.BOOKLET) {
                        return booklet;
                    }
            }
        }

        throw new ServiceException("No element");
    }

    private void buildPaper(PaperTagEnum paperTag, Paper paper, XMLStreamReader reader) throws XMLStreamException {
        switch (paperTag) {
            case TITLE:
                paper.setTitle(getXMLText(reader));
                break;

            case IS_MONTHLY:
                paper.setMonthly(Boolean.parseBoolean(getXMLText(reader)));
                break;

            case DATE_OF_PRINT:
                paper.setDateOfPrint(LocalDate.parse(getXMLText(reader), DATE_TIME_FORMATTER));
                break;

            case CHARS:
                paper.setChars(buildChars(paperTag));
                break;
        }
    }

    private Chars buildChars(PaperTagEnum paperTag) { //todo
        return null;
    }

    private String getXMLText(XMLStreamReader reader) throws XMLStreamException {
        String text = null;
        if (reader.hasNext()) {
            reader.next();
            text = reader.getText();
        }

        return text;
    }
}
