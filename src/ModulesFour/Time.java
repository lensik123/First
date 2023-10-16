package ModulesFour;

import java.time.LocalDateTime;
public class Time {

	public void signal() {

		LocalDateTime currentDateTime = LocalDateTime.now();

		double minutes = currentDateTime.getMinute();

		if ( minutes % 5 == 0){
			System.out.println("Red");
		} else if (minutes % 5 == 4) {
			System.out.println("Yellow");
		} else{
			System.out.println("Green");
		}


	}

	public String numberToWOrld(int a){
		String text = "";
		int numberLength = String.valueOf(a).length();

		if (a > 999){
			return text = "Невозможно";
		} else if ( a % 2 == 0) {
			text += "even";
		} else {
			text += "odd";
		}

		text += " ";

		if (numberLength == 1){
			text += "digit number";
		} else if (numberLength == 2) {
			text += "two-digit number";
		} else {
			text += "three-digit number";
		}

		return text;
	}

	public void syracuseSequence(int a ){

		int count = 0;
		String countOperations = "";
		countOperations += a;

		while (a != 1){
			count ++;
			countOperations += "->";

			if (a % 2 == 0) a /= 2;
			else a = a * 3 + 1;
			countOperations += a;
		}
		System.out.println(count);
		System.out.println(countOperations);
	}

}
