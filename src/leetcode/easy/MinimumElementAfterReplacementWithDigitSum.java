package leetcode.easy;

/**
 * <a href="https://leetcode.com/problems/minimum-element-after-replacement-with-digit-sum/description/?envType=problem-list-v2&envId=dengp0kr">Source: </a>
 */
public class MinimumElementAfterReplacementWithDigitSum {

    public static int Solution(int[] nums) {
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            int sum = 0;
            do {
                sum += num % 10;
                num /= 10;
            }
            while (num != 0);

            if (sum < min) {
                min = sum;
            }
        }
        return min;
    }

    static void main() {
        int[] nums = {10, 12, 13, 14};
        System.out.println(Solution(nums));
    }

}
