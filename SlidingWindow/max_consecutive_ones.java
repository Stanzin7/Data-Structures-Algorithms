package SlidingWindow;

public class max_consecutive_ones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {0,0,0,1};
		int k = 4;
		System.out.println(checkWindow(nums, k));

	}

	private static int checkWindow(int[] nums, int k) {

		int si = 0;
		int ei = 0;
		int ans = 0;

		int zero = 0;

		while (ei < nums.length) {

			// window grow
			if (nums[ei] == 0) {
				zero++;
			}

			// window size k
			while (ei > si && zero > k) {

				if (nums[si] == 0) {
					zero--;
				}
				si++;

			}
			
			// window shrink
			if (zero  <= k) {
				ans = Math.max(ans, ei - si + 1);
			}
			ei++;
		}

		return ans;
	}

}
