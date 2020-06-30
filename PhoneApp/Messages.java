package org.mycode.phone;

public class Messages {

	private int id;
	
	private String message;
	
	private String recipient;

	public Messages(int id, String message, String recipient) {
		super();
		this.id = id;
		this.message = message;
		this.recipient = recipient;
	}
	
	void getDetails() {
		System.out.println("Messages: " + message + "To: " + recipient);
	}
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRecipient() {
		return recipient;
	}

	public void setRecipient(String recipient) {
		this.recipient = recipient;
	}
	
	
}
