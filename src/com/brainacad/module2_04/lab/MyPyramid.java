package com.brainacad.module2_04.lab;

public class MyPyramid {
	
	public static void printPyramid(int h) {
		
		if (h < 1 || h > 9) return; 
		
		for (int row = 1; row <= h; row++ ) {
			String rowOfFigures = "";
			for (int col = 1; col <= row; col++ ) rowOfFigures += col; 
			for (int col = row-1; col >= 1; col-- ) rowOfFigures += col; 
			System.out.printf("%" + (h+row-1) + "s%n", rowOfFigures); 
		}
	}

	public static void main(String[] args) {
		printPyramid(8);
	}
	
}
