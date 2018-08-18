package search;


/*
 * Linear Search: In an unsorted array we have to iterate through the whole array
 * 					sequentially... Checking every item with O(N) time complexity
 */

public class LinearSearch {
	
	private int[] array;
	
	public LinearSearch(int[] array) {
		this.array = array;
	}

	public int linearSearch(int item) {
		for(int i = 0; i < array.length; i++)
			if(array[i] == item)
				return i; // returns index of item
		
		return -1; // if item does not exist in array
	}
}
