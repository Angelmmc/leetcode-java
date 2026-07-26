package leetcode.easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * 2215.
 * <a href="https://leetcode.com/problems/find-the-difference-of-two-arrays/">Find the Difference of Two Arrays</a>
 */
public class FindTheDifferenceOfTwoArrays {

    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        for (int n : nums1) {
            set1.add(n);
        }

        HashSet<Integer> set2 = new HashSet<>();
        for (int n : nums2) {
            set2.add(n);
        }

        List<Integer> list1 = new ArrayList<>();
        for (int n : set1) {
            if (!set2.contains(n)) {
                list1.add(n);
            }
        }

        List<Integer> list2 = new ArrayList<>();
        for (int n : set2) {
            if (!set1.contains(n)) {
                list2.add(n);
            }
        }

        List<List<Integer>> resultList = new ArrayList<>();
        resultList.add(list1);
        resultList.add(list2);
        return resultList;
    }

    static void main() {
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {2, 4, 6};
        int[] nums3 = {1, 2, 3, 3};
        int[] nums4 = {1, 1, 2, 2};

        System.out.println(findDifference(nums1, nums2));
        System.out.println(findDifference(nums3, nums4));
    }
}
