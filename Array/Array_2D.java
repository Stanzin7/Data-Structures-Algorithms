package Array;

import java.util.*;

public class Array_2D {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Stack<Integer> st = new Stack<Integer>();
		st.push(10);
		
		
		System.out.println(st.size());
		
		int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

		int[][] brr = new int[arr.length][arr[0].length];

		for (int i = 0; i < arr.length; i++) { // column loop

			for (int j = 0; j < arr[0].length; j++) {

				brr[i][j] = arr[j][i];
				System.out.print(brr[i][j] + " ");
			}
			System.out.println();

		}

	}

}
