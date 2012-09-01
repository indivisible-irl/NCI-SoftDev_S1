package lab03;

/*
file:	Circle.java
author: David Byrne
date:	01/09/2012
desc:	Lab03, Prob03. Extend Circle class.
*/

public class Circle{

	//data members
	private double radius;
	private double area;
	private double circumference;
	private final double PI = 3.14;

	//constructor
	public Circle(){
		this.radius = 0;
		this.area = 0;
	}

	//methods
	public void setRadius(double radius){
		this.radius = radius;
		calcArea();
		calcCircumference();
	}

	public double getRadius(){
		return radius;
	}

	public void setArea(double area){
		this.area = area;
	}

	public double getArea(){
		return area;
	}
	
	public void setCircumference(double circ){
		this.circumference = circ;
	}
	
	public double getCircumference(){
		return circumference;
	}

	public void calcArea(){
		double radiusSquared = radius * radius;
		double calculatedArea = PI * radiusSquared;
		setArea(calculatedArea);
	}
	
	public void calcCircumference(){
		double calculatedCircumference = 2.0 * PI * radius;
		setCircumference(calculatedCircumference);
	}
	
	public void displayDetails(){
		System.out.println("=========================");
		System.out.println("  Details of circle:");
		System.out.println("Area: " +getArea());
		System.out.println("Circumf:" +getCircumference());
	}

}
