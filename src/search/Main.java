package search;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int[] array = {1,5,3,8,9,10,-3};
		int[] sortedArray = {1,3,4,8,9,10};
		
		int searchItem = 3;
		
		linearSearchMethod(array, searchItem);
		binarySearchMethod(sortedArray, searchItem);
	}
	
	public static void linearSearchMethod(int[] array, int item) {
		LinearSearch ls = new LinearSearch(array);
		String str = Arrays.toString(array); // turn array to string
		printTitle("Linear Search");
		System.out.println("Searching array " + str + " for item " + item);
		System.out.println("Item is at index: " + ls.linearSearch(item) + "\n");
	}
	
	public static void binarySearchMethod(int[] sortedArray, int item) {
		BinarySearch bs = new BinarySearch(sortedArray);
		String str = Arrays.toString(sortedArray);
		printTitle("Binary Search");
		System.out.println("Searching array " + str + " for item " + item);
		System.out.println("Item is at index: " + bs.binarySearch(item) + "\n");
	}

	public static void printTitle(String method) {
		System.out.println("---" + method + "---");
	}
}
