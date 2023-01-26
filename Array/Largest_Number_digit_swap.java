package Array;

import java.util.*;

public class Largest_Number_digit_swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 65875;
		int t = num;
		
		// ans
		int ans = 0;
		int mul = 1;

		int f = t % 10; // 6 5 8 7 5
		
		while (t != 0) {
			int rem = num % 10;
			if(rem > f) {
				ans = ans + rem*mul;
			}
			
			t /= 100;
		}

	}

}
