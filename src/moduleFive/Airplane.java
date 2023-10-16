package moduleFive;

public class Airplane {

	private int x, y, z;
	private int fuel;
	private int countFlowers;
	private int dir;

	public Airplane() {
		this(100, 100, 100, 100, 5);
	}

	public Airplane(int x, int y) {
		this(x, y, 100, 100, 5);
	}

	public Airplane(int x, int y, int z, int fuel, int countFlowers) {
		this.x = x;
		this.y = y;
		this.z = z;
		this.fuel = fuel;
		this.countFlowers = countFlowers;
	}

	public void turnLeft() {
		dir--;
		if (dir == -1) dir = 3;
		System.out.println("Вы повернули налево");
	}

	public void turnRight() {
		dir++;
		if (dir == 4) dir = 0;
		System.out.println("Вы повернули направо");
	}

	public void flyStraight(int a) {
		if (dir == 0) x += a;
		else if (dir == 1) y -= a;
		else if (dir == 2) x -= a;
		else y += a;
		fuel -= 1;

		System.out.printf("Вы пролетели прямо и сейчас находитесь на координатах: x= %d, y= %d, z= %d.", x, y, z);
		remainingFuel();
	}

	public void flyStraightNonForPlayer(int a) {
		if (dir == 0) x += a;
		else if (dir == 1) y -= a;
		else if (dir == 2) x -= a;
		else y -= a;
		fuel -= 1;
	}

	public void flyUp(int up, int b) {
		z += up;
		flyStraightNonForPlayer(b);
		if(fuel < 0 && z >0) System.out.println("Топлива не осталось, вы разбились.");
		else {
			System.out.printf("Вы поднялись ввысь и сейчас находитесь на координатах: x= %d, y= %d, z= %d.", x, y, z);
			remainingFuel();
		}
	}

	public void flyDown(int down, int b) {
		z -= down;
		flyStraightNonForPlayer(b);
		if (z <= 0){
			z = 0;
			System.out.println("Самолет приземлился");
		}
		else {
			System.out.printf("Вы cпустились ниже и сейчас находитесь на координатах: x= %d, y= %d, z= %d.", x, y, z);
			remainingFuel();
		}
	}

	public void fillFuel() {
		if (z != 0) System.out.println("В воздухе нельзя заправляться");
		else {
			fuel = 100;
			System.out.println("Вы заправились.");
			remainingFuel();

		}
	}

	private void remainingFuel(){
		System.out.print("Топлива осталось= " + fuel );
		System.out.println();
	}

	public void dropFlowers() {
		countFlowers--;
		System.out.println("Самолет сбросил цвета по координатам x= " + x + ", y= " + y + ". Кол-во цветов осталось= " + countFlowers);
	}
}
