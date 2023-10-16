package moduleFive;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Strings {


	public static void main(String[] args) {

		String derke = "WrongMsisdnError SuccessfulTransaction TimeOutError InternalError SuccessfulTransaction ExternalIDError SuccessfulTransaction WrongIDError InvalidArgumentError SuccessfulTransaction SuccessfulTransaction SuccessfulTransaction WrongMsisdnError";

		// Создаем регулярное выражение для поиска слова "Error"
		String regex = "\\bError\\b";
		Pattern pattern = Pattern.compile(regex);

		// Создаем Matcher и находим все вхождения
		Matcher matcher = pattern.matcher(derke);

		// Печатаем все найденные вхождения
		while (matcher.find()) {
			System.out.println("Found: " + matcher.group());
		}

	}
}