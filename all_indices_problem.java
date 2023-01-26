package Recursion_Backtracking;

import java.util.Scanner;

public class all_indices_problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int r = scn.nextInt();
		int[] arr = new int[r];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		int t = scn.nextInt();
		findindices(arr, arr.length-1, t, "");
		

	}

	private static void findindices(int[] arr, int i, int t, String string) {
		
		// TODO Auto-generated method stub
		if(i == -1) {
			System.out.println(-1);
			return;
		}
		
		if(arr[i] == t) {
			System.out.print(i);
			return;
		}
		

		findindices(arr, i - 1, t, string);
	}

}
