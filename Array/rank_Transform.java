package Array;

import java.util.*;

public class rank_Transform {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 40, 10, 20, 30 };
		int [] zrr = Arrays.copyOf(arr, arr.length);
		
		Arrays.sort(zrr);
		
		for (int i = 0; i < arr.length; i++) {
			int j = zrr[arr[i]];
			System.out.println(j);
		}
		
	}

}
