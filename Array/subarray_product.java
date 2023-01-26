package Array;

public class subarray_product {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = { 1, 2, 3 };
		int k = 0;

		int si = 0;
		int ei = 0;

		int ans = 0;
		int p = 1;

		while (ei < nums.length) {

			// window grow

			p = nums[ei] * p;

			while (p >= k && si <= ei) {
				// window shrink
				p = p / nums[si];
				si++;

			}

			ans = ans + ei - si + 1;

			ei++;

		}
		System.out.println(ans);

	}

}
