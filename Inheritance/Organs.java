package org.mycode.inheritance;

public class Organs {

	private String organ;
	
	private String condition;
	
	public Organs(String organ, String condition) {
		super();
		this.organ = organ;
		this.condition = condition;
	}
	
	public void getDetails() {
		System.out.println("organ: " + this.getOrgan());
		System.out.println("medical condition: " + this.getCondition());
	}

	public String getOrgan() {
		return organ;
	}

	public void setOrgan(String organ) {
		this.organ = organ;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	
}
