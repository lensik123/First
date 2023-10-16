package ModulesFour;

public class Cubes {

	public static void main (String[]args){

		cubes1(6);
	}


	public static void cubes1(int a){
		for ( int i = 0; i < a; i++){

			System.out.println("The cube of " + i + " такого-то " + Math.round(Math.pow(i,3)) + " тому-то");
		}

	}
}
