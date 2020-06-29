package org.mycode.designpatterns;

public class MainSingleton {

	public static void main(String[] args) {
	
		Database db = Database.getInstance("db");
		System.out.println(db.toString());
		
	}

}
