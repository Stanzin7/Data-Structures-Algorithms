package Recursion_Backtracking;

import java.util.Scanner;

public class Spli_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		print_subset(arr, 0, 0, 0, "", "");

	}

	public static void print_subset(int[] arr, int i, int sum, int sum1, String ans, String ans2) {

		if (i == arr.length) {
			if (sum == sum1) {
				System.out.println(ans + "and " + ans2);
				
			}
			return;
		}

		print_subset(arr, i + 1, sum + arr[i], sum1, ans + arr[i]+ " ", ans2);

		print_subset(arr, i + 1, sum, sum1 + arr[i], ans, ans2+ arr[i]+ " ");
		

	}

}
