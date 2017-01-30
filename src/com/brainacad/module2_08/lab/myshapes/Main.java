package com.brainacad.module2_08.lab.myshapes;

import java.util.Arrays;
import java.util.Comparator;

// lab2_8_2
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
public class Main {
	public static void main(String[] args) {
		
		// Lab 2_8_2
		System.out.println("LAB 2_8_2");
		System.out.println();

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

		// lab2_8_3
		System.out.println("LAB 2_8_3");
		System.out.println();

		Rectangle r1 = new Rectangle("Red", 3, 8);
		Rectangle r2 = new Rectangle("Green", 5, 12);

		System.out.println("Compare to instances of Rectangle");
		System.out.println(r1.compareTo(r2));
		System.out.println(r2.compareTo(r1));
		System.out.println();

		// lab2_8_4
		System.out.println("LAB 2_8_4");
		System.out.println();

		Rectangle[] arrOfRectangle = new Rectangle[6];
		arrOfRectangle[0] =  new Rectangle("Red", 23, 45);
		arrOfRectangle[1] =  new Rectangle("Green", 1, 4);
		arrOfRectangle[2] =  new Rectangle("Black", 34, 79);
		arrOfRectangle[3] =  new Rectangle("Grey", 32, 48);
		arrOfRectangle[4] =  new Rectangle("Magenta", 20, 80);
		arrOfRectangle[5] =  new Rectangle("Yellow", 17, 97);

		Arrays.sort(arrOfRectangle);
		for(Rectangle r : arrOfRectangle) {
			r.draw();
		}

		// lab2_8_5
		System.out.println("LAB 2_8_5");
		System.out.println();

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