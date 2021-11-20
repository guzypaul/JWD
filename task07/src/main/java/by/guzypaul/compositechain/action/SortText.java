package by.guzypaul.compositechain.action;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import by.guzypaul.compositechain.comparator.ParagraphBySentencesNumberComparator;
import by.guzypaul.compositechain.entity.TextComponent;
import by.guzypaul.compositechain.entity.TextComposite;

public class SortText {
	private static final Logger logger = LogManager.getLogger();

	public void sortBySentencesNumber(TextComposite text) {
		List<TextComponent> components = text.getComponents();
		List<TextComponent> copyOfComponents = new ArrayList<>(components);
		Collections.sort(copyOfComponents, new ParagraphBySentencesNumberComparator());
		text.setComponents(copyOfComponents);
		logger.log(Level.INFO, "composite sorted by sentence number: " + text);
	}
}
