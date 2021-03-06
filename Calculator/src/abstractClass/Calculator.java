package abstractClass;

import java.util.Scanner;


/**
 * Abstraction is used here
 */
public abstract class Calculator {
		
	int number1;
	int number2;
	int number3;
	
	public void getUserInput() {		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number ::");
		number1=sc.nextInt();
		System.out.println("Enter second number ::");
		number2=sc.nextInt();
		System.out.println("Enter third number or X to exit and continue with two numbers");
		String inp=sc.next();
		if(!inp.equalsIgnoreCase("x")) {
			number3=Integer.valueOf(inp);
		}
		if(number3!=0) {
			this.calculate(number1,number2,number3);
		}
		else {
			this.calculate(number1, number2);
		}
		number1=number2=number3=0;
	}
	

	/**
	 * Method overloading is used here(Polymorphism)
	 */
	public abstract void calculate(int number1,int number2);
	
	public abstract void calculate(int number1,int number2,int number3);

}
