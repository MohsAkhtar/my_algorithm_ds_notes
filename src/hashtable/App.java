package hashtable;

public class App {

	public static void main(String[] args) {
		// hashtables are not resizeable by default so 
		// need to specify size
		HashTable table = new HashTable(19); // remember needs to be prime
		table.insert("Apple");
		table.insert("Apricot");
		table.insert("Feeling");
		table.insert("Michael");
		table.insert("Cup");
		table.insert("Keyboard");
		table.insert("Postman");
		table.insert("Mobile");
		table.insert("Phone");
		table.insert("Notepad");
		table.insert("Mouse");
		
		table.displayTable();
		
		System.out.println("\n---FIND ELEMENTS---");
		System.out.println(table.find("Apple"));
		System.out.println(table.find("Zebra"));
	}

}
