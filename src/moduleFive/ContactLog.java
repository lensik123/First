package moduleFive;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Random;


public class ContactLog {

	public static void main (String[]args) {

		StringBuilder strBuilder = new StringBuilder();

		for (int i = 0; i < 1999990; i++){
			strBuilder.append("+7 (926) ").append(generatePhoneNumber());
			strBuilder.append("; ");
		}

		Pattern pattern = Pattern.compile("(\\d[0]{2})-([0]{4})"); // что ищем
		Matcher matcher = pattern.matcher(strBuilder); // где ищем

		while (matcher.find()){
			System.out.println("Found: " + matcher.group());
		}

	}

	public static String generatePhoneNumber () {

		Random rand = new Random();

		int firstThreeNumber = rand.nextInt(999);
		int lastFourNumber = 10000 + rand.nextInt(99999);
		String numberString = Integer.toString(lastFourNumber);

		if (numberString.length() > 1) {
			numberString = numberString.substring(1); //обрезаем первую цифру. Чтобы можно было получить 0000 в конце
		}

		String number = Integer.toString(firstThreeNumber);
		number += "-" +numberString;

		return number;

	}


}