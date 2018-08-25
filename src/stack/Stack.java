package stack;

public class Stack {

	private int maxSize; // size of stack
	private long[] stackArray; // container which will store list of items
	private int top; // index position of last item placed on stack
	
	// initialise stack array
	public Stack(int size) {
		this.maxSize = size;
		this.stackArray = new long[maxSize];
		// start at -1 as nothing exists yet
		// stacks start at 0 when something exists
		this.top = -1;	
	}
	
	// used to put things on stack
	public void push(long j) {
		top++; // new item on stack so top increments
		stackArray[top] = j; // assign value to that index position in stackArray
	}
	
	// returns item that we popped so not void
	public long pop() {
		// make copy of current top index position
		int old_top = top;
		top--;
		return stackArray[old_top]; // return index position on item being removed
	}
	
	// return item that is currently on top of stack
	public long peak() {
		return stackArray[top];
	}
	
	// check if stack is empty by checking if top is -1 again
	public boolean isEmpty() {
		return (top == -1);
	}
	
	public boolean isFull() {
		return (maxSize-1 == top); // -1 as we start at 0 in arrays
	}
}
