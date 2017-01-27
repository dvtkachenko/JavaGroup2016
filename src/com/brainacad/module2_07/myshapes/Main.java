package com.brainacad.module2_07.myshapes;

class Shape {
	private String shapeColor;
	
	Shape(String shapeColor) {
		this.shapeColor = shapeColor;
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
	public double calcArea() {
		return 0.0;
	}

}

class Circle extends Shape {
	private double radius;
	
	Circle(String color, double radius) {
		super(color);
		this.radius = radius;
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
		super(color);
		this.width = width;
		this.height = height;
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
		super(color);
		this.a = a;
		this.b = b;
		this.c = c;
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
		
		// Lab 2_7_6
		Shape shape = new Shape("Green");
		System.out.println(shape);
		System.out.print("Shape's area is ");
		System.out.printf("%.2f", shape.calcArea());
		System.out.println();
		System.out.println();
		
		// Lab 2_7_7
		Circle circle = new Circle("Yellow", 12);
		System.out.println(circle);
		System.out.print("Circle's area is ");
		System.out.printf("%.2f", circle.calcArea());
		System.out.println();
		System.out.println();

		// Lab 2_7_8
		Rectangle rectangle = new Rectangle("Red", 4, 8);
		System.out.println(rectangle);
		System.out.print("Rectangle's area is ");
		System.out.printf("%.2f", rectangle.calcArea());
		System.out.println();
		System.out.println();
		
		// Lab 2_7_9
		Triangle triangle = new Triangle("Black", 4, 6, 9);
		System.out.println(triangle);
		System.out.print("Triangle's area is ");
		System.out.printf("%.2f", triangle.calcArea());
		System.out.println();
		System.out.println();
		
		// Lab 2_7_10
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

		double sumArea = 0.0;
		double sumRectArea = 0.0;
		double sumTriangleArea = 0.0;
		double sumCircleArea = 0.0;
		
		for(Shape sh : arrOfShapes) {
			System.out.print(sh);
			System.out.printf(", area is %.2f", sh.calcArea());
			System.out.println();
			sumArea += sh.calcArea();
			
			if (sh instanceof Rectangle) sumRectArea += sh.calcArea(); 
			if (sh instanceof Circle) sumCircleArea += sh.calcArea(); 
			if (sh instanceof Triangle) sumTriangleArea += sh.calcArea(); 
		}
		
		System.out.println();
		System.out.printf("Rectangle's total area is %.2f", sumRectArea); 
		System.out.println();
		System.out.printf("Circle's total area is %.2f", sumCircleArea); 
		System.out.println();
		System.out.printf("Triangle's total area is %.2f", sumTriangleArea);
		System.out.println();
		System.out.printf("Total area of all shapes is %.2f", sumArea);
		System.out.println();
		
		
	}

}