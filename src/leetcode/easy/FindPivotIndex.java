package leetcode.easy;

public class FindPivotIndex {
    public static int pivotIndex(int[] nums) {

        int[] prefixSum = new int[nums.length + 1];

        for (int i = 0; i < nums.length; i++) {
            prefixSum[i + 1] = prefixSum[i] + nums[i];
        }


        return prefixSum[6] - prefixSum[5 - 1];
    }

    static void main() {
        int[] nums = {1, 7, 3, 6, 5, 6};
        System.out.println(pivotIndex(nums));

    }
}
