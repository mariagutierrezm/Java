package org.mycode.inheritance;

public class Patients {
	
	private String name;
	
	private int age;
	
	private Eyes leftEye;
	
	private Eyes rightEye;
	
	private Heart heart;
	
	private Stomach stomach;
	
	private Skin skin;
	
	public Patients(String name, int age, Eyes leftEye, Eyes rightEye, Heart heart, Stomach stomach, Skin skin) {
		super();
		this.name = name;
		this.age = age;
		this.leftEye = leftEye;
		this.rightEye = rightEye;
		this.heart = heart;
		this.stomach = stomach;
		this.skin = skin;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Eyes getLeftEye() {
		return leftEye;
	}

	public void setLeftEye(Eyes leftEye) {
		this.leftEye = leftEye;
	}

	public Eyes getRightEye() {
		return rightEye;
	}

	public void setRightEye(Eyes rightEye) {
		this.rightEye = rightEye;
	}

	public Heart getHeart() {
		return heart;
	}

	public void setHeart(Heart heart) {
		this.heart = heart;
	}

	public Stomach getStomach() {
		return stomach;
	}

	public void setStomach(Stomach stomach) {
		this.stomach = stomach;
	}

	public Skin getSkin() {
		return skin;
	}

	public void setSkin(Skin skin) {
		this.skin = skin;
	}

	
	

}
