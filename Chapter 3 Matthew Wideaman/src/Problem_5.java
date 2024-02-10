import java.util.Scanner;

public class Problem_5 {

	private static final String s = "Sunday";
	private static final String m = "Monday";
	private static final String t = "Tuesday";
	private static final String w = "Wednesday";
	private static final String t2 = "Thursday";
	private static final String f = "Friday";
	private static final String s2 = "Saturday";

	public static void main(String[] args) {
		//Prompts a user to enter a number from 0-6 and then be able to tell the day from the number of days passed from the current day
	
	
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("Please enter an integer from 0 to 6 for the day of the week:");
	
	int inputday = input.nextInt();
	
	String today;
	
	switch (inputday) {
	
	case 0: today = s;
	break;
	case 1: today = m;
	break;
	case 2: today = t;
	break;
	case 3: today = w;
	break;
	case 4: today = t2;
	break;
	case 5: today = f;
	break;
	case 6: today = s2;
	break;
	default: today = s;
	}
	
	System.out.println("Please enter the number of days you want to add:");
	
	int dayspassed = input.nextInt();
	
	int futuredayint = (inputday + dayspassed)%7;
	
	String futureday = s;
	
	switch (futuredayint) {
	
	case 0: futureday = s;
	break;
	case 1: futureday = m;
	break;
	case 2: futureday = t;
	break;
	case 3: futureday = w;
	break;
	case 4: futureday = t2;
	break;
	case 5: futureday = f;
	break;
	case 6: futureday = s2;
	break;
	}
	
	System.out.println("Today is " + today + " and the future day is " + futureday + ".");
	
	

	}

}
