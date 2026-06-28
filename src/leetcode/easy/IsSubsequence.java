package leetcode.easy;

/**
 * 392.
 * <a href="https://leetcode.com/problems/is-subsequence/description/?envType=study-plan-v2&envId=leetcode-75">Is Subsequence</a>
 */
public class IsSubsequence {

    public static boolean solution(String s, String t) {
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        int j = 0;
        for (int i = 0; i < tChars.length && j < sChars.length; i++) {
            if (sChars[j] == tChars[i]) {
                j++;
            }
        }
        return j == sChars.length;
    }

    static void main() {
        System.out.println(solution("abc", "ahbgdc"));
        System.out.println(solution("axc", "ahbgdc"));
        System.out.println(solution("", "anything"));
        System.out.println(solution("a", ""));
        System.out.println(solution("", ""));
        System.out.println(solution("aabb", "aaabbb"));
        System.out.println(solution("abac", "aba"));
        System.out.println(solution("abc", "acbca"));
        System.out.println(solution("aaaaa", "a".repeat(10000)));
        System.out.println(solution("pollito", "-p-o-l-l-i-t-o-"));
    }
}
