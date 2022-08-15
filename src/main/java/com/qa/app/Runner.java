package com.qa.app;

import com.qa.app.encapsulation.Customer;
import com.qa.app.inheritance.Child;
import com.qa.app.inheritance.GrandParent;
import com.qa.app.inheritance.Parent;
import com.qa.app.polymorphism.Car;
import com.qa.app.polymorphism.Vehicle;

public class Runner {

	public static void main(String[] args) {

		// ---Inheritance
//		GrandParent w = new GrandParent();
//		w.genes();		
//		
//		Parent x = new Parent();
//		x.info();// method in parent class
//		x.genes();// method in grandparent class
//		
//		Child y = new Child();
//		y.info();//method in parent class
//		y.personailty(); // method in child class
//		y.genes();// method in grandparent class

		// ---Encapsulation
//		Customer a = new Customer();
//		System.out.println(a.toString());
//		a.setName("ash");
//		a.setAge(03);
//		a.setAddress("ireland");
//		a.setAccountNo(243);
//		System.out.println(a.toString());
//		System.out.println(a.getName());
//		
//		System.out.println("------constructor with fields");
//		Customer b = new Customer("ash", 10, "tbc", 393);
//		System.out.println(b.toString());
//		b.setAddress(null);
//		
//		Customer c = new Customer("bob", 64, "uk", 122);
//		System.out.println(c.toString());

		// ---Polymorphism
		Vehicle d = new Vehicle();

		Vehicle f = new Vehicle(120, "car", "blue");
		System.out.println(f.topSpeed());// 210
		System.out.println(f.topSpeed(345));// 345
		f.add(0, "+", 0);

		Car a5 = new Car();
		System.out.println(a5.topSpeed() + " - CAR");


	}

}
