package com.brainacad.lab1_6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.lang.Integer;

/**
 * Created by Dmitriy on 28.11.2016.
 */

abstract class Lab1_6 {
    void showHeader() {}
    void showLabResult() {}
};

class Lab1_6_1 extends Lab1_6 {

   void showHeader() {
       System.out.println();
       System.out.println();
       System.out.println("--------------------------------------------------------");
       System.out.println("------------------    LAB ¹ 1_6_1  ---------------------");
       System.out.println("--------------------------------------------------------");
       System.out.println();
       System.out.println("Create an array of all the even numbers from 2 to 30 (2,4,6...30) ");
       System.out.println("and display elements of the array to the screen.");
       System.out.println();
   }
   void showLabResult() {
	   
	   int[] intArray = new int[15];
	   
       System.out.println();
       System.out.println("Initialization and printing by using for");
       System.out.println();
       
	   for(int i=0, num=2; i < intArray.length; i++, num+=2) {
	       System.out.println("Array[" + i + "] = " + (intArray[i] = num));
	   }
	   
       System.out.println();
       System.out.println("Printing by using for-each loop");
       System.out.println();
       
	   for(int num:intArray) {
	       System.out.println(num);
	   }
	   
   }	
}

class Lab1_6_2 extends Lab1_6 {

   void showHeader() {

       System.out.println();
       System.out.println();
       System.out.println("--------------------------------------------------------");
       System.out.println("------------------    LAB ¹ 1_6_2  ---------------------");
       System.out.println("--------------------------------------------------------");
       System.out.println();
       System.out.println("There are statistics for the year by months as an array:   ");
       System.out.println("int[] m = new int[] { 10, 21, 5, 22, 9, 29, 25, 22, 11, 14, 8, 14 };");
       System.out.println("Write code which calculates the maximum value from the array, the minimum value and the average.");
       System.out.println();
 
   }

   void showLabResult() {

	   int[] intArray = new int[] { 10, 21, 5, 22, 9, 29, 25, 22, 11, 14, 8, 14 };
	   
	   int min = 20000, 
		   max = 0;
	   
	   for (int item:intArray) {
		   if (item < min) {
			   min = item;
		   } 
		   
		   if (item > max) {
			   max = item;
		   }
	   }
	   
	   Arrays.sort(intArray);
	   
       System.out.println("There are two ways: first - by using Arrays.sort, second - by my own");
       System.out.println();
       System.out.println("Minimum value = " + intArray[0] + "  and MIN = " + min);
       System.out.println("Maximum value = " + intArray[intArray.length-1] + " and MAX = " + max);
       
       int average = 0;
       
       for(int num:intArray) {
    	   average += num;
       }
       
       System.out.println("Average value = " + (double)average/intArray.length);
	   
   }
}

class Lab1_6_3 extends Lab1_6 {

   void showHeader() {
       System.out.println();
       System.out.println();
       System.out.println("--------------------------------------------------------");
       System.out.println("------------------    LAB ¹ 1_6_3  ---------------------");
       System.out.println("--------------------------------------------------------");
       System.out.println();
       System.out.println("Write a program, which creates square matrix like those in the figure");
       System.out.println("below and prints them formatted to the console. The size of the matrix is 4 x 4:  ");
       System.out.println();
       System.out.println("---------------------");
       System.out.println("|  1 |  5 |  9 | 13 |");
       System.out.println("---------------------");
       System.out.println("|  2 |  6 | 10 | 14 |");
       System.out.println("---------------------");
       System.out.println("|  3 |  7 | 11 | 15 |");
       System.out.println("---------------------");
       System.out.println("|  4 |  8 | 12 | 16 |");
       System.out.println("---------------------");
       System.out.println();
       System.out.println();
   }

   void showLabResult() {
	   
//	   int[][] squareArray = {{1,5,9,13},{2,6,10,14},{3,7,11,15},{4,8,12,16}};
	   
	   final int SIZE = 4;
	   int [][] squareArray = new int[SIZE][SIZE]; 

	   int num = 1;
	   
	   for (int col=0;col<SIZE;col++) {
		   for (int row=0;row<SIZE;row++) {
			  squareArray[row][col] = num++; 
		   }
	   }
		   
       System.out.println();
       System.out.println();
       System.out.println("Printing matrix");
       System.out.println();
       System.out.println();
	   
	   for(int[] row:squareArray) {

		   System.out.println("---------------------");

		   for (int item:row) {
			   
			   if (item < 10) {
				   System.out.print("|  " + item + " ");
			   } else {
				   System.out.print("| " + item + " ");
			   }
		   
		   }
		   
		   System.out.println("|");
	   }
       System.out.println("---------------------");

       System.out.println();
       System.out.println();
	   
   }
}

