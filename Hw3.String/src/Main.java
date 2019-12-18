import java.util.Scanner;

import sort.Sort;

public class Main {
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
		// Bubble Sort
		/*int[] sortedArray = Sort.bubbleSort(arr);
		for (int i = 0; i < sortedArray.length; i++) {
			System.out.print(sortedArray[i] + " ");
		} */
		
		// Selection Sort		
		/* Sort.selectionSort(arr);
		 for (int i = 0; i < arr.length; i++) {
		 	System.out.print(arr[i] + " ");
		 } */
		 
		// Insert Sort		
		 Sort.insertSort(arr);
		 for (int i = 0; i < arr.length; i++) {
		 	System.out.print(arr[i] + " ");
		 }
		 
		// Merge Sort
		/*Sort.mergeSort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		} */
		
		scan.close();		
	}
}
