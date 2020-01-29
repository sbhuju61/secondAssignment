package com.ss.second;

public class Circle implements Shape {
	double radius;

	Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("I am a circle");
	}

	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return 3.14 * radius * radius;
	}

}
