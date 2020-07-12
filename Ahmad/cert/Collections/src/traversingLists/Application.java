package traversingLists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Application {

	public static void main(String[] args) {
		ArrayList<String> animals = new ArrayList<String>();
		animals.add("Lion");
		animals.add("Cat");
		animals.add("Dog");
		animals.add("Bird");
		
//		for(int i =0; i < animals.size(); i++) {
//			System.out.println(animals.get(i));
//		}
//		
//		System.out.println("*******");
//		
//		for(String value : animals) {
//			System.out.println(value);
//		}
		
//		ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
//		LinkedList<Vehicle> vehicles = new LinkedList<Vehicle>();
		List<Vehicle> vehicles = new LinkedList<Vehicle>();


		Vehicle vehicle2 = new Vehicle("Toyota", "Camary", 12000, false);

		vehicles.add(new Vehicle("Honda", "accord", 12000, false));
		vehicles.add(vehicle2);
		vehicles.add(new Vehicle("Jeep", "Wrangler", 2500, true));

//		for(Vehicle car : vehicles){
//			System.out.println(car);
//		}
		
		printElements(vehicles);
		System.out.println("*******");
		printElements(animals);
	}
	
	public static void printElements(List someList) {
		for(int i = 0; i < someList.size(); i++) {
			System.out.println(someList.get(i));
		}
	}
	
}
