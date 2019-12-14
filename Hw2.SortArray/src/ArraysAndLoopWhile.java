import java.util.Scanner;

public class ArraysAndLoopWhile {
	public static void main (String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter numbers:");
		String[] stringOfNumbers = scan.nextLine().split(" ");
		
		int[] arr = new int[stringOfNumbers.length];
		int i = 0;
		while ( i < stringOfNumbers.length) {
			
			arr[i] = Integer.parseInt(stringOfNumbers[i]);
			System.out.print(arr[i] + " ");	
			i++;
		}
		scan.close();
	}
}	

