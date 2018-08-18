package recursion;

public class FactorialAccumulator {
	
	// optimisation for factorial class
	public int factorialAccumulator(int accumulator, int n) {
		if(n == 1)
			return accumulator;
		
		return factorialAccumulator(accumulator*n, n-1);
	}
	
	public int calculateFactorialWithAccumulator(int n) {
		return factorialAccumulator(1, n); // accumulator = 1
	}
}

/* 
 * we are storing reference for an accumulator so 
 * we don't have to store variables on the stack
 * 
 * The difference here is what happens when we bump into base case.
 * 
 * The previous method returns values and substitutes them
 * into the previous method calls.
 * 
 * This method just immediately returns the solution as values are
 * not stored on stack.
 * 
 * Therefore we are able to skip the substitution part of the last
 * algorithm.
 * 
 * So this algorithm is going to be faster.
 */
