package com.brainacad.module2_08.lab.myshapes;

// lab2_8_2
interface Drawable {
	void draw();
}

// lab2_8_1
abstract class Shape implements Drawable {
	abstract public double calcArea();
	private String shapeColor;

//	Shape(String shapeColor) {
//		this.shapeColor = shapeColor;
//	}

	public String getShapeColor() {
		return shapeColor;
	}

	public void setShapeColor(String shapeColor) {
		this.shapeColor = shapeColor;
	}

	public String toString() {
		return "This is Shape, color is " + shapeColor;
	}

}

class Circle extends Shape {
	private double radius;
	
	Circle(String color, double radius) {
		setShapeColor(color);
		this.radius = radius;
	}

	public void draw() {
		System.out.println(this.toString());
		System.out.print("Circle's area is ");
		System.out.printf("%.2f", calcArea());
		System.out.println();
		System.out.println();
	}

	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	@Override
	public double calcArea() {
		return Math.PI*radius*radius;
	}

	@Override
	public String toString() {
		return "This is Circle, color is " + getShapeColor() + ", radius = " + radius;
	}
	
}

class Rectangle extends Shape {
	private double width, height;
	
	Rectangle(String color, double width, double height) {
		setShapeColor(color);
		this.width = width;
		this.height = height;
	}

	public void draw() {
		System.out.println(this.toString());
		System.out.print("Rectangle's area is ");
		System.out.printf("%.2f", calcArea());
		System.out.println();
		System.out.println();
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	@Override
	public double calcArea() {
		return width*height;
	}

	@Override
	public String toString() {
		return "This is Rectangle, color is " + getShapeColor() + 
				", width = " + width + " , height = " + height;
	}
	
}

class Triangle extends Shape {
	private double a, b, c;
	
	Triangle(String color, double a, double b, double c) {
		setShapeColor(color);
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public void draw() {
		System.out.println(this.toString());
		System.out.print("Triangle's area is ");
		System.out.printf("%.2f", calcArea());
		System.out.println();
		System.out.println();
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}
	
	@Override
	public double calcArea() {
		double s = (a+b+c)/2;
		return Math.sqrt(s*(s-a)*(s-b)*(s-c));
	}

	@Override
	public String toString() {
		return "This is Triangle, color is " + getShapeColor() + 
				", a = " + a + ", b = " + b + ", c = " + c;
	}
	
}
public class Main {
	public static void main(String[] args) {
		
		// Lab 2_8_2
		Shape[] arrOfShapes = new Shape[9];
		
		arrOfShapes[0] = new Rectangle("Red", 3, 8);
		arrOfShapes[1] = new Rectangle("Brown", 6, 9);
		arrOfShapes[2] = new Rectangle("Black", 4, 12);
		arrOfShapes[3] = new Rectangle("Blue", 3, 15);
		arrOfShapes[4] = new Rectangle("Cayan", 5, 10);
		arrOfShapes[5] = new Circle("Yellow", 12);
		arrOfShapes[6] = new Circle("Red", 15);
		arrOfShapes[7] = new Triangle("Black", 7, 14, 20);
		arrOfShapes[8] = new Triangle("Magenta", 6, 22, 18);

		for(Shape sh : arrOfShapes) {
			sh.draw();
		}

	}

}