package Array;

import java.util.Scanner;

public class limited_budget_party {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		while (t-- > 0) {
			int n = scn.nextInt();
			int m = scn.nextInt();
			int[] arr = new int[n];
			for (int j = 0; j < arr.length; j++) {
				arr[j] = scn.nextInt();
			}

			int sum = 0;
			for (int i = 0; i < arr.length; i++) {
				sum = arr[i];
				for (int j = i + 1; j < arr.length; j++) {
					sum += arr[j];
					if (sum == m) {
						break;
					}
					if (sum > m) {
						break;
					}
				}
				if (sum == m) {
					System.out.println("YES");
					break;
				}
			}
			if (sum != m) {
				System.out.println("NO");

			}

		}

	}

}
