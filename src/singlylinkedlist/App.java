package singlylinkedlist;

public class App {

	public static void main(String[] args) {
//		Node nodeA = new Node(); // create first node
//		nodeA.data = 4; // set first nodes data
//		
//		Node nodeB = new Node();
//		nodeB.data = 3;
//		
//		nodeA.next = nodeB; // passing reference of next node
	
		SinglyLinkedList singly = new SinglyLinkedList();
		singly.insertFirst(100);
		singly.insertFirst(50);
		singly.insertFirst(90);
		singly.insertFirst(30);
		singly.insertLast(333);
		singly.displayList();
		
		CircularLinkedList circular = new CircularLinkedList();
		circular.insertFirst(1);
		circular.insertFirst(5);
		circular.insertFirst(9);
		circular.insertFirst(3);
		circular.insertLast(33);
		circular.displayList();
	}

	public static int listLength(Node node) {
		int count = 0;
		Node currentNode = node;
		
		while(currentNode != null) {
			count++;
			currentNode = currentNode.next;
		}
		return count;
	}
}
