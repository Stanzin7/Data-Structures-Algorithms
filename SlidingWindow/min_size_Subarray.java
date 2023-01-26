package SlidingWindow;

import java.util.HashMap;
import java.util.Map.Entry;

public class min_size_Subarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = { 1, 4, 4 };
		int t = 4;

		int si = 0;
		int ei = 0;

		int sum = 0;
		int ans = 0;
		while (ei < nums.length) {
			// window grow
			sum += nums[ei];
			while (si <= ei && sum >= t) {

				if (ans == 0) {
					ans = ei - si + 1;
				} else {
					ans = Math.min(ans, ei - si + 1);
				}
				sum -= nums[si];
				si++;

			}

			ei++;
		}
		System.out.println(ans);

	}

}
