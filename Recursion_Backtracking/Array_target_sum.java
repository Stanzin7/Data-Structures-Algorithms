package Recursion_Backtracking;

import java.util.Arrays;
import java.util.Scanner;

public class Array_target_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		int target = scn.nextInt();
		targetSumTriplet(arr, target);
	}

	private static void targetSumTriplet(int[] arr, int target) {
		// TODO Auto-generated method stub
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			
		}

	}

}
