package Array;

import java.util.*;

public class String_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			String arr[] = new String[n];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.next();
			}
			
			Form_Biggest_Number(arr);
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i]);
			}
			System.out.println();
		}
	}

	public static void Form_Biggest_Number(String arr[]) {
		String ans = "";
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i].compareTo(arr[j]) < 0) {
					String temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}	
			
	}
}