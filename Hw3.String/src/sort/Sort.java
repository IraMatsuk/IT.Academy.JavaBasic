package sort;

public class Sort {
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
	
	public static int[] selectionSort(int[] array) {
		return array;
	}
	
	public static int[] shakeSort(int[] array) {
		return array;
	}
	
	public static int[] insertSort(int[] array) {
		return array;
	}
	
	public static int[]mergeSort(int[] array) {
		return array;
	}
	
	public static int[] quickSort(int[] array) {
		return array;
	}
}
