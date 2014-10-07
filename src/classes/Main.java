package classes;

import java.util.Scanner;



public class Main {

	public static double getResult(double x) {
		if (x == 0) {
			throw new MyException("Неможливо поділити на нуль");
		} 
			return (double) Math.cos(x)/x;			
	}
	
	public static void myFunction() {
		System.out.print("Hello");
	}
	public static void main(String[] args) throws MyException {
		Scanner input = new Scanner(System.in);
		System.out.print("X = ");
		double x = input.nextDouble();
		try {
			System.out.println("Result = "+getResult(x));
		} catch(MyException ex) {
			ex.printStackTrace();
		}
	}

}
