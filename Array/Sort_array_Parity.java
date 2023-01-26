package Array;

import java.util.*;

public class Sort_array_Parity {

	public static void main(String[] args) {

		int[] num = { 4, 2, 8, 5, 3, 7, 9, 10 };

		int lo = 0;
		int hi = 0;

		while (lo < num.length) {

			if (num[lo] % 2 == 0) {
				// swap
				int t = num[lo];
				num[lo] = num[hi];
				num[hi] = t;
				lo++;
				hi++;
			} else {
				lo++;
			}
		}

		swap(num, 1, num.length - 1);
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}

	}

	private static void swap(int[] num, int i, int l) {

		int m = i;
		int lo = l - 1;

		while (m < num.length / 2) {
			// swap
			int t = num[lo];
			num[lo] = num[m];
			num[m] = t;
			lo = lo - 2;
			m = m + 2;

		}
	}
}