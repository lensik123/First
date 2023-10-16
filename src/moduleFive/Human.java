package moduleFive;

public class Human {


	private String name;
	private int age;
	private int weight;
	private String address;
	private String work;

	public Human(String name, int age){this(name,age,50,"Artsueva148","X5");}

	public Human (String name, String address){this(name,25,63,address,"X5");}

	public Human (String name, int age, int weight){this(name, age, weight, "Artsueva148", "X5");}

	public Human (String name, int age, String work){this(name, age, 63, "Artsueva", work);}

	public Human (int age, int weight, String address, String work){this("Turpal",age, weight, address, work);}

	public Human(String name, int age, int weight, String address, String work) {
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.address = address;
		this.work = work;
	}


}
