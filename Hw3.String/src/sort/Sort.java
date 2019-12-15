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
	
	public static void mergeSort(int[] array) {
	    if (array.length < 2) {
	        return;
	    }
	    int mid = array.length / 2;
	    int[] leftArr = new int[mid];
	    int[] rightArr = new int[array.length - mid];
	 
	    for (int i = 0; i < mid; i++) {
	    	leftArr[i] = array[i];
	    }
	    for (int i = mid; i < array.length; i++) {
	    	rightArr[i - mid] = array[i];
	    }
	    
	    mergeSort(leftArr);
	    mergeSort(rightArr);
	 
	    merge(array, leftArr, rightArr);
	}
	
	public static void merge(int[] wholeArray, int[] leftArr, int[] rightArr) {	  
	    int i = 0, j = 0, k = 0;
	    while (i < leftArr.length && j < rightArr.length) {
	        if (leftArr[i] <= rightArr[j]) {
	        	wholeArray[k++] = leftArr[i++];
	        }
	        else {
	        	wholeArray[k++] = rightArr[j++];
	        }
	    }
	    while (i < leftArr.length) {
	    	wholeArray[k++] = leftArr[i++];
	    }
	    while (j < rightArr.length) {
	    	wholeArray[k++] = rightArr[j++];
	    }
	}

	
	public static int[] quickSort(int[] array) {
		return array;
	}
}
