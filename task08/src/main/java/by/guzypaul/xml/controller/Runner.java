package by.guzypaul.xml.controller;

import by.guzypaul.xml.service.ServiceException;
import by.guzypaul.xml.service.builder.PaperBuilder;
import by.guzypaul.xml.service.builder.PaperDomBuilder;
import by.guzypaul.xml.service.builder.PaperSaxBuilder;
import by.guzypaul.xml.service.builder.PaperStaxBuilder;

public class Runner {
    public static void main(String[] args) throws ServiceException {
        PaperBuilder paperBuilder = new PaperSaxBuilder();
        paperBuilder.buildSetPapers("src/main/resources/data/papers.xml"); //todo get resource src/main/resources
        System.out.println(paperBuilder.getPapers());
    }
}
