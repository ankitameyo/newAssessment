package main;

import java.io.IOException;
import java.util.Scanner;

import solution.Solutions;
import solution.SolutionsImpl;

public class Application {
	
	/**
	 * Interactive program for the java assessment
	 */
	public static void main(String args[]) throws SecurityException, IOException {
		Scanner sc=new Scanner(System.in);
		Solutions sol=new SolutionsImpl();
		int loop=1;
		//Interactive program to execute the answer for the given questions
		while(loop==1) {
			System.out.println("Enter the question number you want to execute, press 0 to exit.: \n 1# Printing Pyramid of numbers. \n 2# Print all the characters present in the given string only once in a reverse order:");
			System.out.println(" 3# Instantiate an int array of size 100. Populate it with random values. \n 4# Write a java program to display a  Fibonacci sequence (iterative approach).\n 5# Write a java program to display a  Fibonacci sequence (recursive approach).\n 6# Print the table of a given number.");
            int a=sc.nextInt();
            if(a==0) break;
            sol.executeQuestion(a);
            System.out.println("");
		}		
		sc.close();
	}
	
	

}
