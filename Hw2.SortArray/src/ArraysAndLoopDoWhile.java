import java.util.Scanner;

public class ArraysAndLoopDoWhile {
	public static void main (String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter numbers:");
		String[] stringOfNumbers = scan.nextLine().split(" ");
		
		int[] arr = new int[stringOfNumbers.length];
		int i = 0;
		do {			
			arr[i] = Integer.parseInt(stringOfNumbers[i]);
			System.out.print(arr[i] + " ");	
			i++;	
		}
		
		while ( i < stringOfNumbers.length);
		scan.close();
	}
}
