package recursion;

// A look at the difference between 'head' and 'tail' recursion

public class HeadTailRecursion {
	
	// head recursion
	public void headRecursion(int n) {
		
		if(n == 0) // need base case
			return;
		
		headRecursion(n - 1);
		
		System.out.println(n); // 1 2 3 4
	}
	
	// tail recursion
	public void tailRecursion(int n) {
		
		if(n == 0)
			return;
		
		System.out.println(n); // 4 3 2 1
		
		tailRecursion(n - 1);
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
