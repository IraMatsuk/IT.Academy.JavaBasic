import java.util.Random;

public class RandomMethod {
	public static void main (String[] args) {
		RandomMethod randomMethod = new RandomMethod();
		int numberOfThrows = 2000;
		randomMethod.tossCoin(numberOfThrows);
		System.out.print("Heads fell " + randomMethod.getHead() + " times out of " + numberOfThrows + " and tails fell " + randomMethod.getTail() + " times");
	}
	
	public void tossCoin(int numberOfThrows) {
		Random rand = new Random();
		for (int i = 0; i < numberOfThrows; i++) {			
			int randNum = rand.nextInt(2);
			if (randNum == 0 ) {
				this.head++;
			} else {
				this.tail++;
			}
		}
	}
	
	public int getHead() {
		return this.head;
	}
	
	public int getTail() {
		return this.tail;
	}
	
	private int head = 0;
	private int tail = 0;
}
