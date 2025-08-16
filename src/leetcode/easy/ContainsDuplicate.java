package leetcode.easy;

import java.util.HashMap;

public class ContainsDuplicate {

	public static boolean containsDuplicate(int[] nums) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int num : nums) {
			if (map.containsKey(num)) {
				map.put(num, map.get(num) + 1);
			} else {
				map.put(num, 1);
			}
		}

		for (Integer num : map.values()) {
			if (num > 1) {
				return true;
			}

		}
		return false;

	}

	public static void main(String[] args) {

		int[] nums = { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 };

		System.out.println(containsDuplicate(nums));
	}

}
