package whatever;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Problem6 {

	public static void main(String[] args) {
		//Adds the digits of a number between 0 and 999 and outputs an answer.
		
		String num =
				JOptionPane.showInputDialog(null,
						"enter a number from 0 to 999",
						"input dialog test",
						JOptionPane.QUESTION_MESSAGE);
		
		int intvalue = Integer.parseInt(num);
		
		System.out.println(intvalue);
		
		int x = intvalue % 10;
		
		intvalue = intvalue / 10;
		
		int y = intvalue % 10;
		
		intvalue = intvalue /10;
		
		int z = intvalue % 10;
		
		intvalue = Integer.parseInt(num);
		
		System.out.print("The sum of the integers in " + intvalue + " is " + ((x + y +z)) + ".");
		
		JOptionPane.showMessageDialog(null,
				"The sum of the integers in " + intvalue + " is " + ((x + y +z)) + ".",
				"Your answer",
				JOptionPane.INFORMATION_MESSAGE);
		
		
	}

}
