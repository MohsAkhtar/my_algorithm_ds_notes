package stack;

public class App {

	public static void main(String[] args) {
		StringReverse strRev = new StringReverse(3);
		strRev.push('h');
		strRev.push('e');
		strRev.push('y');
		
		String reverseString = "";
		
		while(!strRev.isEmpty()) {
			char value = strRev.pop();
			reverseString+= value;
			System.out.println(value);
		}
		System.out.println(reverseString);
	}

}
