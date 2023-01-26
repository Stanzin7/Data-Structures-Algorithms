package Array;

public class find_middle_index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = { 1, 7, 3, 6, 5, 6 };

		int t_sum = 0;
		for (int i = 0; i < nums.length; i++) {
			t_sum += nums[i];

		}

		// update index
		int idx = 0;
		int left = 0;
		for (int i = 0; i < nums.length; i++) {

			t_sum = t_sum - nums[i];

			if (left == t_sum) {
				idx = i;
			}
			left += nums[i];

		}

		System.out.println(idx);

	}

}
