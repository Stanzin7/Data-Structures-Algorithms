package Array;

import java.util.*;

public class three_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { -1, 0, 1, 2, -1, -4 };
		Arrays.sort(nums);
		List<List<Integer>> ans = new ArrayList<>();
		for (int i = 0; i < nums.length; i++) {
			if (i > 0 && nums[i] == nums[i - 1]) {
				continue;
			}

			ArrayList<Integer> ll = new ArrayList<Integer>();
			HashSet<List<Integer>> set = new HashSet();
			int j = i + 1;
			int k = nums.length - 1;
			while (j < k) {
				if (nums[i] + nums[j] + nums[k] == 0) {
					ll.add(nums[i]);
					ll.add(nums[j]);
					ll.add(nums[k]);
				}
				k--;

			}
			if (ll.size() > 1) {
				ans.add(ll);
			}

		}

		System.out.println(ans);

	}

}
