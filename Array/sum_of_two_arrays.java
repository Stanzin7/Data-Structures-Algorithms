package Array;

import java.util.*;

public class sum_of_two_arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int[] a = new int[m];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		int n = sc.nextInt();
		int[] b = new int[n];
		for (int i = 0; i < b.length; i++) {
			b[i] = sc.nextInt();
		}


		ArrayList<Integer> ans = new ArrayList<>();

		int a_j = a.length - 1;

		int b_j = b.length - 1;

		int carry = 0;

		while (a_j >= 0 && b_j >= 0) {

			//
			int sum = a[a_j] + b[b_j] + carry;

			if (sum > 9) {
				ans.add(sum % 10);
				carry = sum / 10;
			} else {
				ans.add(sum);
				carry = 0;
			}
			a_j--;
			b_j--;

		}
		if (a_j >= 0) {
			ans.add(a[a_j] + carry);
		} else if (b_j >= 0) {
			ans.add(b[b_j] + carry);
		} else if (carry != 0) {
			ans.add(carry);
		}

		Collections.reverse(ans);

		for (int val : ans) {
			System.out.print(val + ", ");
		}
		System.out.print("END");

	}

}
