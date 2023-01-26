package Array;

import java.util.Arrays;

public class two_sum_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] num = { 2, 3, 4 };
		int t = 6;
		int i = 0;
		int j = num.length - 1;
		int idx_x = 0;
		int idx_y = 0;
		while (i < j) {
			// check number if equal

			if (num[i] + num[j] == t) {
				idx_x = i + 1;
				idx_y = j + 1;
			
			}

			j--;
			i++;

		}
		

	}

}
