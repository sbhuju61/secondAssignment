package com.ss.second;

public class Rectangle implements Shape {
	double length;
	double width;

	Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("I am a rectangle");
	}

	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return length * width;
	}

}
