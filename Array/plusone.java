package Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class plusone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();
		int s = sc.nextInt();
		char arr[][] = new char[n][m];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = sc.next().charAt(0);
			}
		}
		Escape(arr, n, m, k, s);

	}

	public static void Escape(char[][] arr, int n , int m, int k, int s) {
		// TODO Auto-generated method stub



		for (int r = 0; r <= n-1; r++) {

			for (int c = 0; c <= m-1; c++) {
				
				if (s < k) {
					break;
				}
				char ch = arr[r][c];
				if (ch == '.') {
					s-= 3;

					if ( c == arr[0].length - 1) {
						s += 1;

					}

				} else if (ch == '*') {
					s+= 4;

					if ( c == arr[0].length - 1) {
						s+= 1;

					}

				} else if (ch == '#') {

					break;

				}

			}

		}

		if (s >= k) {
			System.out.println("Yes");
			System.out.println(s);
		}

		else {
			System.out.println("No");
		}

	}

}
