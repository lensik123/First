package ModulesFour;

public class da {

	public static void main (String []args){
		isPow(16384);
	}


	public static void isPow(int a){
		int degree = 1;
		int staticNumber = 2;
		while (true){
			degree++;
			staticNumber = staticNumber * 2;
			if(staticNumber == a){
				System.out.println("Степень: " + degree);
				break;
			}
			else if (staticNumber > a){
				System.out.println("No");
				break;
			}
		}
	}
}
