package whatever;

import java.util.Scanner;

public class Problem15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter three points for a triangle like this: x1 y1 x2 y2 x3 y3:");
		
		double x1 = input.nextDouble();
		
		double y1 = input.nextDouble();
		
		double x2 = input.nextDouble();
		
		double y2 = input.nextDouble();
		
		double x3 = input.nextDouble();
		
		double y3 = input.nextDouble();
		
		double s1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		
		double s2 = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
		
		double s3 = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));
		
		double s = (s1 + s2 + s3)/2;
		
		double area = Math.sqrt(s * (s - s1) * (s - s2) * (s - s3));
		
		System.out.println("The area of your triangle is " + area);
		

	}

}
