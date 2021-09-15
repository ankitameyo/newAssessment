package implementation;

import abstractClass.Calculator;


/**
 * Inheritance is used here
 */
public class Sum extends Calculator{

	@Override
	public void calculate(int number1, int number2) {
		String a=number1+ " + "+ number2+" =";
		System.out.print(a);
		System.out.println(number1+number2);
	}

	@Override
	public void calculate(int number1, int number2, int number3) {
		String a=number1+ " + "+ number2+" + "+number3+" =";
		System.out.print(a);
		System.out.println(number1+number2+number3);		
	}

}
