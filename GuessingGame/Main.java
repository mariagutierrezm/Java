package org.mycode.weeproject;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("what's your name: ");
		Scanner	scanner = new Scanner(System.in);
		String name = scanner.next();
		System.out.println("Hi " + name + ", want to play a game y=yes n=no?");
		String answer = scanner.next();
		Random random = new Random();
		int num = random.nextInt(10) + 1;
		System.out.println(num);
		if(answer.equalsIgnoreCase("y")) {
			System.out.println("guess a number between 1 and 10: ");
			int guess = scanner.nextInt();
			int a = 0;

			do {
				if(guess < num) {
					System.out.println("guess again higher: ");
					guess = scanner.nextInt();
				} else if (guess > num){
					System.out.println("guess lower: ");
					guess = scanner.nextInt();
				} else if (guess == num) {	
					System.out.println("Congrats!");
					break;
				}
				a++;
				if(a == 5) {
					System.out.println("Game Over!");
				}
			} while(a < 5); 
			
		} else {
			System.out.println("kk See ya! :)");
		}
		
		
		
	}

}
