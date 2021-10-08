package by.guzypaul.xml.service;

import by.guzypaul.xml.entity.Paper;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.util.HashSet;
import java.util.Set;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import java.io.IOException;

public class PaperDomBuilder {
    private Set<Paper> papers;
    private DocumentBuilder docBuilder;

    public PaperDomBuilder() {
        papers = new HashSet<Paper>();
        // configuration
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        try {
            docBuilder = factory.newDocumentBuilder();
        } catch (ParserConfigurationException e) {
            e.printStackTrace(); // log
        }
    }

    public Set<Paper> getPapers() {
        return papers;
    }

    public void buildSetPapers(String filename) {
        Document doc;
        try {
            doc = docBuilder.parse(filename);
            Element root = doc.getDocumentElement();
            // getting a list of <paper> child elements
            NodeList papersList = root.getElementsByTagName("paper");
            for (int i = 0; i < papersList.getLength(); i++) {
                Element paperElement = (Element) papersList.item(i);
                Paper paper = buildPaper(paperElement);
                papers.add(paper);
            }
        } catch (IOException | SAXException e) {
            e.printStackTrace(); // log
        }
    }

    private Paper buildPaper(Element paperElement) {
        Paper paper = new Paper();
        // add null check
        paper.setTitle(getElementTextContent(paperElement, "title"));
        paper.setMonthly(Boolean.parseBoolean(getElementTextContent(paperElement, "monthly")));
        paper.setType(getElementTextContent(paperElement, "type"));
        Paper.Chars chars = paper.getChars();
        // init an address object
        Element charsElement =
                (Element) paperElement.getElementsByTagName("chars").item(0);
        chars.setColor(Boolean.parseBoolean(getElementTextContent(charsElement, "color")));
        chars.setVolume(Integer.parseInt(getElementTextContent(charsElement, "volume")));
        chars.setGloss(Boolean.parseBoolean(getElementTextContent(charsElement, "gloss")));
        chars.setIndex(Boolean.parseBoolean(getElementTextContent(charsElement, "index")));
        return paper;
    }

    // get the text content of the tag
    private static String getElementTextContent(Element element, String elementName) {
        NodeList nList = element.getElementsByTagName(elementName);
        Node node = nList.item(0);
        String text = node.getTextContent();
        return text;
    }
}





