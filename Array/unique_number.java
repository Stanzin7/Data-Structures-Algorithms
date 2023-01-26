package Array;

import java.util.Scanner;

public class unique_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int j = 0; j < arr.length; j++) {
			arr[j] = scn.nextInt();
		}
		int i = 0;
		int hi = arr.length - 1;
		while (i < hi) {
			int t = arr[i];
			arr[i] = arr[hi];
			arr[hi] = t;
			i++;
			hi--;
		}
		for (int z = 0; z < arr.length; z++) {
			System.out.println(arr[z]);
		}
	}
}