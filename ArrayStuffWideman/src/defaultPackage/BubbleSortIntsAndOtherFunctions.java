package defaultPackage;

public class BubbleSortIntsAndOtherFunctions {

	public static void main(String[] args) {
		int[] nums = {5,1,23,41,2,59,13,52,19,6};
		bubbleSort(nums);
	}
		
	public static void bubbleSort(int[] x) {
		int y = 0;
		int z;
		int temp;
		boolean done = false;
		while(!done && y<x.length-1) {
			done = true;
				for(z=1;z<x.length-y;z++) {
					if(x[z]<x[z-1]) {
						temp = x[z];
						x[z] = x[z-1];
						x[z-1] = temp;
						done = false;
					}
				}
			}
		displayArray(x);
		}
	public static void bubbleSort(double[] x) {
		int y = 0;
		int z;
		double temp;
		boolean done = false;
		while(!done && y<x.length-1) {
			done = true;
				for(z=1;z<x.length-y;z++) {
					if(x[z]<x[z-1]) {
						temp = x[z];
						x[z] = x[z-1];
						x[z-1] = temp;
						done = false;
					}
				}
			}
		displayArray(x);
		}
	public static void bubbleSort(String[] x) {
		int y = 0;
		int z;
		String temp;
		boolean done = false;
		while(!done && y<x.length-1) {
			done = true;
				for(z=1;z<x.length-y;z++) {
					if(x[z].compareTo(x[z-1])<0) {
						temp = x[z];
						x[z] = x[z-1];
						x[z-1] = temp;
						done = false;
					}
				}
			}
		displayArray(x);
		}

		
		public static void displayArray(int[] x) {
			int i;
			for(i=0;i<x.length;i++) {
				System.out.println(x[i]);
			}
		}
		public static void displayArray(double[] x) {
			int i;
			for(i=0;i<x.length;i++) {
				System.out.println(x[i]);
			}
		}
		public static void displayArray(String[] x) {
			int i;
			for(i=0;i<x.length;i++) {
				System.out.println(x[i]);
			}
		}
}




