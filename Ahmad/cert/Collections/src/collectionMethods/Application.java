package collectionMethods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Application {
	
	public static void main(String[] args) {

//		ArrayList<Integer> list1 = new ArrayList<Integer>();
//		HashSet<Integer> list1 = new HashSet<Integer>();
//		HashSet<Integer> hashSet  = new HashSet<Integer>();
		HashSet<Employee> hashSet  = new HashSet<Employee>();
		
		hashSet.add(new Employee("Mike", 3500, "Accounting"));
		hashSet.add(new Employee("Peter", 3000, "Admin"));
		hashSet.add(new Employee("Paula", 4000, "IT"));
		hashSet.add(new Employee("Joan", 2000, "Maint"));

		

		ArrayList<Employee> myList = new ArrayList<Employee>(hashSet);
		
		Collections.sort(myList);

		System.out.println(myList);
		
		
//		List<Integer> li = new ArrayList<Integer>(list1);
//		// converts hashset to list
//		
//		ArrayList<Integer> newList = new ArrayList<Integer>();
//		newList.add(10);
//		newList.add(67);
//		newList.add(15);
//		
//		list1.addAll(newList);
////		list1.removeAll(newList);
////		list1.clear();
////		boolean hasValue = list1.contains(67);
//		
//		boolean hasValue = list1.retainAll(newList);
//		//deletes anything not inside newList
//		
//		System.out.println(list1);
//		System.out.println(hasValue);
	}
}
