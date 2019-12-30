package carFactory.parts.key.api;

import java.util.Random;

public abstract class AKey {
	private int id;
	
	public AKey() {
		Random rand = new Random();
		this.id = rand.nextInt();
	}
	
	public int getId() {
		return this.id;
	}
}
