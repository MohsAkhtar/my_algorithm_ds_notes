package singlylinkedlist;

// similar to singly but has reference to last node
// which gives ability to quickly make changes to last node
public class CircularLinkedList {
	private Node first, last; // without assigning anything default is null
	
	private boolean isEmpty() {
		return first==null;
	}
	
	public void insertFirst(int data) {
		Node newNode = new Node();
		newNode.data = data;
		
		if(isEmpty()) {
			last = newNode; // if empty last node is new node
		}
		newNode.next = first; // newNode --> old first
		first = newNode; // first place
	}
	
	public void insertLast(int data) {
		Node newNode = new Node();
		newNode.data = data;
		
		if(isEmpty()) {
			first = newNode;
		} else {
			last.next = newNode; //the next value of the last node will point to the new node
			last = newNode; // we then make new node to be last one on list
		}
	}
	
	public int deleteFirst() {
		int temp = first.data; // capture data in first node
		
		if(first.next == null) { // means we only have single node
			last = null;
		}
		
		first = first.next; // replacing old with next
		
		return temp;
	}
	
	public void displayList() {
		System.out.println("Circular Linked List (first-->last) ");
		Node current = first;
		while(current!=null) {
			current.displayNode();
			current = current.next;
		}
		System.out.println();
	}
}
