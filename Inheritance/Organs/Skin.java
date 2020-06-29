package org.mycode.inheritance;

public class Skin extends Organs {
	
	private String color;
	
	private int softeness; 
	
	public Skin(String organ, String condition, String color, int softeness) {
		super(organ, condition);
		this.color = color;
		this.softeness = softeness;
	}
	
	@Override
	public void getDetails() {
		super.getDetails();
		System.out.println("Color: " + this.getColor());
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getSofteness() {
		return softeness;
	}

	public void setSofteness(int softeness) {
		this.softeness = softeness;
	}
}
