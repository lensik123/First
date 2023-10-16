package ModulesFour;

public class Rectangle {
	public static void main (String[]args){


		String name1 = "Вован Иванов";
		String name2 = "иван иваноe";
		System.out.println(name1.equals(name2));


//		if((name1.toLowerCase().equals(name2.toLowerCase())) == true) System.out.println("Выберите другое имя пользователя");
//		else System.out.println("Отличное имя!");
		checkUserName(name1, name2);

//		drawRectangle(5,6,'s');

	}

	public static void checkUserName(String a, String b){
		int name1Length = a.length();
		if((a.equalsIgnoreCase(b)) == true) System.out.println("Выберите другое имя пользователя");
		else System.out.println("Отличное имя!");

		a = a.replace(" ", "");


		System.out.println("Ваше имя имеет " + name1Length + " символов");
		System.out.println("А без пробелов ваше имя занимает " + a.length() + " символов");
	}
	public static void drawRectangle (int n, int m, char c){

		String rectangle = "";

		for (int i = 0; i < n; i++){

			if (i == 0 && i + 1 == n) {
				for (int j = 0; j < m; j++) {
					rectangle += c;
				}
			} else {
				rectangle +=c;
				for (int j = 1; j < m-1; j++){
					rectangle += " ";
				}
				if (m != 1) rectangle +=c;
			}
			System.out.println(rectangle);
			rectangle = "";

		}


	}
}
