package Array;

import java.util.*;

public class LongestConsecutivE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = { 1, 2, 0, 1 };

		SortMethod(num);
		NonSortMethod(num);

	}

	private static void NonSortMethod(int[] num) {
		int count = 0; // track count
		int first = num[0];
		int ans = 0;

		if (num[0] == first) {
			count++;
			first++;
		}

		for (int i = 1; i < num.length; i++) {

			if (num[i] == num[i - 1]) {
				count = 1;
				first = num[i];
				first++;
			} else {
				// write logic more clear.

				if (first == num[i]) {
					count++;
				}
				if (first != num[i]) {

					count = 1;
					first = num[i];
				}
				first++;

			}

			ans = Math.max(ans, count);

		}
		System.out.println(ans);

	}

	private static void SortMethod(int[] num) {
		Arrays.sort(num);
		int count = 0; // track count
		int first = num[0];
		int ans = 0;

		if (num[0] == first) {
			count++;
			first++;
		}

		for (int i = 1; i < num.length; i++) {
			if (num[i] == num[i - 1]) {
				count = 1;
				first = num[i];
				first++;
			} else {
				// write logic more clear.

				if (first == num[i]) {
					count++;
				}
				if (first != num[i]) {

					count = 1;
					first = num[i];
				}
				first++;

			}

			ans = Math.max(ans, count);

		}
		System.out.println(ans);

	}

}
