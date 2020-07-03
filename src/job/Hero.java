package job;

import weapon.Sword;

public class Hero implements Cloneable {
	private String name;
	private int hp, mp;
	Sword sword;

	public Hero(String name) {
		this.name = name;
	}

	public Hero() {
		this("たかし");
	}

	public String toString() {
		return "勇者(名前=" + this.name + "/HP=" + this.hp + "/MP=" + this.mp +")";
	}

	public Hero clone() {
		Hero result = new Hero();
		result.name = this.name;
		result.hp = this.hp;
		result.sword = this.sword;
		return result;
	}
}
