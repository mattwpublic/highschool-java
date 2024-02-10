package whatever;

import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a degree in celsius:");
		
		double x = input.nextDouble();
		
		double y = (9.0/5) * x + 32;
		 
		System.out.print( x + " Celsius is " + y + " degrees fahrenheit.");

	}

}
