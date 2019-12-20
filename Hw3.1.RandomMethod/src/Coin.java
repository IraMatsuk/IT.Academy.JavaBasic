import java.util.Random;

public class Coin {
	public static void main (String[] args) {
		Coin coin = new Coin();
		int numberOfThrows = 1000;
		coin.toss(numberOfThrows);
		System.out.print("Heads fell " + coin.getHead() + " times out of " + numberOfThrows + " and tails fell " + coin.getTail() + " times");
	}
	
	public void toss(int numberOfThrows) {
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
