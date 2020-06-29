package org.mycode.interfaces;

public class Van implements VehicleInterface {

	private String name;
	
	public Van(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void start() {
		System.out.println("run run starting");
		System.out.println(this); //this refers to the current object(class) it will print the address of our class
	}

	@Override
	public void move(int speed) {
		System.out.println(this.getName() + " is fast moving at " + speed + " Km/h");
	}

}
