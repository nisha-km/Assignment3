package com.shape;

public class Square implements Polygon{

	float side = 10;
	@Override
	public void calcArea() {
		float area= side*side;
		System.out.println("Area of square :"+area);
		
	}

	@Override
	public void calcPeri() {
		float peri= 4*side*side;
		System.out.println("Peri of square :"+peri);
		
	}

}
