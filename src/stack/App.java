package stack;

public class App {

	public static void main(String[] args) {
		String test = "hello";
		String result = testReverse(test);
		System.out.println(result);
	}

	public static String testReverse(String str) {
		// need array length
		int maxSize = str.length();
		// initialise array
		Stack stack = new Stack(maxSize);
		// loop through string and output chars to array
		for(int j = 0; j < maxSize; j++) {
			stack.push(str.charAt(j));
		}
		
		String result = "";
		
		while(!stack.isEmpty()) {
			char value = stack.pop();
			result += value;
		}
		
		return result;
	}
	
	public static String reverseString(String str) {
		int stackSize = str.length();
		Stack theStack = new Stack(stackSize);
		for(int j = 0; j < str.length(); j++) {
			char ch = str.charAt(j); // getting a char from input string
			theStack.push(ch);
		}
		
		String result = "";
		while(!theStack.isEmpty()) {
			char ch = theStack.pop();
			result += ch;
		}
		
		return result;
	}
}
