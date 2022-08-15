package com.qa.app.polymorphism;

public class Car extends Vehicle {

	int numSeats;
	String carType;

	public Car() {
		this.make = "Van";
	}
	@Override
	public int topSpeed() {
		return 180;
	}

	public int getNumSeats() {
		return numSeats;
	}

	public void setNumSeats(int numSeats) {
		this.numSeats = numSeats;
	}

	public String getCarType() {
		return carType;
	}

	public void setCarType(String carType) {
		this.carType = carType;
	}
}
