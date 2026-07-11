package leetcode.medium;

/**
 * 1004. <a href="https://leetcode.com/problems/max-consecutive-ones-iii/">Max Consecutive Ones III</a>
 */
public class MaxConsecutiveOnesIII {

    public static int longestOnes(int[] nums, int k) {
        int oneCounter = 0;
        int zeroCounter = 0;
        int longestOnes = 0;
        for (int j = 0, i = 0; j < nums.length; j++) {

            if (nums[j] == 0) zeroCounter++;
            else oneCounter++;

            while (zeroCounter > k) {
                if (nums[i] == 0) zeroCounter--;
                else oneCounter--;
                i++;
            }

            if (oneCounter + zeroCounter > longestOnes) {
                longestOnes = oneCounter + zeroCounter;
            }

        }
        return longestOnes;
    }

    static void main() {
        int[] nums = {1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0};
        int[] nums2 = {0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1};
        int[] nums3 = {0, 0, 1, 1, 1, 0, 0};
        int[] nums4 = {1, 1, 1, 1};
        int[] nums5 = {0, 0, 0, 0};
        int[] nums6 = {0};
        int[] nums7 = {1};
        int[] nums8 = {1, 0, 1, 0, 1};
        int[] nums9 = {1, 0, 0, 1, 1, 0, 1, 1, 0};
        int[] nums10 = {1, 1, 0, 0, 0, 0, 1, 1};
        int[] nums11 = {0, 1, 1, 0, 1, 1, 1, 0};
        int[] nums12 = {1, 0, 1, 0, 1};


        System.out.println(longestOnes(nums, 2));
        System.out.println(longestOnes(nums2, 3));
        System.out.println(longestOnes(nums3, 0));
        System.out.println(longestOnes(nums4, 2));
        System.out.println(longestOnes(nums5, 2));
        System.out.println(longestOnes(nums6, 1));
        System.out.println(longestOnes(nums6, 0));
        System.out.println(longestOnes(nums7, 0));
        System.out.println(longestOnes(nums8, 2));
        System.out.println(longestOnes(nums9, 2));
        System.out.println(longestOnes(nums10, 1));
        System.out.println(longestOnes(nums11, 1));
        System.out.println(longestOnes(nums12, 10));
    }
}
