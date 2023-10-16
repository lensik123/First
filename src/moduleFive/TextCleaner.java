package moduleFive;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class TextCleaner {
	public static void main(String[] args) {
//		String text = "<strike>Это удалить!</strike>А это хороший текст, его трогать не надо.<strike> и это не нужно!</strike>";
//		Pattern pattern = Pattern.compile("<strike>.*?</strike>");
//
//		Matcher matcher = pattern.matcher(text);
//		while (matcher.find()) {
//			int start = matcher.start();
//			int end = matcher.end();
//			System.out.println("Found match\n" + text.substring(start, end) + "\nfrom " + start + " to " + (end - 1));
//		}
//
//		System.out.println("Clean the text");
//		System.out.println(matcher.replaceAll(""));

/*		String text = "Иван Петров";
		Pattern pattern = Pattern.compile("(.*) (.*)");
		Matcher matcher = pattern.matcher(text);
//меняем первую группу со второй
		System.out.println(matcher.replaceFirst("$2 $1"));*/

//		StringBuilder sb = new StringBuilder("java");
//		long startTime = System.currentTimeMillis();
//
//		for (int i = 0; i < 50000; i++) {
//			sb.reverse();
//		}
//		System.out.println((System.currentTimeMillis() - startTime));
//
//		for (int i = 0; i < 200000; i++) {
//			sb.reverse();
//		}
//		System.out.println((System.currentTimeMillis() - startTime));
//
//		for (int i = 0; i < 1000000; i++) {
//			sb.reverse();
//		}
//		System.out.println((System.currentTimeMillis() - startTime));

		String text = "Regular Expressions or Regex is an API for defining String patterns that can be used for searching, manipulating and editing a text. It is widely used to define a constraint on strings such as a password. Regular Expressions are provided under java.util.regex package.";

		String regex = "\\bs\\S*?\\b";




		}
	}
