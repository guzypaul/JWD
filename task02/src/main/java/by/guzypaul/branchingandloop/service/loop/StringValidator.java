package by.guzypaul.branchingandloop.service.loop;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Guzy Paul
 * Task32 (loop):check the string entered by the user for invalid characters.
 * First charachter can be only: letters and underscore.
 * Other characters can be: leters, digitals and underscore.
 */

public class StringValidator {

    static void stringToCharArray(String inputString) {
        char[] charArray = inputString.toCharArray();

        char firstCharacther = inputString.charAt(0);
        if (!Character.isLetter(firstCharacther) ) {
            // do something
        }

        Pattern pattern = Pattern.compile("\\w");
        Matcher matcher = pattern.matcher(inputString);

        while (matcher.find()) {
            System.out.println(inputString.substring(matcher.start(), matcher.end()));
        }
//TODO: method
    }
}
