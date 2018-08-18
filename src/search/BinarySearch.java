package search;


/*
 * Binary Search: This only works if array is sorted but is better than Linear Search.
 * 					Has O(logN) time complexity.
 * 
 * The binary search begins by comparing the target value to the value of the middle element
 * of the sorted array:
 * 
 * - If this element is greater than the target value, we continue search on left sub-array
 * 
 * - If element is less, we continue search on right sub-array
 * 
 * Why is it good? Because we can discard half the items on every iteration so logarithmic time
 * complexity.
 */

public class BinarySearch {
	
	private int[] array;
	
	BinarySearch(int[] array){
		this.array = array;
	}
	
	public int binarySearch(int item) {
		return binarySearch(0, array.length-1, item); // Remember the -1
	}
	
	public int binarySearch(int startIndex, int endIndex, int item) {
		
		if(endIndex < startIndex) {
			System.out.println("The item is not present in the array...");
		}
		
		int middleIndex = (startIndex + endIndex) / 2;
		
		if(item == array[middleIndex]) {
			return middleIndex; 									// item is in middle
		} else if(item < array[middleIndex]) {
			return binarySearch(startIndex, middleIndex - 1, item); // search left sub-array
		} else {
			return binarySearch(middleIndex + 1, endIndex, item); // search right sub-array
		}
	}

}
