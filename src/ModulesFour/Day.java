package ModulesFour;

public class Day {

	public static void main (String[] args){
		int a = 30;
		int b = 150;
		int c = 15;
		System.out.println(medianNumber(a,b,c));
	}

	public static int medianNumber(int a,int b, int c){

		int maxNumber = Math.max(Math.max(a,b),c);
		int minNumber = Math.min(Math.min(a,b),c);
		int median = a + b + c - maxNumber - minNumber;
		return median;
	}

}
