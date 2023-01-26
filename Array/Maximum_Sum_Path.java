package Array;

public class Maximum_Sum_Path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 3, 7, 10, 12, 15, 30, 34 };
		int[] brr = { 1, 5, 7, 8, 10, 15, 16, 19 };

		int i = 0;
		int j = 0;
		long ans = 0;
		long M = 1000000007;
		int ii = 0;
		int jj = 0;

		while (i < arr.length && j < brr.length) {

			if (arr[i] > brr[j]) {
				j++;
			} else if (arr[i] < brr[j]) {
				i++;
			} else if (arr[i] == brr[j]) {
				int sum1 = 0;
				int sum2 = 0;
				// calculate sum for arr
				for (int k = ii; k <= i; k++) {
					sum1 += arr[k];
					
				}
				// calculate sum for brr
				for (int k = jj; k <= j; k++) {
					sum2 += brr[k];

				}
				ans = ans + Math.max(sum1, sum2);
				System.out.println(ans);

				i++;
				j++;
				ii = i;
				jj = j;

			}

		}
		if (i == arr.length) {
			for (int k = jj; k < brr.length; k++) {
				ans += brr[k];

			}
		}
		if (j == brr.length) {
			for (int k = ii; k < arr.length; k++) {
				ans += arr[k];

			}

		}
		System.out.println(ans);

	}

}
