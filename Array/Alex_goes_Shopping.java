package Array;

import java.util.*;

public class Alex_goes_Shopping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();

		int q = sc.nextInt();
		while (q-- > 0) {
			int money = sc.nextInt();
			int item = sc.nextInt();
			int count = 0;
			for (int i = 0; i < arr.length; i++) {
				if (money % arr[i] == 0) {
					count++;

				}

			}
			if (count >= item) { // Test case failed on count == item
				// because maybe the count can exceed the item they can
				//choose from.
				System.out.print("Yes");
			} else {
				System.out.print("No");
			}
			System.out.println();

		}

	}

}
