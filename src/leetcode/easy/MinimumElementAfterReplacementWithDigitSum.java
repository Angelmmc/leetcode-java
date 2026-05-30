package leetcode.easy;

/**
 * <a href="https://leetcode.com/problems/minimum-element-after-replacement-with-digit-sum/description/?envType=problem-list-v2&envId=dengp0kr">Source: </a>
 */
public class MinimumElementAfterReplacementWithDigitSum {

    public static int Solution(int[] nums) {
        String[] stringNums = intArrayToStringArray(nums);
        return getMinimumElement(stringNums);
    }

    private static String[] intArrayToStringArray(int[] nums) {
        String[] stringNums = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            String string = String.valueOf(nums[i]);
            stringNums[i] = string;
        }
        return stringNums;
    }

    private static int getMinimumElement(String[] nums) {
        int min = Integer.MAX_VALUE;
        for (String s : nums) {
            int sum = 0;
            for (char c : s.toCharArray()) {
                sum += Character.getNumericValue(c);
            }
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
