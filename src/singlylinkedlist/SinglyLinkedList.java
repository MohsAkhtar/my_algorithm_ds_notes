package singlylinkedlist;

// One directional list of nodes
public class SinglyLinkedList {
	private Node first; // the first node or the head

	public SinglyLinkedList() {
		
	}
	
	public boolean isEmpty() {
		return (first == null); // means we have no nodes
	}
	
	// used to insert at start of list
	public void insertFirst(int data) {
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = first; // point to old first
		first = newNode; // set first now as new node
	}
	
	// deletes from the first node
	public Node deleteFirst() {
		Node temp = first;
		first = first.next; // set first to one after deleted
		return temp;
	}
	
	// insert at end
	public void insertLast(int data) {
		Node current = first;
		while(current.next != null) { // loop to end
			current = current.next;
		}
		// create new node here
		Node newNode = new Node();
		newNode.data = data;
		current.next = newNode;
	}
	
	// prints out the entire list
	public void displayList() {
		System.out.println("Singly Linked List (First --> Last) ");
		Node current = first;
		while(current != null) {
			current.displayNode(); // print data method of node
			current = current.next;
		}
		System.out.println();
	}
}
