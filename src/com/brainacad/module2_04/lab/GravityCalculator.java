package com.brainacad.module2_04.lab;

public class GravityCalculator {
	
	static final double acceleration = -9.81;
	
	static double v = 0, 
				  x = 0;
	
	public static double calcDist(double time) {
		
		return 0.5 * acceleration * time * time + v * time + x;
	}

	public static void main(String[] args) {
		
		System.out.println("The position of an object after falling is " + calcDist(25));
		
	}
	
}
