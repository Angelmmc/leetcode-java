package leetcode.easy;

import java.util.Arrays;

/**
 * 283. Move Zeroes
 * <a href="https://leetcode.com/problems/move-zeroes">Source: </a>
 */
public class MoveZeroes {

    public static void Solution(int[] nums) {

        int i = 0;
        int j = 0;
        while (i < nums.length && j < nums.length) {

            j = i++;
            while (j < nums.length && nums[j] == 0) {
                j++;
            }

            if (nums[i] == 0 && j < nums.length) {
                nums[i] = nums[j];
                nums[j] = 0;
            }

            i++;


        }
        System.out.println(Arrays.toString(nums));
    }

    static void main() {
        //int[] nums = {1, 0, 0};
       // int[] nums2 = {0,1,0,3,12};
        int [] nums3 = {4,2,4,0,0,3,0,5,1,0};

        //Solution(nums);
       // Solution(nums2);
        Solution(nums3);
    }
}
