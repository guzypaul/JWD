package by.guzypaul.xml.service.builder;

import by.guzypaul.xml.service.handler.PaperHandler;
import by.guzypaul.xml.service.ServiceException;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;

public class PaperSaxBuilder extends PaperBuilder {
    private XMLReader reader;
    private PaperHandler handler = new PaperHandler();

    public PaperSaxBuilder() throws ServiceException {
        SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
        try {
            SAXParser saxParser = saxParserFactory.newSAXParser();
            reader = saxParser.getXMLReader();
            reader.setContentHandler(handler);
        } catch (ParserConfigurationException | SAXException e) {
            throw new ServiceException(e);
        }
    }

    @Override
    public void buildSetPapers(String filePath) throws ServiceException {
        try {
            reader.parse(filePath);
            setPapers(handler.getPapers());
        } catch (IOException | SAXException e) {
            throw new ServiceException(e);
        }
    }
}
