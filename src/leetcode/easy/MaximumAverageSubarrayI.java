package leetcode.easy;

/**
 * 643.
 * <a href="https://leetcode.com/problems/maximum-average-subarray-i/description/?envType=study-plan-v2&envId=leetcode-75">Maximum Average Subarray I</a>
 */
public class MaximumAverageSubarrayI {

    public static double findMaxAverage(int[] nums, int k) {
        double sum = 0;
        for (int l = 0; l < k; l++) {
            sum += nums[l];
        }

        double maxAverage = sum / k;
        for (int j = k; j < nums.length; j++) {
            sum = sum + nums[j] - nums[j - k];
            maxAverage = Math.max(maxAverage, sum / k);
        }

        return maxAverage;
    }

    static void main() {
        int[] nums = {1, 12, -5, -6, 50, 3};
        System.out.println(findMaxAverage(nums, 4));
    }
}
