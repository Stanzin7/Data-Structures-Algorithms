package Array;

public class Divisible_Subarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] num = { 1, 2, 3, 4, 6 };
		int k = 5;

		long[] freq = new long[num.length + 1];
		freq[0] = 1;
		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			sum = (sum + num[i]) % k;
			freq[sum] += 1;
		}
		long ans = 0;
		for (int i = 0; i < freq.length; i++) {
			if (freq[i] >= 2) {
				ans = ans + (freq[i] * (freq[i] - 1) / 2);
			}
		}

		

	}

}
