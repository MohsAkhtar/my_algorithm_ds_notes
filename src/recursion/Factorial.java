package recursion;

public class Factorial {
	
	// n! = (n-1)*(n-2)*..*1
	// 5! = 5*4*3*2*1 etc.
	
	public int factorial(int n) { // we are returning 'int'
		if(n == 1)
			return 1;
		
		return n * factorial(n-1);	
	}

}

/*|BASE CASE	 |
 *|2*factorial(1)|
 *|3*factorial(2)|
 *|4*factorial(3)| Push onto stack
 *
 *
 *|1			 | Base case is 1, factorial(1) = 1
 *|2*factorial(1)|
 *|3*factorial(2)|
 *|4*factorial(3)|
 *
 *
 *|				 |
 *|2*1			 | Pop factorial(1) off stack 
 *|3*factorial(2)|
 *|4*factorial(3)|
 *
 *
 *|				 |
 *|				 |
 *|3*2*1		 | Pop factorial(2) off stack
 *|4*factorial(3)|
 *
 *
 *|				 |
 *|				 |
 *|				 |
 *|4*3*2*1		 | Pop factorial(3) off stack, return result
 */
