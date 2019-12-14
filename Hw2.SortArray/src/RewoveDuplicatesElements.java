import java.util.Scanner;

public class RewoveDuplicatesElements {
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
			System.out.print(sortedArray[i] + " ");
		}
		
		scan.close();		
	}
	
	public static int[] bubbleSort(int[] array) {
		int[] workArray = array.clone();
		int[] tmpArr = new int[workArray.length];
		int j = 0;
		
		for (int i = 1; i < workArray.length; i++) {
			if (workArray[i - 1] > workArray[i]) {
				int tmp = workArray[i];
				workArray[i] = workArray[i - 1];
				workArray[i - 1] = tmp;
				i = 0;
			}
		}
		
		for (int i = 0; i < workArray.length - 1; i++) {
			if(workArray[i] != workArray[i+1]) {
				tmpArr[j++] = workArray[i];
			}
		}
		tmpArr[j++] = workArray[workArray.length - 1]; 
		return tmpArr;	
	}
}
