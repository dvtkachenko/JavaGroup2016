package com.brainacad.module1_05.lab;

import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Integer;

/**
 * Created by Dmitriy on 23.11.2016.
 */

abstract class Lab1_5 {
    void showHeader() {}
    void showLabResult() {}
};

class Lab1_5_1 extends Lab1_5 {

   void showHeader() {
       System.out.println();
       System.out.println();
       System.out.println("--------------------------------------------------------");
       System.out.println("------------------    LAB ¹ 1_5_1  ---------------------");
       System.out.println("--------------------------------------------------------");
       System.out.println();
       System.out.println("Write a program to produce on console the following : ");
       System.out.println("1  ");
       System.out.println("2 1  ");
       System.out.println("3 2 1  ");
       System.out.println("4 3 2 1  ");
       System.out.println("5 4 3 2 1  ");
       System.out.println("6 5 4 3 2 1  ");
       System.out.println("7 6 5 4 3 2 1  ");
       System.out.println("8 7 6 5 4 3 2 1   ");
       System.out.println();
       System.out.println();
   }
   void showLabResult() {
	   
       System.out.println("Doing by nested loops");
       System.out.println();
	   
	   for(int row = 1;row < 9;row++) {
		   
	       System.out.print(row);
		   
		   for(int col = row-1;col > 0;col--) {

			   System.out.print(" " + col);
			   
		   }
	       System.out.print("\n");
	   }
   };
}

class Lab1_5_2 extends Lab1_5 {

   void showHeader() {

       System.out.println();
       System.out.println();
       System.out.println("--------------------------------------------------------");
       System.out.println("------------------    LAB ¹ 1_5_2  ---------------------");
       System.out.println("--------------------------------------------------------");
       System.out.println();
       System.out.println("1.Write a program which prompts user for the number 'x', reads it from the keyboard, and saves it in an int variable called 'x'.");  
       System.out.println("2.Then prints 'One', 'Two',... , 'Nine' if the variable 'x' is 1, 2,... , 9 and 'Other' if x >9, respectively.  ");
       System.out.println("3.Use:  (a) a 'nested-if' statement;   ");
       System.out.println("        (b) a 'switch-case' statement. ");
       System.out.println("4.The output shall look like (user input – in green):"); 
       System.out.println("  -Enter number x: 1-Enter number x: 12 ");
       System.out.println("  -One- Other ");
       System.out.println();
       System.out.println();
 
   }

   
   void doAsNestedIf(int x) {
	   
	   String xAsString = "";

       System.out.println();
       System.out.println("Doing by nested-if");
	   
	   if ((x > 9) || (x < 1) ) {
		   xAsString = "Other";
	   } else if (x == 1) {
		   xAsString = "One";
	   } else if (x == 2) {
		   xAsString = "Two";
	   } else if (x == 3) {
		   xAsString = "Three";
	   } else if (x == 4) {
		   xAsString = "Four";
	   } else if (x == 5) {
		   xAsString = "Five";
	   } else if (x == 6) {
		   xAsString = "Six";
	   } else if (x == 7) {
		   xAsString = "Seven";
	   } else if (x == 8) {
		   xAsString = "Eight";
	   } else if (x == 9) {
		   xAsString = "Nine";
	   }

       System.out.println("x = " + x + " -> " + xAsString);
	   
   }
   
   void doAsSwitchCase(int x) {

	   String xAsString = "";

       System.out.println();
       System.out.println("Doing by switch-case");
	   
       switch (x) {
       		case 1 : xAsString = "One"; break;
       		case 2 : xAsString = "Two"; break;
       		case 3 : xAsString = "Three"; break;
       		case 4 : xAsString = "Four"; break;
       		case 5 : xAsString = "Five"; break;
       		case 6 : xAsString = "Six"; break;
       		case 7 : xAsString = "Seven"; break;
       		case 8 : xAsString = "Eight"; break;
       		case 9 : xAsString = "Nine"; break;
       		
       		default : xAsString = "Other"; break;
       }
       
       System.out.println("x = " + x + " -> " + xAsString);
	   
   }
   
