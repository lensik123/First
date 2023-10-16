package moduleFive;

public class Motorbike {

	private int year;
	private String model;
	private String colour;


	public Motorbike(int year, String model, String colour) {
		this.year = year;
		this.model = model;
		this.colour = colour;
	}

	public String getModel() {
		return model;
	}

	public int getYear() {
		return year;
	}

	public String getColour() {
		return colour;
	}
}
