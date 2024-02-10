package ch4;

public class Problem5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Kilograms       Pounds  | Pounds              Kilograms");
		int x = 1;
		int x2 = 20;
		while (x < 200) {
			System.out.printf("%3d \t\t %5.1f  |  %4d \t\t %3.2f", x, (x * 2.2), x2, (x2*.453));
			x = x + 2;
			x2 = x2 + 5;
			System.out.println();
			
		}
	}

}
