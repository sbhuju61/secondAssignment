package com.ss.second;

public class Triangle implements Shape {
	double base;
	double height;

	Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("I am a triangle");
	}

	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return (base * height) / 2;
	}

}
