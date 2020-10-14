package codeLearn;

public class StudentScores {

	public static void main(String[] args) {
		String firstName = "name";
		String lastName = "lname";
		int id = 7;
		int[] testScores = new int[2];
		testScores[0] = 80;
		testScores[1] = 60;
		
		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		
		System.out.println("Grade: " + s.calculate());
		
		
		

	}

}
