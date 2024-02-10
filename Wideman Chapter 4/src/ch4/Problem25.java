package ch4;

public class Problem25 {

		public static void main(String[] args) {
			//program that displays pi for the value i = 10000, 20000 - 100000
			int i = 1;
			double pi = 0;
			while (i < 100000) {
				pi += 4 * (Math.pow(-1, (i+1))/(2*i-1));
				i = i + 1;
				if (i % 10000 == 0) {
					System.out.println(pi);
				}
			}
		}
}
