package com.shape;

public class Rectangle implements Polygon{

	float length=10;
	float breadth=20;
	@Override
	public void calcArea() {
		float area= length*breadth;
		System.out.println("Area of rectangle :"+area);
		
	}

	@Override
	public void calcPeri() {
		float peri= 2*(length+breadth);
		System.out.println("Per of rectangle :"+peri);
		
	}

}
