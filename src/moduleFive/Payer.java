package moduleFive;

public class Payer {
	private String surname;
	private String name;
	private String address;
	private String cardNumber;

	public Payer (String surname, String name, String address, String cardNumber){
		this.surname = surname;
		this.name = name;
		this.address = address;
		this.cardNumber = cardNumber;
	}

	public String toString(){
		String da = String.format ("Payer: %s %s, address: %s, card: %s.", surname, name, address, cardNumber);
		return da;
	}

}

