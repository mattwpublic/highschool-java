package ch4;

import java.util.Scanner;

public class Problem16 {

	public static void main(String[] args) {
		try (//program that reads an integer and displays all its factors in descending order.
		Scanner input = new Scanner(System.in)) {
			System.out.print("Please enter a number:");
			int inputnum = input.nextInt();
			int div = 2;
			System.out.println();
			System.out.print(inputnum + " factors into: ");
			
			if (inputnum % div != 0) {
				System.out.print("Prime number!!!!!");
				System.exit(inputnum);
			}
			while (inputnum > 0) {
				while (inputnum % div == 0) {
					if (inputnum == div) {
						System.out.print("and " + div + ".");
						System.exit(inputnum);
						break;
					}
					else 
					System.out.print(div + ", ");
					inputnum = inputnum / div;
				}
				div = div + 1;
			}
		}
	}
}
	
