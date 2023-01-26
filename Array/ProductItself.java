package Array;

public class ProductItself {

	
	public static void main(String[] args) {     // Solve the question ?
		// TODO Auto-generated method stub
		int[] nums = { 1, 2, 3, 4 };

		int[] nums1 = new int[nums.length];
		int[] nums2 = new int[nums.length];

		nums1[0] = 1;
		int ans = nums1[0];
		for (int i = 1; i < nums.length; i++) {
			ans = nums[i] * ans;
			nums1[i] = ans;

		}
		
		
		nums2[nums.length-1] = 1;
		int ans2 = nums2[nums.length-1];
		for (int i = nums.length-2; i >=0; i--) {
			ans2 = nums[i] * ans2;
			nums2[i] = ans2;

		}

		for (int i = 0; i < nums2.length; i++) {
			System.out.print(nums2[i] + " ");
		}

	}

}
