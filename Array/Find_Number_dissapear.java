package Array;

import java.util.Arrays;

public class Find_Number_dissapear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 4, 3, 2, 7, 8, 2, 3, 1 };
		int[] freq = new int[100000];
		for (int i = 0; i < nums.length; i++) {
			freq[nums[i]] += 1;
		}
		int count = 1;
		for (int i = 0; i < 8; i++) {
			if(freq[i] != count) {
				System.out.println(i);
			}
			count++;
		}

	}

}
