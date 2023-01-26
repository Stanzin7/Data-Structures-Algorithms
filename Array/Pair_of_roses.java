package Array;

import java.util.Scanner;

public class Pair_of_roses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt(); // n input
			int[] arr = new int[n];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt(); // prints n input
			}

			int target = sc.nextInt();
			int p1 = 0;
			int p2 = 0;
			int diff = Integer.MAX_VALUE;

			for (int i = 0; i < arr.length; i++) {

				for (int j = i + 1; j < arr.length; j++) {

					if (arr[i] + arr[j] == target) {
						if (Math.abs(arr[i] - arr[j]) < diff) {
							p1 = i;
							p2 = j;
							diff = Math.abs(arr[i] - arr[j]);
						}
					}

				}
			}

			System.out.println("Deepak should buy roses whose prices are " + Math.min(arr[p1], arr[p2]) + " and "
					+ Math.max(arr[p1], arr[p2]) + ".");

		}
	}

}
