package by.guzypaul.compositechain.comparator;

import java.util.Comparator;
import by.guzypaul.compositechain.entity.TextComponent;

public class WordByLengthComparator implements Comparator<TextComponent> {
	@Override
	public int compare(TextComponent component1, TextComponent component2) {
		int lengthComponent1 = component1.countSymbols();
		int lengthComponent2 = component2.countSymbols();
		return lengthComponent1 - lengthComponent2;
	}
}
