package stack;

public class StringReverse {
	private int maxSize;
	private char[] stringArray;
	private int top;
	
	public StringReverse(int size) {
		this.maxSize = size;
		this.stringArray = new char[maxSize];
		this.top = -1;
	}
	
	public void push(char j) {
		top++;
		stringArray[top] = j;
	}
	
	public char pop() {
		int old_top = top;
		top--;
		return stringArray[old_top];
	}
	
	public boolean isEmpty() {
		return (top == -1);
	}
}
