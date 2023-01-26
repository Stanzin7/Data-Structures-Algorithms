package Array;

import java.util.*;

public class Partition_K_subsets {
	static int count = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums = {4,3,2,3,5,2,1};	
		int k = 4;
		Arrays.sort(nums);
		System.out.println(canPartitionKSubsets(nums, k));

	}

	public static boolean canPartitionKSubsets(int[] nums, int k) {

		int sum = 0;

		int[] used = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
		
		}
		System.out.println(sum);
		if (sum % k != 0) {
			System.out.println(sum%k);
			return false;
		}
		solve(nums, k, sum / k, 0, "", used);
		return (count >= k);
	}

	public static void solve(int[] nums, int k, int size, int last, String ans, int[] used) {
		if (size == 0) {
			count++;
			return;
		}
		for (int i = last; i < nums.length; i++) {
			if (size >= nums[i] && used[i] == 0) {
				used[i] = 1;
				solve(nums, k, size - nums[i], i + 1, ans + nums[i], used);
			}
		}
	}
}
