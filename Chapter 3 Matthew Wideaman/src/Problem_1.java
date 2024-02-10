import java.util.Scanner;

public class Problem_1 {

	public static void main(String[] args) {
		//Solve a quadratic equation with input from a user.
		
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Please enter an a, b, and c value.");
			
			double a = input.nextDouble();
			
			double b = input.nextDouble();
			
			double c = input.nextDouble();
			
			double ans1 = (-b + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
			
			double ans2 = (-b - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
			
			if (Math.pow(b, 2) - (4 * a * c) == 0) {
				
				System.out.println("Your answer is " + ans1);	
			}
			
			else if (Math.pow(b, 2) - (4 * a * c) > 0) {
				
				System.out.println("Your answers are " + ans1 + " and " + ans2);
			}
			
			else {
				
				System.out.println("The equation has no real roots.");
			}
		} 

	}

}
