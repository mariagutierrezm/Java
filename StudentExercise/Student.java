package codeLearn;

public class Student extends StudentScores {
	
	
	private String firstName;
	private String lastName;
	private int id;
	private int[] scores;
	
	public Student(String firstName, String lastName, int id, int[] scores){
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.scores = scores;
    }
	
	public void printPerson() {
		System.out.println("Name: " + this.firstName + ", " + this.lastName);
		System.out.println("ID: " + this.id);
	}
	
	public String calculate() {
		int sum = 0;
		for(int i = 0; i < this.scores.length; i++) {
			sum += this.scores[i];
		}
		int total = sum / this.scores.length;
		System.out.println(total);
		if(total >= 90 && total <= 100) {
			return "O";
		} else if(total >= 80 && total < 90) {
			return "E";
		} else if(total >= 70 && total < 80) {
			return "A";
		} else if(total >= 55 && total < 70) {
			return "P";
		} else if(total >= 40 && total < 55) {
			return "D";
		} else {
			return "T";
		}
		
	}	

}
