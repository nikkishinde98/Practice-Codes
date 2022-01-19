package oop;

public class BinarySearch {
	static int binarySearch(int[] arr, int target) {
		int start = 0;
		int end = arr.length - 1;
		
		while(start <= end) {
			int mid = start + (end - start) / 2;
			
			if(target < arr[mid]) {
				end = mid - 1;
			}
			else if(target > arr[mid]) {
				start = mid + 1;
			}
			else {
				return mid;
			}
		}
		return -1;
	}
	
	public static void main(String [] args) {
		int[] arr = {22, 33, 34, 145, 166, 18, 202, 45};
		int target = 145;
		int ans = binarySearch(arr, target);
		System.out.println("Element found at index : " + ans);
	}

}
