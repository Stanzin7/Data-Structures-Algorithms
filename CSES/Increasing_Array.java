package CSES;

import java.util.Arrays;
import java.util.Scanner;

public class Increasing_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = sc.nextInt();

		}
		System.out.println(IncreasingArray(nums));
	}

	private static long IncreasingArray(int[] nums) {
		
		long count = 0;		
		int first = nums[0];
		
		for (int i = 1; i < nums.length; i++) {
			if(first < nums[i]) {
				first = nums[i];
			} else {
				count += first - nums[i];			
			}
		
			
		}
		return count;
		
	}
 
}