   void showLabResult() {

	   int x;
	   
       Scanner getSymbol = new Scanner(System.in);

       System.out.print("");
       System.out.print("Enter number x: from 1 to 12 -> ");

       x = getSymbol.nextInt();

  	   doAsNestedIf(x);
    	   
   	   doAsSwitchCase(x);
	   
   };
}

class Lab1_5_3 extends Lab1_5 {

   void showHeader() {
       System.out.println();
       System.out.println();
       System.out.println("--------------------------------------------------------");
       System.out.println("------------------    LAB ¹ 1_5_3  ---------------------");
       System.out.println("--------------------------------------------------------");
       System.out.println();
       System.out.println("Write a program to produce the multiplication table of 1 to 9 as shown  ");
       System.out.println("using two nested for-loops: ");
       System.out.println(" * |  1  2  3  4  5  6  7  8  9 ");
       System.out.println("-------------------------------------- ");
       System.out.println(" 1 |  1  2  3  4  5  6  7  8  9 ");
       System.out.println(" 2 |  2  4  6  8 10 12 14 16 18 ");
       System.out.println(" 3 |  3  6  9 12 15 18 21 24 27 ");
       System.out.println(" 4 |  4  8 12 16 20 24 28 32 36 ");
       System.out.println(" 5 |  5 10 15 20 25 30 35 40 45 ");
       System.out.println(" 6 |  6 12 18 24 30 36 42 48 54 ");
       System.out.println(" 7 |  7 14 21 28 35 42 49 56 63 ");
       System.out.println(" 8 |  8 16 24 32 40 48 56 64 72 ");
       System.out.println(" 9 |  9 18 27 36 45 54 63 72 81 ");
       System.out.println();
       System.out.println();
   }
   void showLabResult() {

       System.out.println("Doing by using two nested for-loops: ");
       System.out.println();
       
	   System.out.println(" * |  1  2  3  4  5  6  7  8  9 ");
       System.out.println("-------------------------------------- ");
       
       for (int row = 1; row < 10; row++) {

    	   System.out.print(" " + row + " |");
    	   
           for (int col = 1; col < 10; col++) {

        	   int result = row*col;

        	   if (result < 10) {
            	   System.out.print("  " + result);
        	   } else {
            	   System.out.print(" " + result);
        	   }
        	   
           }

           System.out.println();
       }

   };
}

class Lab1_5_4 extends Lab1_5 {

   void showHeader() {
       System.out.println();
       System.out.println();
       System.out.println("--------------------------------------------------------");
       System.out.println("------------------    LAB ¹ 1_5_4  ---------------------");
       System.out.println("--------------------------------------------------------");
       System.out.println();
       System.out.println("The program must print the first 10 numbers that is divisible evenly by 3 or 4, ");
       System.out.println("but for loop iterates from 1 to 300 (so break statement must be used after 10 printed result). ");
       System.out.println("The output shall look: ");
       System.out.println("3 ");
       System.out.println("4 ");
       System.out.println("… ");
       System.out.println("20 ");
       System.out.println();
       System.out.println();
   }
   void showLabResult() {
	   
	   int countOfNumbers = 0;
	   
       System.out.println("Doing by using if-else statement and nested loop.");
       System.out.println();

       for (int number = 1; number < 301 ; number++) {
    	   
    	   if (countOfNumbers > 9) {
    		   break;
    	   } else if ((number%3 == 0) || (number%4 == 0)) {
    		    System.out.println(number);
   	       		countOfNumbers++;
    	   }
       }

   };
}

class Lab1_5_5 extends Lab1_5 {

