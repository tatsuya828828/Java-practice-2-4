package job;

public class Hero {
	private String name;
	private int hp, mp;

	public Hero(String name) {
		this.name = name;
	}

	public Hero() {
		this("たかし");
	}

	public String toString() {
		return "勇者(名前=" + this.name + "/HP=" + this.hp + "/MP=" + this.mp +")";
	}
}
