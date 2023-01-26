package Array;

import java.util.Scanner;

public class determine_matrix_rotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt(); // square matrix
//		int b = sc.nextInt();

		int[][] arr = new int[a][a]; // 5
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = sc.nextInt();
			}

		}

		int[][] target = { { 1, 0 }, { 0, 0 } };

		System.out.println(istrue(arr, target));

	}

	public static boolean istrue(int[][] arr, int[][] target) {

		int rot = arr.length* arr[0].length;
		boolean rf = true;
		while (rot-- > 0) {
			Transpose(arr);
			rf = true;
			for (int i = 0; i < target.length; i++) {
				for (int j = 0; j < target.length; j++) {
					if (arr[i][j] != target[i][j]) {
						rf = false;
						break;
					}

				}
				if (rf == false) {
					break;
				}

			}
			if (rf == true) {
				return true;
			}

		}

		return rf;

	}

	public static void Transpose(int[][] arr) {

		int n = arr.length;
		int[][] new_arr = new int[n][n];
		int it = 0;
		if (it < arr[0].length - 1) {
			it = 0;
			for (int i = arr.length - 1; i >= 0; i--) {
				int jt = 0;
				for (int j = 0; j < arr.length; j++) {
					new_arr[it][jt] = arr[j][i];
					jt++;

				}
				it++;

			}

		}

		for (int i = 0; i < new_arr.length; i++) {
			for (int j = 0; j < new_arr.length; j++) {
				arr[i][j] = new_arr[i][j];
				System.out.print (arr[i][j]+ " ");

			}
			System.out.println();

		}

	}
}