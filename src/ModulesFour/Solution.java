package ModulesFour;

public class Solution {

	public static void main (String[]args){
		String name32 = "ModulesFour.da";
		StringBuilder result = new StringBuilder();
		char da = name32.toUpperCase().charAt(0);
		result.append(Character.toUpperCase(name32.charAt(0)));


//		drawRectangle(5,4,"+");
	}
	public static void drawRectangle(int n, int m, String s) {
		for (int i = 0; i < n; i++) {
			String string = "";
			if (i == 0 && i == n - 1) { // если первая или последняя строчки
				for (int j = 0; j < m; j++) {
					string += s; // строим строку из m символов
				}
			} else {
				// иначе строим строку вида {символ s + m - 2 пробела + символ s}
				string += s;
				for (int j = 1; j < m - 1; j++) {
					string += " ";
				}
				if (m != 1) string += s; // проверяем, что прямоугольник не 1 в ширину
			}
			System.out.println(string);
		}
	}
}