import java.util.Scanner;

public class Problem_9 {

	public static void main(String[] args) {
		//user enters the first 9 digits of an isbn-10 number, and then prints out the correct isbn number.
		System.out.println("Please enter the first 9 digits as an integer:");
		
		Scanner input = new Scanner(System.in);
		
		int isbn = input.nextInt();
		
		int d9 = (isbn % 10);
		isbn = isbn / 10;
		int d8 = (isbn % 10);
		isbn = isbn / 10;
		int d7 = (isbn % 10);
		isbn = isbn / 10;
		int d6 = (isbn % 10);
		isbn = isbn / 10;
		int d5 = (isbn % 10);
		isbn = isbn / 10;
		int d4 = (isbn % 10);
		isbn = isbn / 10;
		int d3 = (isbn % 10);
		isbn = isbn / 10;
		int d2 = (isbn % 10);
		isbn = isbn / 10;
		int d1 = (isbn);
		int d10 =((d1 + (d2 * 2) + (d3 * 3) + (d4 * 4) + (d5 * 5) + (d6 * 6) + (d7 * 7) + (d8 * 8) + (d9 * 9)) % 11); 
		
		if (d10 == 10) {
			System.out.println("Your isbn number is:" + d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + "X");
		}
		else {
			System.out.print("Your isbn number is: " + d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + d10);
		}
	}

}