class Lab1_6_4 extends Lab1_6 {

   void showHeader() {
       System.out.println();
       System.out.println();
       System.out.println("--------------------------------------------------------");
       System.out.println("------------------    LAB ¹ 1_6_4  ---------------------");
       System.out.println("--------------------------------------------------------");
       System.out.println();
       System.out.println("Write a program, which uses a binary search in a sorted array of integer numbers to find a certain element.");
       System.out.println();
       System.out.println();
   }
   
   private int getNumberByRecursion(int[] intArray, int leftBound, int rightBound, int num) {

	   int index;
	   
       System.out.println("getNumber was called with leftBound = " + leftBound + "  rightBound = " + rightBound);
	   
	   if (rightBound < leftBound) {
		   return -1;
	   } 

	   index = leftBound + (int)(rightBound-leftBound)/2;
	   
	   if (num == intArray[index]) {
		   return index;
	   }
	   
	   if (num < intArray[index]) {
		   rightBound = index - 1;
	   } else {
		   leftBound = index + 1;
	   }
	   
	   return getNumberByRecursion(intArray, leftBound, rightBound, num);
	   
   }

   private int getNumberByWhile(int[] intArray, int leftBound, int rightBound, int num) {

	   while (rightBound >= leftBound) {

		   System.out.println("next while's iteration with leftBound = " + leftBound + "  rightBound = " + rightBound);
		   
		   int index = leftBound + (int)(rightBound-leftBound)/2;
		   
		   if (num == intArray[index]) {
			   return index;
		   }
		   
		   if (num < intArray[index]) {
			   rightBound = index-1;
		   } else {
			   leftBound = index+1;
		   }
		   
	   }
	   
	   return -1;
   }
   
   void showLabResult() {

	   final int SIZE = 19, RANGE = 1000;

	   int[] intArray = new int[SIZE];

	   int n;
	    
       System.out.println("Initialising int Array by Math.random method ... ");
       System.out.println();

       for (int i=0;i<intArray.length;i++) {
           System.out.println("intArray[" + i + "]" + " = " + (intArray[i] = (int) (Math.random() * RANGE)));
       }

       Arrays.sort(intArray);

       System.out.println();
       System.out.println();
       System.out.println("Array after sorting");
       System.out.println();
       System.out.println();

       for (int i=0;i<intArray.length;i++) {
           System.out.println("intArray[" + i + "]" + " = " + intArray[i]);
       }
       
       System.out.println();
       
       
       Scanner getSymbol = new Scanner(System.in);

       System.out.println();
       System.out.print("Please enter integer number from intArray -> ");

       n = getSymbol.nextInt();
/**
       boolean isFound = false;

       for (int item:intArray) {
           if (item == n) {
               isFound = true;
           }

       }

       if (!isFound) {
           System.out.println("Oops ! N is not from intArray");
           System.out.println("Try it again !");
           return;
       }

*/       

       System.out.println();
       System.out.println("Using recursion");
       System.out.println("I am looking for N in an intArray by binary search ... ");
       System.out.println();

       int result = getNumberByRecursion(intArray,0,intArray.length-1,n);
       
       if (result != -1) {
           System.out.println();
           System.out.println("N has just found in intArray[" + result + "] = " + intArray[result]);
       } else {
           System.out.println("N has not found in intArray !");
       }

       System.out.println();
       System.out.println("Using while");
       System.out.println("I am looking for N in an intArray by binary search ... ");
       System.out.println();

       result = getNumberByWhile(intArray,0,intArray.length-1,n);
       
       if (result != -1) {
           System.out.println();
           System.out.println("N has just found in intArray[" + result + "] = " + intArray[result]);
       } else {
           System.out.println("N has not found in intArray !");
       }


   }
}

class Lab1_6_5 extends Lab1_6 {

   void showHeader() {
       System.out.println();
       System.out.println();
       System.out.println("--------------------------------------------------------");
       System.out.println("------------------    LAB ¹ 1_6_5  ---------------------");
       System.out.println("--------------------------------------------------------");
       System.out.println();
       System.out.println("Write a program, which transpose matrix (2d arrays, size 4x4) and outputs it to the console ");
       System.out.println();
   }
   void showLabResult() {

       int[][] matrix = {{1,1,1,1},
                         {2,2,2,2},
                         {3,3,3,3},
                         {4,4,4,4}};

       for (int[] row : matrix) {
           System.out.println(Arrays.toString(row));
       }

       for (int i = 0; i < matrix.length; i++) {
           int temp = 0;
           for (int j = 0; j < i; j++) {
               temp = matrix[i][j];
               matrix[i][j] = matrix[j][i];
               matrix[j][i] = temp;
           }
       }

       System.out.println("-------------------");

       for (int[] row : matrix) {
           System.out.println(Arrays.toString(row));
       }

   }
}

