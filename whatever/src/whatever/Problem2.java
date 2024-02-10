package whatever;

import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the radius and length of a cylinder:");
		
		double rad = input.nextDouble();
		
		double leng = input.nextDouble();
		
		double area = rad * rad * Math.PI;
				
		double volume = area * leng;
		
		System.out.print("The area is " + area + " and the volume is " + volume);
		
		
		
		
	
	
	}}


