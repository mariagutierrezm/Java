package org.mycode.interfaces;

public class Car implements VehicleInterface {

	@Override
	public void start() {
		System.out.println("trying to start the car");
	}

	@Override
	public void move(int speed) {
		System.out.println("movin super slow at " + speed + " km/h");
	}

}
