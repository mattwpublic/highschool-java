package defaultPackage;

public class Practice1 {
	
	public static void  main(String[] args) {
		int[] age = new int[4];
		age[0] = 2;
		age[1] = 16;
		age[2] = 14;
		age[3] = 19;
		int[] age2 = {2,16,14,19};
		
		displayArray(age2);
		int s = sumArray(age);
		System.out.println("Sum is " + s + ".");
		int index1 = indexOf(age2, 14);
		if(index1 != -1) System.out.print("Your number is at index:" + index1);
		else System.out.print("Your number was not found.");
	}
	public static int sumArray(int[] x) {
		int i;
		int s = 0;
		for(i=0;i<x.length;i++) {
			s += x[i];
		}
		return s;
	}
	public static int indexOf(int[] x, int targetNumber) {
		int i;
		for(i=0;i<x.length;i++) {
			if(x[i] == targetNumber) return i;
		}
		return -1;
	}
	
	public static void displayArray(int[] x) {
		int i;
		for(i=0;i<x.length;i++) {
			System.out.println(x[i]);
		}
	}

}
