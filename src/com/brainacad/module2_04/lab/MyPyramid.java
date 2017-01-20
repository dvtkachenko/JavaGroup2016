package com.brainacad.module2_04.lab;

import javax.xml.bind.SchemaOutputResolver;

public class MyPyramid {
	
	public static void printPyramid(int h) {
		
		if (h < 1 || h > 9) {
			System.out.println("Parametr H must be in range 1 .. 9");
			return;
		}
		
		for (int row = 1; row <= h; row++) {
			// first variant
			System.out.printf("%" + (h+1-row) + "s", " ");
			for (int col = 1; col <= row; col++ ) System.out.print(col);
			for (int col = row-1; col >= 1; col-- ) System.out.print(col);
			System.out.println();

/**			second variant
 			String rowOfFigures = "";
			for (int col = 1; col <= row; col++ ) rowOfFigures += col;
			for (int col = row-1; col >= 1; col-- ) rowOfFigures += col;
			System.out.printf("%" + (h+row-1) + "s%n", rowOfFigures);
*/		}
	}

	public static void main(String[] args) {
		printPyramid(8);
	}
	
}
