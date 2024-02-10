package pkg;

import java.util.ArrayList;

public class RemoveBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		addNumbers(arr, ArrayMaker());
		
		final int target = 98;
		
		if(inArray(arr, target)) {
			System.out.println("It is there. Number is at index: " + indexOf(arr, target));
			remove(arr, target);
			System.out.println("Number was removed from the array.");
		}
		else {
			System.out.println("Number not found.");
		}
		
	}
	
	public static int[] ArrayMaker() {
		int[] nums = new int[10];
		nums[0] = 14;
		nums[1] = 45;
		nums[2] = 6;
		nums[3] = 87;
		nums[4] = 57;
		nums[5] = 23;
		nums[6] = 65;
		nums[7] = 98;
		nums[8] = 20;
		nums[9] = 46;
		
		return nums;
	}
	
	public static boolean addNumbers(ArrayList<Integer> arr, int[] nums) {
		for(int i = 0;i<nums.length;i++) {
			addSorted(arr, nums[i]);
		}
		return true;
	}
	
	public static boolean inArray(ArrayList<Integer> array, int target) {
		for(int c=0;c<array.size();c++) {
			if(array.get(c) == target) {
				return true;
			}
		}
		
		return false;
	}
	
	public static int indexOf(ArrayList<Integer> array, int target) {
		for(int i=0;i<array.size();i++) {
			if(array.get(i) == target) {
				return i;
			}
		}
		
		return -1;
	}
	
	public static boolean remove (ArrayList<Integer> array, int target) {
		if(inArray(array, target)) {
			array.remove(indexOf(array, target));
			return true;
		}
		return false;
	}

	public static boolean addSorted(ArrayList<Integer> array, int value) {
		int i;
		for(i = 0;i<array.size();i++) {
			
			if(value <= array.get(i)) {
				
				array.add((i), value);
				//System.out.println("Number added.");
				return true;
				
			}
		}
		array.add(i, value);
		//System.out.println("Number added.");
		return false;
	}
}
