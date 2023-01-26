package Array;

import java.util.Iterator;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = { 8, 9, 4, 2, 1, 11}; // 

		// First element is sorted.
		for (int i = 1; i < num.length; i++) {
			while (i > 0 && num[i - 1] > num[i] ) {
				int t = num[i];
				num[i] = num[i - 1];
				num[i - 1] = t;
				i--;
				
			}

		}

		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}

	}

}
