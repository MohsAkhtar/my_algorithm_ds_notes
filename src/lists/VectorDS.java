package lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/* difference between arraylist and vector is vector
 * uses synchronisation and is therefore thread safe.
 */

public class VectorDS {
	
	public static void main(String[] args) {
		List<Employee> employeeList = new Vector<>();
		employeeList.add(new Employee("Jane", "Jones", 123 ));
		employeeList.add(new Employee("John", "Doe", 1234 ));
		employeeList.add(new Employee("Mary", "Smith", 22 ));
		employeeList.add(new Employee("Mike", "Wilson", 3425 ));
		
		System.out.println("---VECTOR---");
		employeeList.forEach(employee -> System.out.println(employee));
	}
}
