package Array;

import java.util.Scanner;

public class product_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
		int [] arr= new int [n];
		
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();	
			}
		
		long [] ans = Product_Array(arr);
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i]+" ");
		}
	}

	public static long[] Product_Array(int[] arr) {
		// TODO Auto-generated method stub
		long[]  left = new long[arr.length];
		left[0] = 1;
		for (int i = 1; i < left.length; i++) {
			left[i] = left[i - 1] * arr[i - 1];
		}
		long[]  right = new long[arr.length];
		int n = arr.length;
		right[n - 1] = 1;
		for (int i = n - 2; i >= 0; i--) {
			right[i] = right[i + 1] * arr[i + 1];
		}

		for (int i = 0; i < right.length; i++) {
			left[i] = left[i] * right[i];
			// System.out.print(left[i]+" ");
		}
		
		return left;
	}
}
