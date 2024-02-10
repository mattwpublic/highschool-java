package ch4;

public class Problem12 {

	public static void main(String[] args) {
		//find the smallest number such that n^2 > 12,000 use a while loop to find the integer such that n^2 is greater than 12,000
		int n = 1;
		while (n * n <= 12000) {
			n = n +1;
		}
		System.out.print(n);
	}

}
