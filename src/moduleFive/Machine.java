package moduleFive;

public class Machine {

	private int oil;
	static final String model = "machine";
	int countMachine = 0;

	private String name;

	public Machine(){
		this(100);
	}


	public Machine(int oil) {
		this.oil = oil;
		countMachine++;
		name = model +  countMachine;
	}

	public void makeDetail(int a){
		int details = 0;
		for (int i = 0; i < a; i++){
			details++;
			oil--;
			if(oil == 0) {
				System.out.println("Закончилось масло. Необходимо заправить.");
				break;
			}
		}
		System.out.println("Изготовлено деталей " + details );
	}

	public void fillOil(){
		oil = 100;
		System.out.println("Станок заправлен маслом.");
	}




}

