package queue;

public class Queue {
	private int maxSize; // initialises the set number of slots
	private long[] queArray;
	private int front; // index position of element at front
	private int rear; // element at back
	private int nItems; // counter to maintain the number of items in queue
	
	public Queue(int size) {
		this.maxSize= size;
		this.queArray = new long[maxSize];
		front = 0;
		rear = -1; // no item in array yet to be considered last item
		nItems = 0; // as no items exist yet
	}
	
	// insert items into queue
	public void insert(long j) {
		// if we reach the max size of array and have more items
		// This is a circular queue
		if(rear == maxSize -1) {
			rear = -1; // reset rear, basically will be overwriting
		}
		rear++; // we insert in last position for queues
		queArray[rear] = j;
		nItems++;
	}
	
	// remove items from queue
	public long remove() {
		// remove from front of queue
		long temp = queArray[front];
		// increment as we want next item in line
		front++;
		
		if(front == maxSize) { // if true we have removed everything from queue
			front = 0; // reset to '0' so we can use entire array again
		}
		
		// decrease number of items
		nItems--;
		return temp;
	}
	
	// see item at beginning of queue
	public long peekFront() {
		return queArray[front];
	}
	
	public boolean isEmpty() {
		return (nItems == 0);
	}
	
	public boolean isFull() {
		return (nItems == maxSize);
	}
	
	// view the contents of the data structure
	public void view() {
		System.out.print("[");
		// loop over array
		for(int i = 0; i < queArray.length; i++) {
			System.out.print(queArray[i] + " ");
		}
		System.out.println("]");
	}
}
