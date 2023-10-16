package ModulesFour;

public class Factorial {

	public static void main(String[] args) {

		findFactorial(50);
	}
	public static void findFactorial(int a) {
		long factorial = 1;

		for (int i = 1; i <= a; i++){

			factorial *= i;
		}
		System.out.println(factorial);
	}

}