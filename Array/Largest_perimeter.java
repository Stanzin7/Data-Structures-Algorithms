package Array;

import java.util.*;

public class Largest_perimeter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] nums = {3,2,3,4};	//  2,3,3,4
		Arrays.sort(nums);
		
		int p = 0;
		int ans = 0;
		for (int i = nums.length-1; i > 1;  i--) {
			if(nums[i-2]+ nums[i-1] > nums[i]) {
				p = nums[i-2]+ nums[i-1]+ nums[i];
				
			}
			ans = Math.max(ans, p);
		
		}
		System.out.println(ans);

	}

}
