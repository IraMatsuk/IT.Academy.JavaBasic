import java.util.Scanner;

public class ArrayAndLoopForeach {
	public static void main (String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter numbers:");
		String[] stringOfNumbers = scan.nextLine().split(" ");
		
		int[] arr = new int[stringOfNumbers.length];
		int i = 0;
		for (String item: stringOfNumbers) {
			arr[i] = Integer.parseInt(item);		
			System.out.print(arr[i] + " ");
			i++;
		}
		scan.close();
	}	

}
