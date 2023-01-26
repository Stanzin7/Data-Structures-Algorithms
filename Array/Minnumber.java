package Array;

public class Minnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 10, 7, 18, 3, 8, 11, 9, 7 };
		
		int first = arr[0];
		
		for (int i = 1; i < arr.length; i++) {
			if(arr[i]< first) {
				first = arr[i];
			}
			
		}
		System.out.println(first);

	}

}
