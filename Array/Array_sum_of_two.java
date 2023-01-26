package Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Array_sum_of_two {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sb = new Scanner(System.in);
		int n = sb.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sb.nextInt();
		}
		int m = sb.nextInt();
		int[] brr = new int[m];
		for (int i = 0; i < brr.length; i++) {
			brr[i] = sb.nextInt();
		}
		ArrayList<Integer> ans = new ArrayList<>();
		Sum_of_two(arr, brr, ans);
		
		for(int val: ans) {
			System.out.print(val+ ", ");
		}
		System.out.print("END");

	}

	private static void Sum_of_two(int[] arr, int[] brr, ArrayList<Integer> ans) {

		int hi = arr.length - 1;
		int h_b = brr.length - 1;

		int carry = 0;

		while (hi >= 0 && h_b >= 0) {

			int rem = brr[h_b] + arr[hi] + carry;

			if (rem > 9) {
				carry = 1;
				ans.add(rem % 10);
			} else {
				carry = 0;
				ans.add(rem);
			}

			hi--;
			h_b--;
		}

		if (hi >= 0) {

			while (hi >= 0) {

				int rem = arr[hi] + carry;

				if (rem > 9) {
					carry = 1;
					ans.add(rem % 10);
				} else {
					carry = 0;
					ans.add(rem);
				}

				hi--;
			}

		}
		
		if (h_b >= 0) {

			while (h_b >= 0) {

				int rem = brr[h_b] + carry;

				if (rem > 9) {
					carry = 1;
					ans.add(rem % 10);
				} else {
					carry = 0;
					ans.add(rem);
				}

				h_b--;
			}

		}
		if(carry !=0 ) {
			ans.add(carry);
		}

		Collections.reverse(ans);

	}

}
