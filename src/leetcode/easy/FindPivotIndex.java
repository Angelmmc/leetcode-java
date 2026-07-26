package leetcode.easy;

/**
 * 724.
 * <a href="https://leetcode.com/problems/find-pivot-index/description/?envType=study-plan-v2&envId=leetcode-75">Find Pivot Index</a>
 */
public class FindPivotIndex {
    public static int pivotIndex(int[] nums) {
        int[] prefixSum = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            prefixSum[i + 1] = prefixSum[i] + nums[i];
        }

        for (int i = 1; i <= nums.length; i++) {
            int leftSum = prefixSum[i - 1];
            int rightSum = prefixSum[nums.length] - prefixSum[i];
            if (leftSum == rightSum) {
                return i - 1;
            }
        }
        return -1;
    }

    static void main() {
        int[] nums1 = {1, 7, 3, 6, 5, 6};
        int[] nums2 = {1, 2, 3};
        int[] nums3 = {2, 1, -1};
        int[] nums4 = {1, 2, 3, 4, 5};
        int[] nums5 = {10};
        int[] nums6 = {0, 0, 0};
        int[] nums7 = {-1, -1, 0, 1, 1, 0};


        System.out.println(pivotIndex(nums1));
        System.out.println(pivotIndex(nums2));
        System.out.println(pivotIndex(nums3));
        System.out.println(pivotIndex(nums4));
        System.out.println(pivotIndex(nums5));
        System.out.println(pivotIndex(nums6));
        System.out.println(pivotIndex(nums7));
    }
}
