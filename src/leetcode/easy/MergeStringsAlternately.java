package leetcode.easy;

/**
 * Source:
 * <a href="https://leetcode.com/problems/merge-strings-alternately/description/?envType=study-plan-v2&envId=leetcode-75">LeetCode</a>
 *
 */
public class MergeStringsAlternately {
    public static String solution(String word1, String word2) {
        int length1 = word1.length();
        int length2 = word2.length();
        int minLength = Math.min(length1, length2);
        boolean notEqualLength = length1 != length2;
        String complementString = null;
        StringBuilder returnString = new StringBuilder();

        if (notEqualLength) {
            int diff = Math.abs(length1 - length2);
            complementString = length1 < length2 ? word2.substring(length2 - diff) : word1.substring(length1 - diff);
        }

        int i = 0;
        while (i < minLength) {
            returnString.append(word1.charAt(i));
            returnString.append(word2.charAt(i));
            i++;
        }

        return complementString != null ? returnString.append(complementString).toString() : returnString.toString();
    }

    static void main() {
        System.out.println(MergeStringsAlternately.solution("abcd", "pq"));
    }
}