class Lab1_6_6 extends Lab1_6 {

   void showHeader() {
       System.out.println();
       System.out.println();
       System.out.println("--------------------------------------------------------");
       System.out.println("------------------    LAB ¹ 1_6_6  ---------------------");
       System.out.println("--------------------------------------------------------");
       System.out.println();
       System.out.println("Write a program that sorts an array of average  ");
       System.out.println("temperature values by months of 2015  as follows: at first the negative values, then - positive values");
       System.out.println();
   }
/**
   void showLabResult() {

       int[] temperature = new int[12];

       for (int i = 0; i < temperature.length; i++) {
           temperature[i] = (int) (Math.random() * 100);
           if (i % 3 == 0) {
               temperature[i] = - temperature[i];
           }
       }

       System.out.println("Initial -> " + Arrays.toString(temperature));

       int i = 0;
       int j = temperature.length - 1;

       while (i < j) {

           while (temperature[i] < 0 && i < j) i++;
           while (temperature[j] > 0 && j > i) j--;

           int temp = temperature[i];
           temperature[i] = temperature[j];
           temperature[j] = temp;

       }

       System.out.println(Arrays.toString(temperature));

   }
*/

    void showLabResult() {

        int[] arr = {-12, 1, 13, 32, -25, -1, 10, 23, 25, 5, 0};

        for (int i = arr.length-1 ; i > 0; i--) {
            for (int j = 0 ; j < i ; j++) {
                if (arr[j] > arr[j+1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }

        }
        System.out.println(Arrays.toString(arr));
    }
}

class Lab1_6_7 extends Lab1_6 {

   void showHeader() {
       System.out.println();
       System.out.println();
       System.out.println("--------------------------------------------------------");
       System.out.println("------------------    LAB ¹ 1_6_7  ---------------------");
       System.out.println("--------------------------------------------------------");
       System.out.println();
       System.out.println();
       System.out.println("Write a program, which finds in a given matrix the area of equal numbers. ");
       System.out.println("Here is one example with an area containing 7 elements with equal value of 1: ");
       System.out.println();
       System.out.println("--------------------");
       System.out.println("| 1 | 1 | 1 | 3 | 4 ");
       System.out.println("--------------------");
       System.out.println("| 2 | 1 | 3 | 1 | 2 ");
       System.out.println("--------------------");
       System.out.println("| 2 | 2 | 3 | 4 | 1 ");
       System.out.println("--------------------");
       System.out.println("| 3 | 3 | 3 | 1 | 4 ");
       System.out.println("--------------------");
       System.out.println();
       System.out.println();
       System.out.println("The program must print to console: ");
       System.out.println("Line 1: [0-2] ");
       System.out.println("Line 2: [1,3] ");
       System.out.println("Line 3: [4] ");
       System.out.println("Line 4: [3] ");
       System.out.println();
       System.out.println();

   }

   private void printMatrix(int[][] intArray, int row, int col) {
	   
	   System.out.print("Column    ");
	   
	   for (int a = 0; a < col; a++) {
    	   if (a < 10) {
        	   System.out.print("[0" + a + "] ");
    	   } else {
        	   System.out.print("[" + a + "] ");
    	   }
	   }
	   
	   System.out.println();
       
       for (int i = 0; i < row; i++) {

		   System.out.print("         ");
		   
    	   for (int a = 0; a < col; a++) {
			   System.out.print("-----");
		   }
    	   
		   System.out.print("-");
		   System.out.println();
    	   
    	   if (i < 10) {
        	   System.out.print("Line[0" + i + "] ");
    	   } else {
        	   System.out.print("Line[" + i + "] ");
    	   }
           
    	   for (int j = 0; j < col; j++) {
			   if (intArray[i][j] < 10) {
				   System.out.print("|  " + intArray[i][j] + " ");
			   } else {
				   System.out.print("| " + intArray[i][j] + " ");
			   }
    	   }
		   System.out.println("|");
       }

	   System.out.print("         ");
	   
	   for (int a = 0; a < col; a++) {
		   System.out.print("-----");
	   }
	   
	   System.out.print("-");
	   System.out.println();
   }
   
   void showLabResult() {

	   final int SIZE = 15, RANGE = 5;

	   int[][] intArray = new int[SIZE][SIZE];

	   int n;
	    
       System.out.println("Initialising int Array by Math.random method ... ");
       System.out.println();

       for (int i = 0; i < SIZE; i++) {
    	   
    	   if (i < 10) {
               System.out.print("intArray[0" + i + "]" + "[0-" + (SIZE-1) + "]" + " = { ");
    	   } else {
        	   System.out.print("intArray[" + i + "]" + "[0-" + (SIZE-1) + "]" + " = { ");
    	   }
           
    	   for (int j = 0; j < SIZE; j++) {
               System.out.print((intArray[i][j] = (int) (Math.random() * RANGE)) + " ");
    	   }
           System.out.println("}");
       }

       System.out.println();
       System.out.println();
       System.out.println("Printing as a matrix");
       System.out.println();
       System.out.println();
	   
       printMatrix(intArray, SIZE, SIZE);
       
       System.out.println();
       System.out.println();

       Scanner getSymbol = new Scanner(System.in);

       System.out.println();
       System.out.print("Please enter integer number from intArray -> ");

       n = getSymbol.nextInt();
       
       System.out.println();
       
       // find entering
       for (int i = 0; i < SIZE; i++) {

    	   String enteringRow = "";

    	   boolean isItFirstItem = false;
    	   boolean isItLastItem = false;
    	   
    	   boolean isPrevEqual = false;
    	   boolean isNextEqual = false;
    	   
    	   boolean isEntering = false;
    	   
    	   for (int j = 0; j < SIZE; j++) {
			   
			   if (j == 0) {
				   isItFirstItem = true;
			   } else {
				   isItFirstItem = false;
			   }
				   
			   if (j == (SIZE-1)) {
				   isItLastItem = true;
			   } else {
				   isItLastItem = false;
			   }
			   
    		   if (intArray[i][j] == n) {

    			   if (!isItFirstItem) {
    					 isPrevEqual =  (intArray[i][j - 1] == n)?true:false;
    				   } else {
    					 isPrevEqual = false;  
    				   }

   				   if (!isItLastItem) {
    					 isNextEqual =  (intArray[i][j + 1] == n)?true:false;
    				   } else {
   						 isNextEqual = false;  
    				   }

       			   if (isEntering && !isItFirstItem && !isPrevEqual) {
					   enteringRow += ",";
				   }
   				   
    			   if (isItFirstItem || !isPrevEqual || !isNextEqual) {
					   enteringRow += j;
    			   } 
   				   
    			   if (!isPrevEqual && isNextEqual) {
					   enteringRow += "-";
    			   }
    			
    			   isEntering = true;
    		   } 
    	   }   

    	   System.out.println("Line " + i + ": " + "[" + enteringRow + "]");
       }
   }
}

public class MainOfLab1_6 {

	static char getYesNo() {

 	   	String symbolYesNo;

 	   	Scanner getSymbol = new Scanner(System.in);

        do {
             System.out.print("Please enter 'Y' or 'N' -> ");

             symbolYesNo = getSymbol.next();
        	 symbolYesNo = symbolYesNo.toUpperCase();
         	   
         }  while((symbolYesNo.charAt(0) != 'Y') && (symbolYesNo.charAt(0) != 'N'));
        
        return symbolYesNo.charAt(0);
	};
	
    public static void main(String[] args) {

        ArrayList<Lab1_6> labs = new ArrayList<Lab1_6>(7);
        Scanner wait = new Scanner(System.in);

//        labs.add(new Lab1_6_1());
//        labs.add(new Lab1_6_2());
//        labs.add(new Lab1_6_3());
//        labs.add(new Lab1_6_4());
//        labs.add(new Lab1_6_5());
        labs.add(new Lab1_6_6());
//        labs.add(new Lab1_6_7());


        System.out.println("--------------------------------------------------------");
        System.out.println("          <<<<<    DEMO LAB MODULE 1.6    >>>>>    ");
        System.out.println("--------------------------------------------------------");
        System.out.println();
        System.out.println("Press ENTER to START");

        wait.nextLine();

        System.out.println();

        for (int i = 0; i < labs.size(); i++) {

           do {

        	   labs.get(i).showHeader();
        	   labs.get(i).showLabResult();
        	   
               System.out.println();
               System.out.println();
               System.out.println("Repeat this LAB again ?");
            
           } while (getYesNo() == 'Y');
            
           System.out.println();
           System.out.println();

        }

        System.out.println("--------------------------------------------------------");
        System.out.println("          <<<<<   ALL LABS HAVE DONE    >>>>>    ");
        System.out.println("--------------------------------------------------------");

    }
}
