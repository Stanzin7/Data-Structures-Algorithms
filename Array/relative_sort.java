package Array;

import java.util.Arrays;

public class relative_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 28, 6, 22, 8, 44, 17 };
		int[] brr = { 22, 28, 8, 6 };

		int idx = 0;

		for (int i = 0; i < brr.length; i++) {
			int j = i;
			while (j <= arr.length - 1) {

				if (brr[i] == arr[j]) {
					// swap
					int temp = arr[j];
					arr[j] = arr[idx];
					arr[idx] = temp;
					idx++;
				}

				j++;
			}

		}
		Arrays.sort(arr, idx, arr.length);

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println(idx);

	}

}
