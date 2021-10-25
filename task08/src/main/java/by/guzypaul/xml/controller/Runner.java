package by.guzypaul.xml.controller;

import by.guzypaul.xml.service.ServiceException;
import by.guzypaul.xml.service.builder.PaperDomBuilder;

public class Runner {
    public static void main(String[] args) throws ServiceException {
        PaperDomBuilder domBuilder = new PaperDomBuilder();
        domBuilder.buildSetPapers("src/main/resources/data/papers.xml"); //todo get resource src/main/resources
        System.out.println(domBuilder.getPapers());
    }
}
