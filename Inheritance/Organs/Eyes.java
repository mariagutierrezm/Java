package org.mycode.inheritance;

public class Eyes extends Organs {

	private String color;
	
	private boolean isOpen;

	public Eyes(String organ, String condition, String color, boolean isOpen) {
		super(organ, condition);
		this.color = color;
		this.isOpen = isOpen;
	}
	
	@Override
	public void getDetails() {
		super.getDetails();
		System.out.println("Color: " + this.getColor());
	}
	
	public void open() {
		this.setOpen(true);
		System.out.println(this.getOrgan() + " is opened");
	}
	
	public void close() {
		this.setOpen(false);
		System.out.println(this.getOrgan() + " is closed");
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isOpen() {
		return isOpen;
	}

	public void setOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}
	
	

}
