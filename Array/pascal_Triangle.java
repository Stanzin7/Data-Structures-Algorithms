package Array;

import java.util.*;

public class pascal_Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 29;
		List<List<Integer>> ans = new ArrayList<>();
		Pascal(ans, n);
		System.out.println(ans);
		//System.out.println(factorial(30));
	}

	public static void Pascal(List<List<Integer>> ans, int n) {

		int i = 0;
		int star = 0; // remember the star pattern wala concept
		while (i < n) {
			int j = 0;
			List<Integer> list = new ArrayList<>();
			while (j <= star) {
				int r = 0;
				long ncr = 1;
//				if (j > i / 2) {
//					r = i - j;
//				}
				ncr = ((i -j) * ncr / (r + 1));

				list.add((int) ncr);
				j++;
			}
			ans.add(list);
			i++;
			star++;
		}
	}
}