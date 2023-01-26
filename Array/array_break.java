package Array;

import java.util.Scanner;

public class array_break {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();

		int q = sc.nextInt();
		while (q-- > 0) {
			int a = sc.nextInt(); // Amount
			int k = sc.nextInt(); // kind of items that can be buy
			int sum = 0;
			int item = 0;
			for (int i = 0; i < arr.length; i++) {
				sum = 0;
				while (sum < a) {
					sum = sum + arr[i];					
				}
					
				if (sum - a == 0)
					item++;
			}		
		}
	}
}