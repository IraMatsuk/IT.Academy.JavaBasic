
public class MultiplicationTable {
	public static void main (String[] args) {
		printMultiplicationTable();
	}
	
	public static void printMultiplicationTable() {
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				if ((i * j) < 10 ) {
					System.out.print(i * j + "  ");
				} else {
					System.out.print(i * j + " ");
				}	
			}
			System.out.println();	
		}
	}
}
