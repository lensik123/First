package moduleFive;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Da {
	public static void main(String[] args) {
		String input = "WrongMsisdnError SuccessfulTransaction TimeOutError InternalError SuccessfulTransaction ExternalIDError SuccessfulTransaction WrongIDError InvalidArgumentError SuccessfulTransaction SuccessfulTransaction SuccessfulTransaction WrongMsisdnError";

		// Создаем регулярное выражение для поиска слова "Error" в любом контексте
		String regex = "\\S*Error\\S*";
		Pattern pattern = Pattern.compile(regex);

		// Создаем Matcher и находим все вхождения
		Matcher matcher = pattern.matcher(input);

		// Печатаем все найденные вхождения
		while (matcher.find()) {
			System.out.println("Found: " + matcher.group());
		}
	}
}