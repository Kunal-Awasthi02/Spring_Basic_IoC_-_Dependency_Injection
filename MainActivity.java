package com.Kunal;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainActivity {
	
	public static void main(String[] args) {
	    	
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		Vehicle vehicle = (Vehicle)context.getBean("myVehicle",Vehicle.class);
		System.out.println(vehicle.getName());
		
	}
    
}
