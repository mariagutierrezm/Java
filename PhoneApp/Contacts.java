package org.mycode.phone;

import java.util.ArrayList;

public class Contacts {
	
	private String name;
	
	private int number;
	
	private Boolean active = true;
	
	private ArrayList<Messages> messages;

	
	public Contacts(String name, int number, ArrayList<Messages> messages) {
		super();
		this.name = name;
		this.number = number;
	}
	
	public Contacts(String name, int number) {
		super();
		this.name = name;
		this.number = number;
		this.messages = new ArrayList<>();
		//saving an empty arraylist when a new contact is added
	}

	public void getDetails() {
		System.out.println("contact name: " + name + ", number: " + number + "\n\tMessages: " + messages);
	}

	public String getName() {
		return name;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public ArrayList<Messages> getMessages() {
		return messages;
	}

	public void setMessages(ArrayList<Messages> messages) {
		this.messages = messages;
	}
	
	

}
