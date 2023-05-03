package jarraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;



import pojo.Employee;

public class BasicsListImpl {
	
	
	//Java program to create an array list, add some colors (strings) and print out the collection
	public static void addcolors() {
		
		Scanner scanner = new Scanner(System.in);
		
		List<String> colors = new ArrayList<String>();
		System.out.println("Enter colors::::");
		for(int i =0; i <5; i++) {
			String color = scanner.nextLine();
			colors.add(color);
		}
		
		colors.forEach(System.out::println);
	}
	
	// Java program to filter all employees salary greater than 50k
	public static void filterEmployees (List<Employee> emp) {
		
		emp.stream().filter(e -> e.getSalary() > 50000).collect(Collectors.toList()).forEach(System.out::println);;
	}
	
	// Java program to add an element in beginning of an array
	public static void insertFirst(List<Employee> list) {
		
		list.add(0, new Employee(0, "First", 40000L));
		list.forEach(System.out::println);
	}
	
	
	// Java program to retrieve an element
	public static void getEmployee(int i, List<Employee> list) {
		
		System.out.println(list.get(i));
		
	}
	
	// Java program to update an array element by the given element.
	public static void updateList (Employee oldemp, Employee newemp , List<Employee> list) {
		 
		list.set(list.indexOf(oldemp), newemp);
	}
	
	// Java program to remove an element
		public static void deleteEmployee(int i, List<Employee> list) {
			
			System.out.println(list.remove(i));
			
		}
		
		// Java program to copy one array list into another
		public static void copyEmployee(List<Employee> list) {
			
			List copyEmp = new ArrayList<Employee>();
			Collections.copy(copyEmp, list);
			
			
		}
		
		// Java program to sort a given array list and reerse the same.
		 public static void sortEmp (List<Employee> list) {
			 
			 Comparator<Employee> c = (Employee e1, Employee e2) -> e1.getSalary().compareTo(e2.getSalary());
			 
			 Collections.sort(list, c);
			 
			 Collections.reverse(list);
			

		 }
	
	public static void main (String args[]) {
		
		//BasicsListImpl.addcolors();
		
		
		Employee emp1 = new Employee(1, "A", 5000000L);
		Employee emp2 = new Employee(2, "B", 500L);
		Employee emp3 = new Employee(3, "C", 50L);
		Employee emp4 = new Employee(4, "D", 50L);
		Employee emp5 = new Employee(5, "E", 10000000L);
		
		List<Employee> list =new ArrayList<>();
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
		list.add(emp5);
		
		BasicsListImpl.filterEmployees(list);
		
		BasicsListImpl.insertFirst(list);
				
	    BasicsListImpl.getEmployee(0, list);
	    
	    Employee emp6 = new Employee(5, "E", 9000000L);
	    BasicsListImpl.updateList(emp5, emp6, list);
	    
	    BasicsListImpl.deleteEmployee(0, list);
	    BasicsListImpl.sortEmp(list);
	    
	    System.out.println("----------");;
	    list.forEach(System.out::println);
	}

}
