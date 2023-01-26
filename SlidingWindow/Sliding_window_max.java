package SlidingWindow;

import java.util.*;

public class Sliding_window_max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = { 1,-1 };
		int k = 1;

		ArrayList<Integer> ans = new ArrayList<>();
		int max = Integer.MIN_VALUE;
		int count = 0;

		// track index
		int si = 0;
		int ei = 0;

		while (ei < nums.length) {

			count++;
			// window shrink

			if (count == k) {
							
				for (int i = si; i <= ei; i++) {
					max = Math.max(max, nums[i]);
				}
				
				ans.add(max);
				si++;
				count--;
			}
			max = Integer.MIN_VALUE;

			ei++;
		}
		System.out.println(ans);

	}

}
