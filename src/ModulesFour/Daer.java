package ModulesFour;

public class Daer {

	public static String capitalizeEveryWord(String input) {
		if (input == null && input.isEmpty()) {
			return input;
		}

		String[] words = input.toLowerCase().split(" ");
		StringBuilder result = new StringBuilder();

		for (String word : words) {
			if (!word.isEmpty()) {
				result.append(Character.toUpperCase(word.charAt(0)));
				if (word.length() > 1) {
					result.append(word.substring(1));
				}
				result.append(" ");
			}
		}

		return result.toString().trim();
	}

	public static void main(String[] args) {
		String input = "hello wORLD tHIS iS a tEST";
		String result = capitalizeEveryWord(input);
		System.out.println("Original: " + input);
		System.out.println("Capitalized: " + result);
	}
}
