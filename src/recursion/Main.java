package recursion;

public class Main {
	
	public static final String 
			HEAD = "HEAD", 
			TAIL = "TAIL",
			FACTORIAL = "FACTORIAL",
			FACTORIAL_ACCUMULATOR = "FACTORIAL_ACCUMULATOR",
			EUCLIDEAN = "EUCLIDEAN";
	
	public static final int TEST_NUMBER = 5;
	public static final int EUCLIDEAN_NUM1 = 16, EUCLIDEAN_NUM2 = 12;

	public static void main(String[] args) {
		headTailRecursionMethod();
		factorialMethod();
		factorialAccumulatorMethod();
		euclideanMethod();
	}
	
	
	public static void headTailRecursionMethod() {
		HeadTailRecursion ht = new HeadTailRecursion();

		printTitle(HEAD);
		ht.headRecursion(TEST_NUMBER);
		
		printTitle(TAIL);
		ht.tailRecursion(TEST_NUMBER);
	}
	
	public static void factorialMethod() {
		Factorial f = new Factorial();
		int result = f.factorial(TEST_NUMBER);
		
		printTitle(FACTORIAL);
		System.out.println(result);
	}
	
	public static void factorialAccumulatorMethod() {
		FactorialAccumulator fa = new FactorialAccumulator();
		int result = fa.calculateFactorialWithAccumulator(TEST_NUMBER);
		
		printTitle(FACTORIAL_ACCUMULATOR);
		System.out.println(result);
	}

	public static void euclideanMethod() {
		Euclidean e = new Euclidean();
		int result = e.gcdRecursive(EUCLIDEAN_NUM1, EUCLIDEAN_NUM2);
		
		printTitle(EUCLIDEAN);
		System.out.println(result);
	}
	

	public static void printTitle(String method) {
		System.out.println("---" + method + "---");
	}
}
