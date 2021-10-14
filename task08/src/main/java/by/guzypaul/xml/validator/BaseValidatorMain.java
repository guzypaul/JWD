package by.guzypaul.xml.validator;
import java.io.*;
import javax.xml.XMLConstants;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import by.guzypaul.xml.handler.PaperErrorHandler;
import org.xml.sax.SAXException;

public class BaseValidatorMain {
    public static void main(String[] args) {
        String language = XMLConstants.W3C_XML_SCHEMA_NS_URI;
        String fileName = "src/main/resources/data/papers.xml";
        String schemaName = "src/main/resources/data/papers.xsd";
        SchemaFactory factory = SchemaFactory.newInstance(language);
        File schemaLocation = new File(schemaName);
        try {
// schema creation
            Schema schema = factory.newSchema(schemaLocation);
// creating a schema-based validator
            Validator validator = schema.newValidator();
            Source source = new StreamSource(fileName);
// document check
            validator.setErrorHandler(new PaperErrorHandler());
            validator.validate(source);
        } catch (SAXException | IOException e) {
            System.err.println(fileName + " is not correct or valid");
        }
    }
}
