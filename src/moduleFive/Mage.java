package moduleFive;

public class Mage {
	 String name, type;
	 int level, damage;

	public Mage(String name, int level, int damage, String type) {
		this.name = name;
		this.type = type;
		this.level = level;
		this.damage = damage;
	}


	public String getInfo(){

		return name + ", " + level + ", " + damage + ", " + type;
	}

	public String fight (Mage mage){

		String resultOfBatlle = "draw";

		if(type == "fire" && mage.type == "ice")resultOfBatlle = name;
		else if (type == "ice" && mage.type == "earth")resultOfBatlle = name;
		else if (type == "earth" && mage.type == "fire")resultOfBatlle = name;
		else if (!type.equals(mage.type))resultOfBatlle = mage.name;
		else{
			if(level > mage.level) resultOfBatlle = name;
			else if(damage > mage.damage) resultOfBatlle = name;
			else if (level == mage.level && damage == mage.damage) return resultOfBatlle;
			else resultOfBatlle = mage.name;
		}

		return resultOfBatlle;

	}
}

