package com.Kunal;


public class Car implements Vehicle{
	
	// Adding a default contructor
	public Car() {
		
	}
	
	public int getMillage() {
		return 5;
	}
	
	String name;
	Car(String name){
		this.name = name;
	}
	
	public String getName() {
		return "car name is " + name;
	}

}
