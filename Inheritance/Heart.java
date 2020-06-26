package org.mycode.inheritance;

public class Heart extends Organs {
	
	private int heartRate;

	public Heart(String organ, String condition, int heartRate) {
		super(organ, condition);
		this.heartRate = heartRate;
	}

	@Override
	public void getDetails() {
		super.getDetails();
		System.out.println("Heart rate: " + this.getHeartRate());
	}
	
	public int getHeartRate() {
		return heartRate;
	}

	public void setHeartRate(int heartRate) {
		this.heartRate = heartRate;
	}
	

	
}
