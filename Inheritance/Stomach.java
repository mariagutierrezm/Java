package org.mycode.inheritance;

public class Stomach extends Organs {
	
	private boolean empty;

	public Stomach(String organ, String condition, boolean empty) {
		super(organ, condition);
		this.empty = empty;
	}
	
	@Override
	public void getDetails() {
		super.getDetails();
		if(this.isEmpty()) {
			System.out.println("Is hungry!");
		} else {
			System.out.println("Quite full actually");
		}
		
	}
	
	public void digestion() {
		System.out.println("Getting that digestion on the go!");
	}

	public boolean isEmpty() {
		return empty;
	}

	public void setEmpty(boolean empty) {
		this.empty = empty;
	}
	
	

}
