package SlidingWindow;

public class count_SubArray {

	public static void main(String[] args) {

		int[] arr = { 1, 4, 6 };
		int l = 3;
		int r = 8;

		int si = 0;
		int ei = 0;

		int sum = 0; // keep track of sum

		int count = 0; // track the no of subarrays

		int ans = 0;

		while (ei < arr.length) {

			sum += arr[ei];

			if (sum >= l && sum <= r) {
				count++;
			}

			while (ei > si && sum >= r) {
				sum -= arr[si];
				si++;

			}

			ans = Math.max(ans, ei - si + 1);
			ei++;

		}
		System.out.println(ans);

	}

}
