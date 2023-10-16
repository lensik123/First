package ModulesFour;

import java.util.Scanner;
import java.util.Random;

public class guessNumber {

	public static void main (String[]args){
		//Создаем экземпляр класса Random()
		Random rand = new Random();
		Scanner scanner = new Scanner (System.in);
		//Создаем переменную типа int
		int randInt;
		int playerGuess = -1;

		int i = 0;

		System.out.print("Введите нижний диапазон: ");
		int min = scanner.nextInt();
		System.out.print("Введите верхний диапазон: ");
		int max = scanner.nextInt();

		int randomNum = rand.nextInt((max - min) + 1) + min;

		System.out.print("Введите число допустимых попыток: ");
		int countTries = scanner.nextInt();

		while (i < countTries){
			System.out.print("Введите число: ");
			playerGuess = scanner.nextInt();

			if (playerGuess > randomNum){
				System.out.println("Загаданное мною число меньше");
			}
			else if (playerGuess < randomNum){
				System.out.println("Загаданное мною число больше");
			}
			else {
				System.out.println("Вы угадали. Поздравляю!");
				break;
			}
			i++;
			if (i >= countTries){
				System.out.println("Вы исчерпали лимит попыток. Загаданное число было:" + randomNum);
			}
		}

	}
}
