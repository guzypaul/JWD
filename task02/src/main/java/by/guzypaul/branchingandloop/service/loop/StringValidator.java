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


        Pattern pattern = Pattern.compile("\\w");
        Matcher matcher = pattern.matcher(inputString);
        /*private static final String DATE_REGEX = "\\d\\d-\\d\\d\\d\\d";
        22-1234
*/

//TODO: method
    }
}
