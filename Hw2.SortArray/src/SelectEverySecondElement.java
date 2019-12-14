import java.util.Scanner;

public class SelectEverySecondElement {
	public static void main (String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter numbers:");
		String[] stringOfNumbers = scan.nextLine().split(" ");
		
		int[] arr = new int[stringOfNumbers.length];
		for (int i = 0; i < stringOfNumbers.length; i++) {
			arr[i] = Integer.parseInt(stringOfNumbers[i]);
			if (i % 2 != 0) {
				System.out.print(arr[i] + " ");	
			}			
		}
		scan.close();
	}	
}
