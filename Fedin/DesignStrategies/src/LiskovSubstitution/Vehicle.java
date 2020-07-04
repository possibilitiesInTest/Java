package LiskovSubstitution;

public class Vehicle {
	abstract int getSpeed();
	abstract int getCubicCapacity();
}

public class Car extends Vehicle {
	int getSPeed() { }
	int getCubicCapacity() {}
	boolean sHatchBack() {}
}

public class Bus extend Vehicle
{
	int getSpeed() {
	inte getCubicCapacity() {}
	String getEmergencyExitLoc() {}
	}
}

public static void main (String [] args) {
	
	Vehicle vehicle = new Bus();
	vehicle.getSpeed();
	vehicle = new Car();
	vehicle.getCubicCapacity();
}


