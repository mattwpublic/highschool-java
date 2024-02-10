import java.util.Scanner;

public class Problem_12 {

	public static void main(String[] args) {
		//prompts the user to enter an integer and then checks whether or not the number is divisible by both 5 and 6, neither, or just one.
		
		System.out.println("Please enter an integer:");
		
		Scanner input = new Scanner(System.in);
		
		int x = input.nextInt();
		
		if ((x/5 == Math.floor(x)/5) && (x/6 == Math.floor(x)/6)) {
			System.out.println("Your number is divisible by both 5 and 6.");
		}
		else if (x/5 == Math.floor(x)/5) {
			System.out.println("Your number is divisible by 5, but not 6.");
		}
		else if (x/6 ==Math.floor(x)/6) {
			System.out.println("Your number is divisble by 6 but not 5.");
		}
		else {
			System.out.println("Your number is not divisble by 5 or 6.");
		}

	}

}
