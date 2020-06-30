package org.mycode.phone;

import java.util.ArrayList;
import java.util.Scanner;

public class MainPhone {
	
	public static ArrayList<Contacts> contacts;
	private static Scanner scanner;
	private static int id = 0;
	
	public static void main(String[] args) {
		
		contacts = new ArrayList<>();
		System.out.println("Hello");
		
		mainMenu();
		
	}

	private static void mainMenu() {
		System.out.println("\nPlease select an option: " + 
				"\t\n1.Manage contacts" + "\t\n2.See Messages" + "\t\n3.Quit");
		scanner = new Scanner(System.in);
		int choice = scanner.nextInt();
		
		switch(choice) {
			case 1:
				showContacts();
				break;
			case 2:
				showMessages();
				break;
			default:
				System.out.println("See ya later");
				break;
		}
	}
	

	public static void showContacts(){
		System.out.println("Please select one: "+ 
			"\t\n1.Show all contacts" + "\t\n2.Add new contact" + 
			"\t\n3.Search contact by name" + "\t\n4.Delete contact" + 
			"\t\n4.Go back to main menu");
		int choice = scanner.nextInt();
		switch(choice) {
			case 1:
				showAllContacts();
				break;
			case 2:
				addContact();
				break;
			case 3:
				searchContact();
				break;
			case 4:
				deleteContact();
				break;
			default:
				mainMenu();
				break;
		}
		
	}


	private static void showAllContacts() {
		if(contacts.size() == 0) {
			System.out.println("\tYou do not have any contact");
		}
		for (Contacts c: contacts) {
			c.getDetails();
			System.out.println("\n");
		}
		
		mainMenu();
		
	}
	
	private static void addContact() {
		System.out.println("Please enter name: ");
		String name = scanner.next();
		System.out.println("Please enter mobile number: ");
		int number = scanner.nextInt();
		
		if(name.equals("") || number == 0 || name.isEmpty()) {
			System.out.println("Please enter all information");
			addContact();
		} else {
			if(findContact(name) != null) {
				System.out.println("Name already exists");
				addContact();	
			} else {
				Contacts contact = new Contacts(name,number);
				contacts.add(contact);
				System.out.println("name added");
			}
		}
		
		mainMenu();
		
	}
	
	public static Contacts findContact(String name) {
		for(Contacts c: contacts) {
			if(c.getName().equals(name)) {
				return c;
			}
		}
		return null;
	}
	
	private static void searchContact() {
		System.out.println("Please enter name of contact you want to search: ");
		String name = scanner.next();
		if (name.equals("")) {
			System.out.println("Please enter a valid name with words");
			searchContact();
		} else {
			Contacts c = findContact(name);
			if(c == null) {
				System.out.println("That contact does not exists");
			} else {
				c.getDetails();
			}
		}
		
		mainMenu();
		
	}
	
	private static void deleteContact() {
		System.out.println("Please enter name of contact you want to search: ");
		String name = scanner.next();
		if (name.equals("")) {
			System.out.println("Please enter a valid name with words");
			deleteContact();
		} else {
			Contacts c = findContact(name);
			if(c != null) {
				contacts.remove(c);
				System.out.println("contact " + c.getName() + " deleted");
			} else {
				System.out.println("That contact does not exists");
			}
		}
		
		mainMenu();
		
	}
	
	private static void showMessages() {
		System.out.println("Please select an option: " + "\n1.Show all messages" + 
				"\n2.Send a new message" + "\n3.Go back to main menu");
		int choice = scanner.nextInt();
		switch(choice) {
			case 1:
				showAllMessages();
				break;
			case 2:
				sendMessage();
				break;
			default:
				mainMenu();
				break;
		}
	}

	private static void showAllMessages() {
		ArrayList<Messages> messages = new ArrayList<>();
		for(Contacts c: contacts) {
			messages.addAll(c.getMessages()); 
		}
		
		if(messages.size() > 0) {
			for(Messages m: messages) {
				m.getDetails();
				System.out.println("\n");
			}
		} else {
			System.out.println("There are no messages, soz!");
		}
		
		mainMenu();
		
	}
	

	private static void sendMessage() {
		System.out.println("who do you want to send a message: ");
		String name = scanner.next();
		if(name.equals("")) {
			System.out.println("Please enter a valid name");
			sendMessage();
		} else {
			Contacts c = findContact(name);
			if(c != null) {
				System.out.println("Type your message: ");
				String message = scanner.next();
				if(message == "") {
					System.out.println("Message can't be blank");
					System.out.println("Type your message: ");
					message = scanner.next();
				} else {
					id++;
					Messages msg = new Messages(id, name, message);
					msg.getDetails();
					System.out.println("you sure you want to send it, y=yes, n=no?");
					String answer = scanner.next();
					if(answer.equals("y")) {
						ArrayList<Messages> messagesList = c.getMessages();
						messagesList.add(msg);
						c.setMessages(messagesList);
						System.out.println("Message sent");
					} else {
						System.out.println("Ok");
						mainMenu();
					}
				}
			} else {
				System.out.println("Contact does not exists!");
			}
		}
		
		mainMenu();
		
	}
	
	

}