   void showHeader() {
       System.out.println();
       System.out.println();
       System.out.println("--------------------------------------------------------");
       System.out.println("------------------    LAB ¹ 1_5_5  ---------------------");
       System.out.println("--------------------------------------------------------");
       System.out.println();
       System.out.println("Write a program to produce the sum of 1, 2, 3, ..., to an upper bound - n.  ");
       System.out.println("Also compute and display the average.  ");
       System.out.println("The output shall look like: ");
       System.out.println("The Sum is: 100 ");
       System.out.println("The Avg is: 10 ");
       System.out.println();
       System.out.println();
       System.out.println("Doing by using loop and arithmetic operators");
       System.out.println();
   }
   void showLabResult() {

	   int n;
	   Scanner getSymbol = new Scanner(System.in);

       System.out.println();
       System.out.print("Enter upper bound N : ");

       n = getSymbol.nextInt();
           
       // ??? It is interesting to know how memory for variable sum is allocated ???
       // Is it happening every iteration or it happens one time ? 
       int sum = 0;

       for (int number = 1; number <= n; number++) {
         sum = sum + number;
       }
           
       System.out.println("The Sum is : " + sum);
       System.out.println("The Avg is : " + (float)sum/n);
           
   };
}

class Lab1_5_6 extends Lab1_5 {

   void showHeader() {
       System.out.println();
       System.out.println();
       System.out.println("--------------------------------------------------------");
       System.out.println("------------------    LAB ¹ 1_5_6  ---------------------");
       System.out.println("--------------------------------------------------------");
       System.out.println();
       System.out.println("Write a program that calculates and displays the sum of squares of digits of number");
       System.out.println("Student should enter the number using the Scanner ");
       System.out.println("Student should use loop and arithmetic operators.");
       System.out.println();
       System.out.println();
   }
   void showLabResult() {

	   boolean cond = true;
	   int number, remain, mod, sum = 0;
	   
	   Scanner getSymbol = new Scanner(System.in);

       System.out.print("Enter Number : ");

       number = getSymbol.nextInt();

       while (cond) {
    	   
    	   remain = number/10;
    	   mod = number%10;
    	   
    	   if ((remain == 0) && (mod == 0)) {
    		   cond = false;
    	   } else {
        	   sum = sum + mod*mod;
        	   number = remain;
    	   }
    	   
       }
       
       System.out.println("The Sum of squares of digits of number is : " + sum);

   };
}

class Lab1_5_7 extends Lab1_5 {

   void showHeader() {
       System.out.println();
       System.out.println();
       System.out.println("--------------------------------------------------------");
       System.out.println("------------------    LAB ¹ 1_5_7  ---------------------");
       System.out.println("--------------------------------------------------------");
       System.out.println();
       System.out.println("Write a program that find and displays all perfect numbers from 1 to n ");
       System.out.println("(perfect number is a positive integer that is equal to the ");
       System.out.println("sum of its proper positive divisors, excluding the number itself). ");
       System.out.println();
       System.out.println();
   }
   void showLabResult() {

       int n;
       Scanner getSymbol = new Scanner(System.in);

       System.out.println();
       System.out.print("Enter N : ");

       n = getSymbol.nextInt();

       for (int number = 1; number <= n ; number++) {

           int sum = 0, mod = 0;

           for (int div = 1 ; div < number; div++ ) {
               if ((number%div) == 0) {
                   sum = sum + div;
               }
           }
           if (sum == number) {
               System.out.println("Perfect Number is " + sum);
           }
       }


   };
}

public class MainOfLab1_5 {

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

        ArrayList<Lab1_5> labs = new ArrayList<Lab1_5>(7);
        Scanner wait = new Scanner(System.in);

        labs.add(new Lab1_5_1());
        labs.add(new Lab1_5_2());
        labs.add(new Lab1_5_3());
        labs.add(new Lab1_5_4());
        labs.add(new Lab1_5_5());
        labs.add(new Lab1_5_6());
        labs.add(new Lab1_5_7());


        System.out.println("--------------------------------------------------------");
        System.out.println("          <<<<<    DEMO LAB MODULE 1.5    >>>>>    ");
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
