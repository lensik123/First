package ModulesFour;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean isCorrectName = false;
		while (!isCorrectName) {
			String name = scanner.nextLine(); //Считывает строку из System.in
			isCorrectName = checkName(name);
			if (!isCorrectName) {
				System.out.println("Введите корректное имя!");
			} else {
				System.out.println(formatName(name));
			}
//
			String [] names = formatName(name).split(" ");
			sortByLength(names);
		}


	}
		private static boolean checkName (String name){
			String name1 = name.trim();
			String[] nameArray = name1.split(" ");
			if (nameArray.length != 3) {
				System.out.println("Введите имя ещё раз");
				return false;
			}
			boolean da = true;
			return da;
		}

		private static String formatName (String name){

			String[] names = name.trim().toLowerCase().split(" ");
			StringBuilder result = new StringBuilder();

			for (String eachName : names) {
				if (!eachName.isEmpty()) {
					result.append(Character.toUpperCase(eachName.charAt(0)));
					if (eachName.length() > 1) result.append(eachName.substring(1));
					result.append(" ");
				}
			}

			String resultString = result.toString();
			return resultString;

		}

		private static void sortByLength (String[]words){

			if (words.length != 3) System.out.println("Некорректное имя пользователя");
			else {
				Arrays.sort(words, Comparator.comparingInt(String::length));
				for (String word : words){
					System.out.print(word + " ");
				}
			}

		}
}