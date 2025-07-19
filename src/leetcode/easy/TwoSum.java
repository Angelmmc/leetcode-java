package leetcode.easy;

import java.util.Arrays;

public class TwoSum {

	public int[] twoSum(int[] nums, int target) {
		int[] result = new int[2];

		for (int i = 0; i < nums.length; i++) {
			for (int j = 1 + i; j < nums.length; j++) {
				if ((nums[i] + nums[j]) == target) {
					result[0] = i;
					result[1] = j;
					return result;
				}
			}

		}

		return result;

	}

	public static void main(String[] args) {

		int[] nums = { 3, 2, 3 };
		int target = 6;

		TwoSum obj = new TwoSum();

		System.out.println(Arrays.toString(obj.twoSum(nums, target)));

	}

}
