package Array;

public class Move_Zeroes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 0, 1, 0, 3, 12 };

		for (int i = 0; i < nums.length; i++) {

			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] == 0 && Math.abs(nums[i]) < Math.abs(nums[j])) {
					int t = nums[i];
					nums[i] = nums[j];
					nums[j] = t;

				}

			}

		}

		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + ",");
		}
	}

}
