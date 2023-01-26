package CSES;

import java.util.Arrays;
import java.util.Scanner;

public class Missing_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		nums[0] = 0;
		for (int i = 1; i < nums.length; i++) {
			nums[i] = sc.nextInt();

		}
		Arrays.sort(nums);
		int count = 1;
		int p = 0;
		for (int i = 1; i < nums.length; i++) {
			if (count != nums[i]) {
				p = count;
				break;
			}
			count++;
		}
		if (p == 0) {
			System.out.println(nums.length);
		} else {
			System.out.println(p);
		}

	}
}
