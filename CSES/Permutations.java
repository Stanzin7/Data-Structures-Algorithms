package CSES;

import java.util.ArrayList;
import java.util.Scanner;

public class Permutations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 2;
		String ans = "";
		while(sum <= n) {		
			System.out.print(sum+ans + " ");
			sum +=2;
			
		}
		int sum1 = 1;
		while(sum1 <= n) {		
			System.out.print(ans+sum1+ " ");
			sum1+=2;
		}
		
	}
}