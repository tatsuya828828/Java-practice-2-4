import java.util.ArrayList;
import java.util.List;

import job.Hero;


public class Main {
	public static void main(String[] args) {
		var hero = new Hero();
		System.out.println(hero);

		List<Hero> list = new ArrayList<Hero>();

		var h1 = new Hero("ミナト");
		list.add(h1);
		System.out.println("要素数=" + list.size());
		h1 = new Hero("ミナト");
		list.remove(h1);
		System.out.println("要素数=" + list.size());
	}
}
