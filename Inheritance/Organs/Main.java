package org.mycode.inheritance;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Patients patient = new Patients("Carl", 28, new Eyes("Left Eye", "Good", "Green", false),
				new Eyes("Right Eye", "Great", "Green", true),
				new Heart("Heart", "Strong as a lion", 90), new Stomach("Stomach", "Good", true), 
				new Skin("Skin", "Good", "Beautiful", 50));
		
		System.out.println("Patient: " + patient.getName() + "\n" + "Age: " + patient.getAge());
		
		boolean finish = false;
		
		while(!finish) {
			System.out.println("\tChoose an organ: \n" +  
					"\t1. Left Eye\n" + "\t2. Right Eye\n" + 
					"\t3. Heart\n" + "\t4. Stomach\n" + 
					"\t5. Skin\n" + "\t6.Quit");
			Scanner	scanner = new Scanner(System.in);
			int select = scanner.nextInt();
			
			switch(select) {
			case 1: 
				patient.getLeftEye().getDetails();
				if(patient.getLeftEye().isOpen()) {
					System.out.println("\t1.Close Eye");
					if(scanner.nextInt() == 1) {
						patient.getLeftEye().close();
					} else {
						continue;
					}
				} else {
					System.out.println("\t2.Open it up!");
					if(scanner.nextInt() == 2) {
						patient.getLeftEye().open();
					} else {
						continue;
					}
				}
				break;
			case 2:
				patient.getRightEye().getDetails();
				if(patient.getRightEye().isOpen()) {
					System.out.println("\t1.Close Eye");
					if(scanner.nextInt() == 1) {
						patient.getRightEye().close();
					} else {
						continue;
					}
				} else {
					System.out.println("\t2.Open it up!");
					if(scanner.nextInt() == 2) {
						patient.getRightEye().open();
					} else {
						continue;
					}
				}
				break;
			case 3:
				patient.getHeart().getDetails();
				System.out.println("\t1.Change the heart rate");
				if(scanner.nextInt() == 1) {
					System.out.println("Enter the new heart rate: ");
					patient.getHeart().setHeartRate(scanner.nextInt());
					System.out.println("new heart rate: " + patient.getHeart().getHeartRate());
				} else {
					continue;
				}
				break;
			case 4:
				patient.getStomach().getDetails();
				System.out.println("\t1.Want to feed the patient?");
				if(scanner.nextInt() == 1) {
					patient.getStomach().digestion();
				} else {
					continue;
				}
				break;
			case 5:
				patient.getSkin().getDetails();
				System.out.println("\t1.Want to change the color?");
				if(scanner.nextInt() == 1) {
					System.out.println("What is wrong with that color?\n" + "Nae changing it, soz!");
				} else {
					continue;
				}
				break;
			default:
				finish = true;
				System.out.println("Bye!");
				break;
			} 
			
		}
		
		
		
		
		
	}

}
