package Array;

import java.util.Arrays;
import java.util.Scanner;

public class form_biggest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();
		int s = sc.nextInt();
		int[][] arr = new int[n][m];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = sc.next().charAt(0);
			}
		}
		magic(arr, k, s);
	}

	public static void magic(int[][] arr, int k, int s) {

		for (int i = 0; i <= arr.length - 1; i++) { // arr.length-1
			for (int j = 0; j <= arr[0].length - 1; j++) {

				if (s < k) { // Incase strength drops below k
					break;

				} else if (arr[i][j] == '.') {

					s -= 3;

					if (j == arr[0].length - 1) {
						s += 1;

					}

				} else if (arr[i][j] == '*') {

					s += 4;

					if (j == arr[0].length - 1) {
						s += 1;

					}

				} else {
					break;
				}
			}
		}
		if (s >= k) {
			System.out.println("Yes"); // not YES
			System.out.println(s);
		} else {
			System.out.println("No");
		}
	}
}