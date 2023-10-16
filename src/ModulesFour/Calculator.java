package ModulesFour;

public class Calculator {
	public static void main(String[] args) {
		Time time = new Time ();




/*		Scanner scanner = new Scanner(System.in);
		boolean clearValues = true;
		double operand1 = 0;
		double operand2 = 0;
		char operation;
		char continueExitOrClear;
		while (true) {
			if (clearValues){
				System.out.print("Введите первый операнд: ");
				operand1 = scanner.nextDouble();
				clearValues = false;
			}

			System.out.print("Введите оператор(+,-,*,/) ");
			operation = scanner.next().charAt(0);

			System.out.print("Введите второй операнд: ");
			operand2 = scanner.nextDouble();

			//вычисление результата
			operand1 = operationResult (operation, operand1, operand2);
			System.out.println("Результат= " + operand1);
			System.out.println("'S' для выхода из калькулятора. 'C' для очищения значений + начать с нуля. Любой другой символ, чтобы продолжить вычисления");
			continueExitOrClear = Character.toUpperCase(scanner.next().charAt(0));

			//выход из калькулятора
			if (Character.toUpperCase(continueExitOrClear) == 'S') {
				System.out.println("Выход из калькулятора.");
				break;
			}

			//очищение предыдущих значений и запуск с нуля.
			if (Character.toUpperCase(continueExitOrClear) == 'C') {
				operand1 = 0;
				clearValues = true;
				System.out.println("Значение = " + operand1);
			}
		}
		scanner.close();


 */
	}

	//метод для выполнения операции и возвращения результата
	public static double operationResult(char a, double b, double c){        //метод для выполнения операции и возвращения
																			 // результата
		double result = 0;
		switch (a) {
			case '+':
				result = b + c;
				break;
			case '*':
				result = b * c;
				break;
			case '-':
				result = b - c;
				break;
			case '/':
				if (c != 0) {
					result = b / c;
				} else {
					System.out.println("Делить на ноль нельзя");
				}
				break;
			default:
				System.out.println("Некорректное выражение операции");
			}
		return result;
		}

	}


