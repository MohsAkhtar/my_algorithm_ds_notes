package lists;

import java.util.ArrayList;
import java.util.List;


public class ArrayListDS {
	
	public static void main(String[] args) {
		// List rather than ArrayList, by using List
		// We can easily change it to another type of List
		// As in we can easily change the class we are using
		// when we are creating the instance
				
		List<Employee> employeeList = new ArrayList<>(); // generate default 10 capacity ArrayList
		employeeList.add(new Employee("Jane", "Jones", 123 ));
		employeeList.add(new Employee("John", "Doe", 1234 ));
		employeeList.add(new Employee("Mary", "Smith", 22 ));
		employeeList.add(new Employee("Mike", "Wilson", 3425 ));
				
		// Could use For loop but Java now has Lambda expressions
				
		employeeList.forEach(employee -> System.out.println(employee));
		
		// get second employee in List
		System.out.println(employeeList.get(1));
		
		// check if list is empty
		System.out.println(employeeList.isEmpty());
		
		// replace existing item in array with another
		employeeList.set(1, new Employee("Jane", "Adam", 123 ));
		
		// size (not capacity) of list
		System.out.println(employeeList.size());
		
		// if we want to add in specific location - default is end of list
		employeeList.add(3, new Employee("Mohs", "Akhtar", 123 ));
		employeeList.forEach(employee -> System.out.println(employee));
		
		// Worst case for this is O(n) as worst case is we are adding to start
		// of array and all elements have to be shifted
		
		// To get array back from list toArray() method
		// but we won't get back an employee array we'll get an object array
		Object[] employeeObjectArray = employeeList.toArray();
		
		// Now if we want an employee array we pass an array of the type we want
		// Change object to employee and specify type
		Employee[] employeeArray = 
				employeeList.toArray(new Employee[employeeList.size()]); // need size so we can specify the array length
		
		for(Employee employee: employeeArray) { // for every element in array
			System.out.println(employee);
		}
		
		// Check if element exists in arraylist
		// returns false if we do not override
		// equals method in employee class as we are comparing two different instances
		// with equals method override
		System.out.println(employeeList.contains(new Employee("Mary", "Smith", 22 )));
		
		// find index of element
		System.out.println(employeeList.indexOf(new Employee("Mary", "Smith", 22 )));
		
		// remove items from list
		System.out.println(employeeList.remove(3));
	}

}

/* Capacity - maximum number of items ArrayList can hold
 * Size - How many items it currently has
 * 
 * We use ArrayList instead of Array as ArrayList has a bunch of methods
 * already written for you to work with List items.
 * 
 * Also ArrayList implements the List interface and so you can swap to another 
 * type of List that uses the interface without too much disruption of code.
 * 
 * As long as you provide an index, whatever operation you perform will perform with
 * a time complexity of O(1)
 * 
 * So ArrayLists are good for random access if you have the index and its good for iterating
 * items over the list. 
 * 
 * But, its not so good for inserting items into the list unless it is at the end. It's
 * not so good for deletion and removals. And its not so good for accessing elements
 * if you don't have an index.
 */
