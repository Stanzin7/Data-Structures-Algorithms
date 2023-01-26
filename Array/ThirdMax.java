package Array;

import java.util.Arrays;

public class ThirdMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1, 2, 2, 3, 5, 8, 9,100 };
		Arrays.sort(nums);
		int count = 1;
		int idx = 0;
		int ans = 0;
		for (int i = nums.length - 1; i > 0; i--) {

			if (nums[i - 1] == nums[i]) { // test case fails in the case of same number
				continue;
			} else if (nums[i - 1] < nums[i]) {
				count++;
			}
			if (count == 3) {
				idx = i;
				break;
			}
			ans = Math.max(ans, nums[i]);

		}

		System.out.println(nums[idx - 1]);

	}

}
