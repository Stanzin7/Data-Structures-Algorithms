package Array;

public class DNF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = { 2, 0, 2, 1, 1, 0,1 };

		int l = 0;
		int r = num.length - 1;
		int mid = 0;

		while (mid <= r) {

			if (num[mid] == 2) {
				int t = num[r];
				num[r] = num[mid];
				num[mid] = t;
				r--;

			} else if (num[mid] == 0) {
				int t = num[l];
				num[l] = num[mid];
				num[mid] = t;
				l++;
				mid++;
		

			} else {
				mid++;

			}
			

		}
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}

	}

}
