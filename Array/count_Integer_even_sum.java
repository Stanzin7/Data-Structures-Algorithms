package Array;

public class count_Integer_even_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 30;

		System.out.println(checkeven(num));
	}

	private static int checkeven(int num) {

		int count = 0;
		while (num-- > 2) {
			
			int n = num;
			int sum = 0;
			while (n != 0) {

				sum += n % 10;
				n = n / 10;
			}
			if (sum % 2 == 0) {
				count++;
			}
		}
		
		return count;

	}

}
