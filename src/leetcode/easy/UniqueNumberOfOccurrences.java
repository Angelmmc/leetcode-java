package leetcode.easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 1207.
 * <a href="https://leetcode.com/problems/unique-number-of-occurrences/">Unique Number of Occurrences</a>
 */
@SuppressWarnings("DuplicatedCode")
public class UniqueNumberOfOccurrences {

    public static boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> occurrences = new HashMap<>();
        for (int a : arr) {
            if (occurrences.containsKey(a)) {
                occurrences.put(a, occurrences.get(a) + 1);
            } else {
                occurrences.put(a, 1);
            }
        }

        Set<Integer> uniqueOccurrences = new HashSet<>();
        for (Integer occurrence : occurrences.values()) {
            if (uniqueOccurrences.contains(occurrence)) {
                return false;
            }
            uniqueOccurrences.add(occurrence);
        }
        return true;
    }

    static void main() {
        int[] arr1 = {1, 2, 2, 1, 1, 3};
        int[] arr2 = {1, 2};
        int[] arr3 = {-3, 0, 1, -3, 1, 1, 1, -3, 10, 0};

        System.out.println(uniqueOccurrences(arr1));
        System.out.println(uniqueOccurrences(arr2));
        System.out.println(uniqueOccurrences(arr3));
    }
}
