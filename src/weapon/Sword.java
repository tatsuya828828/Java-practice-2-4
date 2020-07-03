package weapon;

public class Sword implements Cloneable {
	int attack;
	String name;

	public Sword clone() {
		Sword result = new Sword();
		result.attack = this.attack;
		result.name = this.name;
		return result;
	}
}
