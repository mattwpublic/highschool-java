package ch4;

public class Problem10 {

	public static void main(String[] args) {
		//displays all the numbers from 100 to 1000, ten per line, that are divisible by 5 and 6. numbers are separated by exactly one space.
		int y = 0;
		int x = 100;
		while (x<1000) {
			if (y == 10) {
				System.out.println();
				y = 0;
			}
			else if ((x % 5) == 0 || (x % 6) == 0) {
				System.out.printf("%4d", x);
				y = y +1;
			}
			x = x+1;
		}

	}

}
