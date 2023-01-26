package Array;

import java.util.Arrays;

public class Array_Partition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {1,2};

		Arrays.sort(nums);

		int sum = 0;
		for (int i = 0; i < nums.length; i = i + 2) {
			int min = Math.min(nums[i], nums[i + 1]);
			sum += min;
		}
		System.out.println(sum);

	}

}
