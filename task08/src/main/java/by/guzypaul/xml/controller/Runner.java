package by.guzypaul.xml.controller;

import by.guzypaul.xml.parser.PaperDomBuilder;

public class Runner {
    public static void main(String[] args) {
        PaperDomBuilder domBuilder = new PaperDomBuilder();
        domBuilder.buildSetPapers("src/main/resources/data/papers.xml");
        System.out.println(domBuilder.getPapers());
    }
}
