package com.Kunal;

public class Bus implements Vehicle {

    private String name;

    // Default constructor
    public Bus() {
    }

    // Parameterized constructor
    public Bus(String name) {
        this.name = name;
    }

    @Override
    public int getMillage() {
        // TODO Auto-generated method stub
        return 10;
    }

    public String getName() {
        return "Bus name is " + name;
    }
}
