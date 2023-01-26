package Array;

public class add_number {

	public static void main(String[] args) {
		int n = 38;
		System.out.println(checkHapppy(n));
	

	}

	private static int checkHapppy(int num) {

		// if it is one digit then return false anyways, except one
		while(cod(num) !=1) {
			
			int sum  = 0;
			while(num != 0) {
				sum += num%10;
				num = num/10;			
			}
			num = sum;
			sum = 0;
		}
		
		return num;
		
	}

	private static int cod(int num) {
		
		int count  = 0;
		 while(num != 0) {
			 
			 count++;
			 num = num/10;		 
		 }
		
		return count;
	}
}