import java.util.Scanner;

public class Problem_17 {

	public static void main(String[] args) {
		//lets you play rock paper scissors with the computer.
		System.out.println("Please choose a choice for rock paper scissors: Rock = 0, Paper = 1, Scissors = 2");
		
		Scanner input = new Scanner(System.in);
		
		int userval = input.nextInt();
		
		int cpuval = (int)(Math.random() * 3);
		
		if (userval == 0 && cpuval == 0) {
			System.out.println("You both picked Rock!");
		}
		else if (userval == 1 && cpuval == 1) {
			System.out.println("You both picked Paper!");
		}
		else if (userval == 2 && cpuval == 2) {
			System.out.println("You both picked Scissors!");
		}
		else if (userval == 0 && cpuval == 1) {
			System.out.println("You picked Rock and the Computer chose paper, so you lost!");
		}
		else if (userval == 1 && cpuval == 0) {
			System.out.println("You picked Paper and the Computer chose Rock, so you won!");
		}
		else if (userval == 1 && cpuval == 2) {
			System.out.println("You chose Paper and the Computer chose Scissors, so you lost!");
		}
		else if (userval == 2 && cpuval == 0) {
			System.out.println("You chose Scissors and the Computer chose Rock, so you lost!");
		}
		else if (userval == 2 && cpuval == 1) {
			System.out.println("You chose Scissors and the Computer chose Paper, so you won!");
		}
		else if (userval == 0 && cpuval == 2) {
			System.out.println("You chose Rock and the Computer chose Scissors, so you won!");
		}
		else {
			System.out.println("You must've messed something up.");
		}
	}
}
