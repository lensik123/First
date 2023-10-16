package moduleFive;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Text{
	public static void main(String[] args) {
//		String text = "<strike>Это удалить!</strike>А это хороший текст, его трогать не надо.<strike> и это не нужно!</strike>";
//		Pattern pattern = Pattern.compile("<strike>.*?</strike>");
//
//		Matcher matcher = pattern.matcher(text);
//
//
//		System.out.println("Clean the text");
//		System.out.println(matcher.replaceAll(""));

		StringBuilder strBuilder = new StringBuilder();
		Pattern pattern = Pattern.compile("^(\\d{3})(\\d{4})$");

		for (int aCount = 1000000; aCount <= 9999999; aCount++) {
			Matcher matcher = pattern.matcher(Integer.toString(aCount));
			if (matcher.find()) {
				strBuilder.append("+7 (926) ").append(matcher.group(1)).append("-").append(matcher.group(2)).append("; ");
			}
		}

		pattern = Pattern.compile("(\\d[0]{2})-([0]{4})");
		Matcher matcher2 = pattern.matcher(strBuilder);
		while (matcher2.find()) {
			System.out.println("+7 (926) " + matcher2.group(1) + "-" + matcher2.group(2) + "; ");
		}

	}
}