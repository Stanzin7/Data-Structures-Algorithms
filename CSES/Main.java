package CSES;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if(n == 2 || n ==3) {
			System.out.println("NO SOLUTION");
		}
		
		long sum = 2;
		String ans = "";
		while(sum <= n) {		
			System.out.print(sum+ans + " ");
			sum +=2;
			
		}
		long sum1 = 1;
		while(sum1 <= n) {		
			System.out.print(ans+sum1+ " ");
			sum1+=2;
		}
		
	}
}