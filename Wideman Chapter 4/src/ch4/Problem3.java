package ch4;

public class Problem3 {

	public static void main(String[] args) {
		//program that converts kilograms to pounds
		int x = 1;
		System.out.println("Kilograms        Pounds");
		while (x<201) {
			System.out.printf("%3d \t \t %5.1f", x, (2.2 * x));
			x = (x + 2);
			System.out.println();
		}
		
		

	}

}
