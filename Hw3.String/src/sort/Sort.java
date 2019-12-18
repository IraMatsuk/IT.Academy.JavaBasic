package sort;

public class Sort {
	// Bubble Sort
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
	
	public static void selectionSort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			int min = array[i];
			int indexMin = i;
			
			// find minimum element
			for (int j = i; j < array.length; j++) {
				if (array[j] < min) {
					min = array[j];
					indexMin = j;
				}
			}
		
			//insert minimum element to the begin array
				int tmp = array[i];
				array[i] = min;
				array[indexMin] = tmp;		
		}
	}
	
	public static int[] shakeSort(int[] array) {
		return array;
	}
	
	// Insert Sort	
	public static void insertSort(int[] array) {		
		for (int i = 1; i < array.length; i++) {
			int currValue = array[i];
			int suitablePlace = -1; 
			
			//find suitable place for current element
			for (int j = 0; j < i; j++) {
				if (currValue < array[j]) {
					suitablePlace = j;
					break;
				}
			}
			
			// current position is suitable to the element
			if(suitablePlace < 0) {
				continue;
			}
			
			//move sorted elements
			for (int k = i; k > suitablePlace; k--) {
				array[k] = array[k - 1];
			}
			
			//move current element to suitable place
			array[suitablePlace] = currValue;
		} 
	}

	// Merge Sort
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
