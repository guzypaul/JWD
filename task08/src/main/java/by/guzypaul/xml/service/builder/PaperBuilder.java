package by.guzypaul.xml.service.builder;

import by.guzypaul.xml.entity.Paper;
import by.guzypaul.xml.service.ServiceException;

import java.util.HashSet;
import java.util.Set;

public abstract class PaperBuilder {
    private Set<Paper> papers;

    public PaperBuilder() {
        papers = new HashSet<>();
    }

    public Set<Paper> getPapers() {
        return papers;
    }

    public void setPapers(Set<Paper> papers) {
        this.papers = papers;
    }

    public abstract void buildSetPapers(String filePath) throws ServiceException;
}
