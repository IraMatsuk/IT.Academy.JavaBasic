import java.util.Scanner;
import java.util.Arrays;

public class BubbleSort {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter numbers:");
		String[] stringOfNumbers = scan.nextLine().split(" ");
		
		int[] arr = new int[stringOfNumbers.length];
		for (int i = 0; i < stringOfNumbers.length; i++) {
			try {
				arr[i] = Integer.parseInt(stringOfNumbers[i]);
			} catch (NumberFormatException e) {
				System.out.println("Invalid data");
				break;
			}	
		}
		int[] sortedArray = bubbleSort(arr);
		for (int i = 0; i < sortedArray.length; i++) {
			System.out.print(" " + sortedArray[i]);
		}
		
		scan.close();		
	}
	
	public static int[] bubbleSort(int[] array) {
		for (int i = 1; i < array.length; i++) {
			if (array[i - 1] > array[i]) {
				int tmp = array[i];
				array[i] = array[i - 1];
				array[i - 1] = tmp;
				i = 0;
			}
		}
		return array;	
	}
}
