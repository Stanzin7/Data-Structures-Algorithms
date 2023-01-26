package SlidingWindow;

public class first_negative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long[] a = {-8, 2, 3, -6, 10};
		int k = 3;

		long[] arr = new long[k * 2];

		// keep track of min;
		int min = Integer.MIN_VALUE;

		// keep track of count;
		int count = 0;

		int si = 0;
		int ei = 0;

		while (ei < a.length) {
			
			if (a[ei] > 0) {
				min = (int) Math.max(Integer.MIN_VALUE, min);
			} else {
				min = (int) Math.max(a[ei], min);
			}
//			System.out.println(min + " " + a[ei]);
			count++;

			if (count == k) {

				
				if( min == Integer.MIN_VALUE) {
					arr[si] = 0;
				} else {
					arr[si] = min;
				}
			
				// set min to a[i+1];
				min = Integer.MIN_VALUE;
				
				count = 0;
				ei = si;
				si++;
			}
			ei++;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
