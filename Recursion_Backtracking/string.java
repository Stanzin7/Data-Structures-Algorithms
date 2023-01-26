package Recursion_Backtracking;

import java.util.Scanner;

public class string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();

		int[] temp = new int[n]; // create temporary array
		for (int i = 0; i < n; i++)
			temp[i] = arr[i];

		int op = sc.nextInt(); // q operations
		while (op-- > 0) { // q = 2
			int v = sc.nextInt(); // 1st operation

			for (int i = 0; i < n; i++) { // loop through array
				int r = i - v; // r = 0-1
				if (r < 0)
					r = r + n; // -1 + 5 = 4
				temp[i] += arr[i];
				// temp[0] = 5+ 1 = 6

				// 2nd iteration = 3....

			}
			for (int i = 0; i < n; i++)
				arr[i] = temp[i];
			// put it back in array so new array becomes [6, 3, 5, 7, 9]

			// next time for q = 0; you will iterate for q = 0;
		}
		int sum = 0;
		for (int i = 0; i < n; i++)
			sum += arr[i];// finally sum it

		System.out.println(sum % ((int) (Math.pow(10, 9) + 7)));
		// the sum of the elements of the final array modulus 10^9+7.

	}

}
