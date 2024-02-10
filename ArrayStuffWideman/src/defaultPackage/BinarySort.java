package defaultPackage;

import java.util.Scanner;

public class BinarySort {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a number to search the array for:");
		int[] nums = {1,6,8,10,12,14,17,19,20,23,24,27,29,31,35,37,39,41,44,46,47,49,51,54,56,57,58,60,61,64,68,69,70,74,78,79,84,245,548,567,579,623,645,657,667,728};
		int target = input.nextInt();
		input.close();
		int[] indexOf = binarySearchNums(nums, target);
		System.out.println("The target number is in the array at index: " + indexOf[0] + ". It took " + indexOf[1] + " 'if' statements to find.");
	}
	public static int[] binarySearchNums(int[] x, int y) {
		int i = 0;
		int low = 0;
		int high = x.length-1;
		int mid;
		int target = y;
		int index = 0;
		int[] ans = new int[2];
		while (low != high - 1) {
			mid = (high + low)/2;
			if(target<x[mid]) {
				high = mid;
				i += 1;
			}
			else {
				low = mid;
				i += 1;
			}
		}
		if(target == x[low]) {
			index = low;
		}
		else if (target == x[high]) {
			index = high;
		}
		ans[0] = index;
		ans[1] = i;
		return ans;
	}
}
