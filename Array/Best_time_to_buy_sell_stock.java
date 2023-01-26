package Array;

import java.util.Stack;

public class Best_time_to_buy_sell_stock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] prices = { 7, 1, 5, 3, 6, 4 };

		Stack<Integer> st = new Stack<Integer>();
		int ans = 0;
		int x = 0;

		st.push(0);
		for (int i = 1; i < prices.length; i++) {
			// check day1
			while (!st.isEmpty() && prices[st.peek()] > prices[i]) {
				x = st.pop();
			}
			st.push(i);
			System.out.println(prices[st.peek()] + " "+ prices[x + 1]);
			ans = Math.max(ans, prices[st.peek()] - prices[x + 1]);

		}
		System.out.println(ans);

	}

}
