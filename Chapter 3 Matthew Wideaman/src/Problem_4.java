import java.util.Scanner;

public class Problem_4 {

	public static void main(String[] args) {
		//Program that generates two integers under 100 and prompts the use to enter the sum of the two integers. The program reports true if the answer is true and false if the answer is false
		
		for(;;) {
			
		System.out.println("Please enter the sum of these two numbers:");
		
		double num1 = Math.random() * 100;
		
		double num2 = Math.random() * 100;
		
		int num3 = (int)(num1);
		
		int num4 = (int)(num2);
		
		System.out.println(num3 + " and " + num4);
		
		for(;;) {

			Scanner input = new Scanner(System.in);
			
			int inputnum = input.nextInt();
			
			if (inputnum == (num3 + num4)) {
				System.out.println("Correct!");
				break;
			}
			
			else if (inputnum != (num3 + num4)) {
				System.out.println("Hmm, something's not quite right. Try again!");
			}
		}
	}
}
}