package recursion;

public class HouseBuildingProblem {
	
	// head recursion
	public void buildLayerHead(int height) {
		
		if(height == 0) // need base case
			return;
		
		buildLayerHead(height - 1);
		
		System.out.println(height); // 1 2 3 4
	}
	
	// tail recursion
	public void buildLayerTail(int height) {
		
		if(height == 0)
			return;
		
		System.out.println(height); // 4 3 2 1
		
		buildLayerTail(height - 1);
	}

	/* For 'head' case the numbers are ascending.
	 * 
	 * For 'tail' they are descending.
	 * 
	 * Tail is similar to a normal 'for' loop or 'while' loop. It is like
	 * a iterative approach as far as performance is concerned.
	 * 
	 * Head has to use the OS stack memory. It has to wait till base case is reached before its
	 * functions pop off stack.
	 */
}
