package org.mycode.designpatterns;

public class Database {
	
	private String name;
	
	private static Database instance;
	//to make sure there is only one instance of this class in the application we declare it static
	
	public static synchronized Database getInstance(String name) {
		//synchronized will make a getInstance thread safe
		//means no more than one thread can call this instance at the same time
		if(null == instance) {
			instance = new Database (name);
		}
		return instance;
	}
	

	private Database(String name) { 
		//private constructor so it is only usable inside the class, to make sure singleton pattern is used
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
