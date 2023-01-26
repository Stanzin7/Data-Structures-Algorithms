package Array;

import java.util.*;

public class check_duplicates {

	public static void main(String[] args) {

		int[] nums = { 1, 2, 3, 1 };
		checkduplicates(nums);

	}

	private static boolean checkduplicates(int[] nums) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(nums[i])) {
				return true;
			} else {
				map.put(nums[i], 1);
			}
		}
		return false;
	}
}
