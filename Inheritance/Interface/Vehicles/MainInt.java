package org.mycode.interfaces;

public class MainInt {

	public static void main(String[] args) {

		VehicleInterface vehicleInterfaceOne = new Van("freeCoder");
		VehicleInterface vehicleInterfaceTwo = new Car();
		
		vehicleInterfaceOne.start();
		vehicleInterfaceOne.move(50);
		
		vehicleInterfaceTwo.start();
		vehicleInterfaceTwo.move(10);
		
		
		
		
	}

}
