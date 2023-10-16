package moduleFive;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyMatcher {

	public static void main(String[] args) {
		String text = "У Сени и Сани в сенях сом с усами";

		String text1 = "1It is 2interesting2 TO 4study VERY, Делайте обучение интересней";

		Pattern pattern = Pattern.compile("\\b[сС]\\S*?[х]\\b");

		Pattern pattern1 = Pattern.compile("[a-zA-Z]+\\b");

		Matcher matcher = pattern1.matcher(text1);

		while (matcher.find()) {
			System.out.println(text1.substring(matcher.start(), matcher.end()));
		}
	}

}