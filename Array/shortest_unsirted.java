package Array;

import java.util.*;

public class shortest_unsirted {

	public static void main(String[] args) {
		// check if it is a continous subarray after sorting

		int[] arr = { 4, 8, 1, 2, 3, 40, 10, 15 };

		checkContinous(arr);
		
	}

	private static void checkContinous(int[] arr) {

		// find start
		
		int start = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i - 1] < arr[i]) {
				start = i;
			} else {
				break;
			}
		}

		if (start == arr.length - 1) {
			System.out.println("sorted");
		}

		// find end
		int end = 0;
		for (int i = arr.length - 1; i >= 1; i--) {
			if (arr[i] > arr[i - 1]) {
				end = i-1;
			} else {
				break;
			}
		}
	

		// find minimum and max in the array;
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for (int i = start; i <= end; i++) {
			min = Math.min(min, arr[i]);
			max = Math.max(max, arr[i]);
		}
		
		// { 1, 4, 6, 2, 5, 8, 3, 7 };
		// finally finding minimum and max is to handle the edge test cases;

	
		for (int i = start-1; i >= 0; i--) {		
			System.out.println(i);
			if (arr[i] > min) {
				start--;
			}
		}
		
		for (int i = end; i < arr.length; i++) {		
			if (max > arr[i]) {
				end++;
			}
		}
	
		
		System.out.println(end - start + 1);

	}

}
