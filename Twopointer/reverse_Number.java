package Twopointer;

import java.util.*;

public class reverse_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] nums = {1,13,10,12,31};
		ArrayList<Integer> l = new ArrayList<>();
		for (int k : nums) {
			l.add(k);
			
		}
		for (int k : nums) {
			l.add(reverse(k));		
			
		}
		
		HashMap<Integer, Integer> ans = new HashMap<>();
		for (int k : l) {
			if(ans.containsKey(k)) {
				ans.put(k, ans.get(k)+1);
			} else {
				ans.put(k, 1);
			}		
			
		}
		System.out.println(ans.size());
	}

	public static int reverse(int n) {
		int rev = 0;
		while (n != 0) {
			int r = n % 10;
			rev = rev * 10 + r;
			n = n / 10;
		}
		return rev;
	}

}
