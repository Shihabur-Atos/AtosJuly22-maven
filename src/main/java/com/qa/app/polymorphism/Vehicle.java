package com.qa.app.polymorphism;

public class Vehicle {

	// polymorphism -> many forms
	// -overriding
	// -overloading

	// attributes
	int speed;
	String make;
	String colour;

	// default constructor
	public Vehicle() {

	}

	// constructor - method, no return type
	// overloading the default constructor
	public Vehicle(int speed, String make, String colour) {
		super();
		this.speed = speed;
		this.make = make;
		this.colour = colour;
	}

	// method overloading
	public int topSpeed() {
		return 210;
	}

	public int topSpeed(int speed) {
		return speed;
	}

	public int add(int a, int b) {
		return a + b;
	}

	public int add(int a, int b, int c) {
		return a + b + c;
	}

	public int add(String a, int b, int c) {
		return  b + c;
	}
	
	public int add(int a, String b, int c) {
		return  a + c;
	}

	public void setSpeed(int newSpeed) {
		this.speed = newSpeed;
	}

	public int getSpeed() {
		return speed;
	}

	public String getMake() {
		return make;
	}
}
