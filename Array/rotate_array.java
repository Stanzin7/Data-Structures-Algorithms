package Array;

import java.util.*;

public class rotate_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int[] arr = new int[N];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int r = sc.nextInt();

		rotatearray(arr, r);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}	
	

	}

	public static void rotatearray(int[] arr, int r) {
		int n = arr.length;
		r = r % n;
		// 1st n-k element ke liye
		reverse(arr, 0, n - r - 1);
		// last k element reverse krna he
		reverse(arr, n - r, n - 1);
		// all element reverse krna he
		reverse(arr, 0, n - 1);
	
	}

	public static void reverse(int[] arr, int i, int j) {
		while (i < j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
	}

}
