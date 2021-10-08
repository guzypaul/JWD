package by.guzypaul.xml.controller;

import by.guzypaul.xml.service.PaperDomBuilder;

public class Runner {
    public static void main(String[] args) {
        PaperDomBuilder domBuilder = new PaperDomBuilder();
        domBuilder.buildSetPapers("src/main/resources/data/papers.xml"); //todo get resource src/main/resources
        System.out.println(domBuilder.getPapers());
    }
}
