package Task1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {

	public final static String NAME_PATTERN = "[A-Z]{1}[a-z]+";
	public final static String LOGIN_PATTERN = "[A-Za-z0-9]+";
	
	public static boolean rightInput (String input, String patternString) {
		Pattern pt = Pattern.compile(patternString);
		Matcher matcher = pt.matcher(input);
		if (matcher.matches()) {
			return true;
		} else {
			return false;
		}
	}
	
}
