package leetcode.easy;

import java.util.Arrays;

/**
 * 283. Move Zeroes
 * <a href="https://leetcode.com/problems/move-zeroes">Source: </a>
 */
public class MoveZeroes {

    public static void Solution(int[] nums) {
        int i = 0;
        int j = 1;
        while (j < nums.length) {

            while (j < nums.length && nums[j] == 0) {
                j++;
            }

            if (nums[i] == 0 && j < nums.length) {
                nums[i] = nums[j];
                nums[j] = 0;
            }
            i++;
            j = i;
        }
        System.out.println(Arrays.toString(nums));
    }

    static void main() {
        int[] nums1 = {};
        int[] nums2 = {0};
        int[] nums3 = {42};
        int[] nums4 = {0, 0, 0, 0, 0};
        int[] nums5 = {1, 2, 3, 4, 5};
        int[] nums6 = {0, 0, 0, 0, 1, 0, 0, 0, 0};
        int[] nums7 = {0, 0, 1, 2, 3, 0, 0};
        int[] nums8 = {-1, 0, -2, 0, -3, 0};
        int[] nums9 = {1, 1, 1, 0, 1, 1, 0, 1};
        int[] nums10 = {0, 1};
        int[] nums11 = {1, 0};
        int[] nums12 = {1, 2, 3, 0, 0, 0, 4};
        int[] nums13 = {0, 0, 1, 0, 2, 0, 3, 0, 4, 0, 5, 0, 0, 0, 6, 0, 0, 7, 0, 8, 0, 0};
        int[] nums14 = {0, 1, 0, 2, 0, 3, 0, 4, 0, 5, 0, 6, 0, 7, 0, 8};

        Solution(nums1);
        Solution(nums2);
        Solution(nums3);
        Solution(nums4);
        Solution(nums5);
        Solution(nums6);
        Solution(nums7);
        Solution(nums8);
        Solution(nums9);
        Solution(nums10);
        Solution(nums11);
        Solution(nums12);
        Solution(nums13);
        Solution(nums14);
    }
}
