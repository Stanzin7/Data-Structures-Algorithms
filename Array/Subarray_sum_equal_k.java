package Array;

public class Subarray_sum_equal_k {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 1,2};
		int k = 7;

		int s = 0; // tracks the subarray

		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			int si = i; // start index for each position.
			while (si < arr.length) {
				sum += arr[si];
				if (sum % 2 != 0) {
					s += sum;
				}
				si++;
			}

		}
		System.out.println(s);

	}

}
