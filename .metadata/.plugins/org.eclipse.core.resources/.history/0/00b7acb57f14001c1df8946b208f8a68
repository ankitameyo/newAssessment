package solution;

import java.io.IOException;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/**
 * SolutionsImpl class contains methods for all the answers of assignmen't questions
 */
public class SolutionsImpl implements Solutions {

	Logger logger1 = Logger.getLogger(SolutionsImpl.class.getName());


	/**
	 * This will execute the method selected by user
	 */
	public void executeQuestion(int x) throws  IOException {
		Scanner sc=new Scanner(System.in);
		if(x==1) {
			this.answer1(6);
		}
		else if(x==2) {
			System.out.println("Enter string to be manipulated:");
			String input=sc.nextLine();
			this.answer2(input);
		}
		else if(x==3) {
			this.answer3();
		}
		else if(x==4) {
			this.answer4a();
		}
		else if(x==5) {
			this.answer4b();
		}
		else if(x==6) {
			System.out.println("Enter the number you want table of ::");
			int number=sc.nextInt();
			this.tablePrint(number);
		}
	}


	/**
	 * Prints the pyramid of numbers
	 */
	public void answer1(int arg) {
		int a=0;
		int b=0;
		System.out.println("Printing number pyramid ::");
		for(int x=arg;x>0;x--){

			for(int j=x-1;j>0;j--) {
				System.out.print(" ");
			}
			int k=b;
			while(Math.abs(k)<=a) {
				System.out.print(Math.abs(k));
				k-=1;
			}
			a=a+1;
			b=b+1;
			System.out.println("");
		}
	}


	/**
	 * Print all the characters present in the given string only once in a reverse order:
	 */
	public void answer2(String arg){
		HashMap<Character,Integer> map =new HashMap<>();
		System.out.print("Manipulating string::"); System.out.println(arg);
		for(int x=arg.length()-1;x>=0;x--) {
			if(!map.containsKey(arg.charAt(x))) {
				System.out.print(arg.charAt(x));
				map.put(arg.charAt(x),1);
			}
		}
	}

	/**
	 * 	Function to instantiate an array of size 100 and populating it with random values (upper range is set at 1000 for the values)
	 */
	public void answer3(){
		try {
			//Creating filehandler here as to create a separate log file for this method
			System.out.println("Logs will be available in randomArray.log file");
			FileHandler fileHandler = new FileHandler("randomArray.log", false);  
			SimpleFormatter sf = new SimpleFormatter();
			fileHandler.setFormatter(sf);
			logger1.addHandler(fileHandler);
			logger1.setUseParentHandlers(false);
			Random rd=new Random();
			int[] arr=new int[100];
			logger1.info("Printing random integer array using i=0 style of loop");
			for(int i=0;i<arr.length;i++) {
				arr[i]=rd.nextInt(1000);
				logger1.info(String.valueOf(arr[i]));
			}
			logger1.info("Printing random integer array using for each style of loop");
			for(int x:arr) {
				logger1.info(String.valueOf(x));
			}
			fileHandler.close();}
		catch(Exception e) {
			logger1.info("Exception occured for random number generator function");
		}

	}

	/**
	 * 	Function to generate Fibonacci sequence using iterative approach 
	 */
	public void answer4a(){
		try {
			//Creating filehandler here as to create a separate log file for this method
			System.out.println("Logs will be available in fibonacci.log file");
			FileHandler fileHandler = new FileHandler("fibonacci.log", false);  
			SimpleFormatter sf = new SimpleFormatter();
			fileHandler.setFormatter(sf);
			logger1.addHandler(fileHandler);
			logger1.setUseParentHandlers(false);
			long[] arr=new long[50];
			arr[0]=1;arr[1]=1;
			logger1.info("Storing fibonacci sequence in an array");
			for(int i=2;i<50;i++) {
				arr[i]=arr[i-1]+arr[i-2];
			}
			logger1.info("Printing fibonacci sequence with iterative approach :");
			for(long x:arr) {
				logger1.info(String.valueOf(x));
			}		
			fileHandler.close();
		}
		catch(Exception e) {
			logger1.info("Exception occured in fibonacci sequence generator");
		}

	}

	/**
	 * 	Function to generate Fibonacci sequence using recursive approach 
	 */
	public void answer4b(){
		try {
			//Creating filehandler here as to create a separate log file for this method
			System.out.println("Logs will be available in fibonacci.log file");
			FileHandler fileHandler = new FileHandler("fibonacci.log", false);  
			SimpleFormatter sf = new SimpleFormatter();
			fileHandler.setFormatter(sf);
			logger1.addHandler(fileHandler);
			logger1.setUseParentHandlers(false);
			logger1.info("Printing fibonacci sequence with recursive approach :");
			for(int x=0;x<=50;x++) {
				logger1.info(String.valueOf(fibbRecursive(x)));
			}
			fileHandler.close();
		}
		catch(Exception e) {
			logger1.info("Exception occured in fibonacci sequence generator");
		}

	}

	/**
	 * 	Recursive function to generate fibonacci sequence 
	 */
	public long fibbRecursive(long x) {
		if(x<=1) {
			return x;
		}		
		return fibbRecursive(x-1)+fibbRecursive(x-2);
	}

	/**
	 * 	Function to print table of a given number
	 */
	public void tablePrint(int n){
		try {
			//Creating filehandler here as to create a separate log file for this method
			System.out.println("Logs will be available in table.log file");
			FileHandler fileHandler = new FileHandler("table.log", false);
			SimpleFormatter sf = new SimpleFormatter();
			fileHandler.setFormatter(sf);
			logger1.addHandler(fileHandler);
			logger1.setUseParentHandlers(false);
		    logger1.log(Level.INFO,"Printing table for {0}",n);
			for(int i=1;i<=10;i++) {
				int mult=n*i;
				logger1.log(Level.INFO," {0} x {1} = {2}",new Object[] {n,i,mult});
			}
			fileHandler.close();
		} catch (Exception e) {
			logger1.info("Exception occured for tablePrint function");
		}  

	}



}
