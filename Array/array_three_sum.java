package Array;

import java.util.Arrays;
import java.util.Scanner;

public class array_three_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        int target = scn.nextInt();
        targetSumTriplet(arr, target);
    }
    public static void targetSumTriplet(int[] arr, int target) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            int temp = target - arr[i];
            int j = i + 1;
            int k = arr.length - 1;
            int tempArrj = 0;
            int tempArrk = 0;
            while (j < k) {
                if (tempArrj == arr[j] && tempArrk == arr[k]) {
                	j++;
                	k--;
                    continue;
                } else {
                    if (arr[j] + arr[k] < temp) {
                        j++;
                    } else if (arr[j] + arr[k] > temp) {
                        k--;
                    } else {
                        System.out.println(arr[i] + ", " + arr[j] + " and " + arr[k]);
                        j++;
                        k--;
                        tempArrj = arr[j];
                        tempArrk = arr[k];
                    }
                }
            }
        }
    }
}