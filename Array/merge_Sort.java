package Array;

public class merge_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums1 = { 1, 2, 3 };
		int[] nums2 = { 2, 5, 6 };

		int m = 3;
		int n = 3;
		int[] arr = new int[m + n];
		int i = 0;

		int n1 = 0;
		int n2 = 0;
		while (n1 < m && n2 < n) {
			if (nums1[n1] > nums2[n2]) {		
				arr[i] = nums2[n2];		
				n2++;
			} else {
				arr[i] = nums1[n1];
				n1++;
			}
			i++;
		}

		while(n1 < nums1.length) {
			arr[i++] = nums1[n1];
			n1++;		
		}	
		while(n2 < nums1.length) {
			arr[i++] = nums2[n2];
			n2++;		
		}
		
		for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[j]+ " ");
		}
		
	}

}
