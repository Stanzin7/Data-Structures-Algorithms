package Array;

import java.util.Scanner;

public class Maximum_Circular_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] num = { 8, -8, 9, -9, 10, -11, 12 };

		int x = 5;
		int row = 1;
		int space = x - 1;
		int star = 1;
		while (row <= x) {
			int i = 1;
			while (i <= space) {
				System.out.print("  ");
				i++;
			}
			int j = 1;
			while (j <= 2 * star - 1) {
				if (j % 2 != 0)
					System.out.print("* " + " ");
				else
					System.out.print(" ");
				j++;

			}
			star++;
			space--;
			row++;
			System.out.println(" ");
		}
	}
}