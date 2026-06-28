package leetcode.easy;

public class IsSubsequence {

    public static boolean solution(String s, String t) {
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (int i = 0, j = 0; i < tChars.length && j < sChars.length; i++) {
            if (sChars[j] == tChars[i]) {
                sb.append(tChars[i]);
                j++;
            }
        }
        return s.contentEquals(sb);
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
