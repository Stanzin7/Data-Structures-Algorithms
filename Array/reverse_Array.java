package Array;

import java.util.*;

public class reverse_Array {

	public static void main(String[] args) {

		ArrayList<Integer> arr = new ArrayList<>();

		int[] a = { 1, 2, 3, 4, 5, 6 };
		int k = 3;

		for (int i = 0; i < a.length; i++) {
			arr.add(a[i]);
		}

		int range = arr.size() / k;

		ArrayList<Integer> n_arr = new ArrayList<>();
		ArrayList<Integer> rev = new ArrayList<>();

		int count = 1;
		for (int i = 0; i < range * k; i++) {
			
			rev.add(arr.get(i));
			if (count == k) {
				count = 1;
			}
			count++;

		}

		System.out.println(n_arr);

	}

}
