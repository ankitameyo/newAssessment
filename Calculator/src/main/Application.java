package main;

import java.util.Scanner;

import abstractClass.Calculator;
import implementation.Subtract;
import implementation.Sum;

public class Application {	
	/**
	 * main() method
	 */
	public static void main(String args[]){
		startCalculator();
	}

	public  static void startCalculator() {
		Calculator sum=new Sum();
		Calculator subtr=new Subtract();
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("Welcome to the calculator. Press 1 for addition, and 2 for Subtraction and press any other number to exit::");
			try {
				int input =sc.nextInt();
				if(input==1) {
					sum.getUserInput();
				}
				else if(input==2) {
					subtr.getUserInput();
				}
				else {
					break;
				}
			}
			catch(Exception e) {
				String badinput=sc.next();
                 System.out.println("Please enter a valid number "+badinput);
                 continue;
			}
		}

	}
}
