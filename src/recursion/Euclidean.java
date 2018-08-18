package recursion;

/* A method for finding the greatest common divisor (gcd)
 * of two numbers, the largest number that divides both of them
 * without leaving a remainder 
 */

public class Euclidean {
	
	public int gcdIterative(int num1, int num2) {
		
		while(num2 != 0) {
			int temp = num2;
			num2 = num1 % num2; // modulo operator
			num1 = temp;
		}
		
		return num1;
	}
	
	public int gcdRecursive(int num1, int num2) {
		if(num2 == 0)
			return num1;
		
		return gcdRecursive(num2, num1 % num2);
	}

}

/* So if we put in gcdRecursive(16, 12)
 * 
 * num2 = 12 => num2 != 0 
 * 
 * so we skip if statement
 * 
 * now:-
 * 		gcdRecursive(12, 16 % 12); // gives a remainder of 4
 * 
 * 		this means for next iteration
 *
 * 		num1 = 12
 *		num2 = 4 
 * 
 * 		gcdRecursive(4, 12 % 4); // gives a remainder of 0
 * 
 * 
 * 		=> 4 is the answer, 16 and 12's gcd is 4
 */
