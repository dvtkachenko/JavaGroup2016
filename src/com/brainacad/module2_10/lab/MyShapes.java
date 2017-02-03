package com.brainacad.module2_10.lab;

import java.util.Arrays;
import java.util.Comparator;

// lab2_10
interface Drawable {
	void draw();
}

class ShapeColorComparator implements Comparator {
	@Override
	public int compare(Object o1, Object o2) {

		Shape s1 = (Shape) o1;
		Shape s2 = (Shape) o2;
		return s1.getShapeColor().compareTo(s2.getShapeColor());
	}
}

abstract class Shape implements Drawable {
	abstract public double calcArea();
	private String shapeColor;

	static Shape parseShape(String strForParse) {

		String[] strArr = strForParse.split(":|,");

		Shape shape = null;

		switch(strArr[0].toLowerCase()) {
			case "rectangle" :
				shape = new Rectangle(strArr[1],
						Double.parseDouble(strArr[2]),
						Double.parseDouble(strArr[3]));break;
			case "triangle" :
				shape = new Triangle(strArr[1],
						Double.parseDouble(strArr[2]),
						Double.parseDouble(strArr[3]),
						Double.parseDouble(strArr[4]));break;
			case "circle" :
				shape = new Circle(strArr[1],
						Double.parseDouble(strArr[2]));break;
		}

		return shape;
	}

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

class Circle extends Shape implements Comparable {
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

	// implements interface Comparable
	public int compareTo(Object o) {
		Circle circle = (Circle) o;
		if (this.calcArea() > circle.calcArea()) return 1;
		if (this.calcArea() < circle.calcArea()) return -1;
		return 0;
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

class Rectangle extends Shape implements Comparable {
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

	// implements interface Comparable
	public int compareTo(Object o) {
		Rectangle rectangle = (Rectangle) o;
		if (this.calcArea() > rectangle.calcArea()) return 1;
		if (this.calcArea() < rectangle.calcArea()) return -1;
		return 0;
		// ternary comparation
//		 return this.calcArea() > rectangle.calcArea() ? 1 :
//				this.calcArea() < rectangle.calcArea() ? -1 : 0;

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

class Triangle extends Shape implements Comparable {
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
	// implements interface Comparable
	public int compareTo(Object o) {
		Triangle triangle = (Triangle) o;
		if (this.calcArea() > triangle.calcArea()) return 1;
		if (this.calcArea() < triangle.calcArea()) return -1;
		return 0;
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
public class MyShapes {
	public static void main(String[] args) {
		

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

		Shape[] arr = new Shape[10];

		arr[0] = new Rectangle("Purple", 3, 8);
		arr[1] = new Rectangle("Brown", 45, 9);
		arr[2] = new Rectangle("Black", 4, 12);
		arr[3] = new Rectangle("Blue", 3, 15);
		arr[4] = new Rectangle("Cayan", 21, 10);
		arr[5] = new Circle("Yellow", 12);
		arr[6] = new Circle("Red", 15);
		arr[7] = new Triangle("Orange", 7, 14, 20);
		arr[8] = new Triangle("Pink", 6, 22, 18);
		arr[9] = new Triangle("White", 6, 22, 18);

		Arrays.sort(arr, new ShapeColorComparator());
		for(Shape sh : arr) {
			sh.draw();
		}

	}

}