package ModulesFour;

public class Year {
	public static void main (String[]args){

		years(16);


	}



	public static void years(int a){

		if ( a % 400 == 0 && a % 100 == 0 && a % 4 == 0){
			System.out.println("This year is a leap year");
		}
		else{
			System.out.println("This year is not a leap year");
		}

	}
}
