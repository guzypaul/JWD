package by.guzypaul.xml.service.builder;

import by.guzypaul.xml.entity.*;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.Set;

import by.guzypaul.xml.service.ServiceException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import java.io.IOException;

public class PaperDomBuilder {
    private static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    private Set<Paper> papers;
    private DocumentBuilder docBuilder;

    public PaperDomBuilder() throws ServiceException {
        papers = new HashSet<>();
        // configuration
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        try {
            docBuilder = factory.newDocumentBuilder();
        } catch (ParserConfigurationException e) {
            throw new ServiceException(e);
        }
    }

    public Set<Paper> getPapers() {
        return papers;
    }

    public void buildSetPapers(String filePath) throws ServiceException {
        Document doc;
        try {
            doc = docBuilder.parse(filePath);
            Element root = doc.getDocumentElement();
            // getting a list of <paper> child elements
            NodeList bookletList = root.getElementsByTagName(PaperTagEnum.BOOKLET.getTagName());
            NodeList newspaperList = root.getElementsByTagName(PaperTagEnum.NEWSPAPER.getTagName());
            NodeList magazineList = root.getElementsByTagName(PaperTagEnum.MAGAZINE.getTagName());

            for (int i = 0; i < bookletList.getLength(); i++) {
                Element paperElement = (Element) bookletList.item(i);
                Booklet booklet = buildBooklet(paperElement);
                papers.add(booklet);
            }

            for (int i = 0; i < newspaperList.getLength(); i++) {
                Element paperElement = (Element) newspaperList.item(i);
                Newspaper newspaper = buildNewspaper(paperElement);
                papers.add(newspaper);
            }

            for (int i = 0; i < magazineList.getLength(); i++) {
                Element paperElement = (Element) magazineList.item(i);
                Magazine magazine = buildMagazine(paperElement);
                papers.add(magazine);
            }

        } catch (IOException | SAXException e) {
            throw new ServiceException(e);
        }
    }

    private Magazine buildMagazine(Element paperElement) {
        Magazine magazine = new Magazine();
        buildPaper(paperElement, magazine);
        magazine.setGloss(Boolean.parseBoolean(getElementTextContent(paperElement,
                PaperTagEnum.IS_GLOSS.getTagName())));
        magazine.setIndex(Integer.parseInt(getElementTextContent(paperElement, PaperTagEnum.INDEX.getTagName())));

        return magazine;
    }

    private Newspaper buildNewspaper(Element paperElement) {
        Newspaper newspaper = new Newspaper();
        buildPaper(paperElement, newspaper);
        newspaper.setIndex(Integer.parseInt(getElementTextContent(paperElement, PaperTagEnum.INDEX.getTagName())));

        return newspaper;
    }

    private Booklet buildBooklet(Element paperElement) {
        Booklet booklet = new Booklet();
        buildPaper(paperElement, booklet);
        booklet.setGloss(Boolean.parseBoolean(getElementTextContent(paperElement,
                PaperTagEnum.IS_GLOSS.getTagName())));

        return booklet;
    }


    private void buildPaper(Element paperElement, Paper paper) {
        Chars chars = new Chars();

        paper.setId(paperElement.getAttribute(PaperTagEnum.ID.getTagName()));
        paper.setTitle(getElementTextContent(paperElement, PaperTagEnum.TITLE.getTagName()));
        paper.setMonthly(Boolean.parseBoolean(getElementTextContent(paperElement,
                PaperTagEnum.IS_MONTHLY.getTagName())));
        paper.setDateOfPrint(LocalDate.parse(getElementTextContent(paperElement,
                PaperTagEnum.DATE_OF_PRINT.getTagName()), DATE_TIME_FORMATTER));

        Element charsElement =
                (Element) paperElement.getElementsByTagName(PaperTagEnum.CHARS.getTagName()).item(0);
        chars.setColor(Boolean.parseBoolean(getElementTextContent(charsElement, PaperTagEnum.IS_COLOR.getTagName())));
        chars.setVolume(Integer.parseInt(getElementTextContent(charsElement, PaperTagEnum.VOLUME.getTagName())));

        paper.setChars(chars);
    }

    // get the text content of the tag
    private static String getElementTextContent(Element element, String elementName) {
        NodeList nList = element.getElementsByTagName(elementName);
        Node node = nList.item(0);
        String text = node.getTextContent();
        return text;
    }
}





