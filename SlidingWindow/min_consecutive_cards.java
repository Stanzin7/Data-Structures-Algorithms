package SlidingWindow;

import java.util.*;

public class min_consecutive_cards {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, Integer> map = new HashMap<>();
		int[] cards = { 70, 37, 70, 41, 1, 62, 71, 49, 38, 50, 29, 76, 29, 41, 22, 66, 88, 18, 85, 53 };

		int si = 0;
		int ei = 0;

		int ans = Integer.MAX_VALUE;
		while (ei < cards.length) {

			if (map.containsKey(cards[ei])) {
				map.put(cards[ei], map.get(cards[ei]) + 1);
			} else {
				map.put(cards[ei], 1);
			}

			while (map.get(cards[ei]) > 1) {
				ans = Math.min(ei - si + 1, ans);
				if (map.containsKey(cards[si])) {
					map.put(cards[si], map.get(cards[si]) - 1);
				}
				si++;
			}
			ei++;

		}
		System.out.println(ans);

	}

}
