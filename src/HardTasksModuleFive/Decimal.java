package HardTasksModuleFive;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Decimal {

	public static void main (String[]args){

		Scanner scanner = new Scanner(System.in);

		String numbers = scanner.next().toString();

		char separator = ',';

		System.out.println(DecimalFormat(numbers, separator));


	}



	static String DecimalFormat(String strNumbers, char separator){

		System.out.println("");

		String str = "12345678";
		int[] arrayNumbers = new int[str.length()];

		String [] strArray = new String [str.length() + str.length()/3];

		Pattern pattern = Pattern.compile("(\\d)(?=(\\d{3})+(?![0-9]))");
		Matcher matcher = pattern.matcher(str);
		StringBuffer formattedNumber = new StringBuffer();

		while (matcher.find()) {
			matcher.appendReplacement(formattedNumber, matcher.group(1) + separator);
		}


		matcher.appendTail(formattedNumber);
		return formattedNumber.toString();



	}
}


