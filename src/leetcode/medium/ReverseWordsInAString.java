package leetcode.medium;

/**
 * 151. Reverse Words in a String
 * <a href="https://leetcode.com/problems/reverse-words-in-a-string">Source</a>
 */
public class ReverseWordsInAString {

    public static String solution(String s) {
        char[] chars = s.toCharArray();
        int j = chars.length - 1;
        StringBuilder resultString = new StringBuilder();

        if (chars.length == 1) {
            return s;
        }

        while (j >= 0) {
            final char SPACE = ' ';

            while (j >= 0 && chars[j] == SPACE) {
                j--;
            }

            int i = j;

            while (i >= 0 && chars[i] != SPACE) {
                i--;
            }

            StringBuilder auxString = new StringBuilder();
            for (int k = i + 1; k <= j; k++) {
                auxString.append(chars[k]);
            }

            j = i;

            if (!resultString.isEmpty() && !auxString.isEmpty()) {
                resultString.append(SPACE);
            }

            resultString.append(auxString);
        }
        return resultString.toString();
    }

    static void main() {
        System.out.println(ReverseWordsInAString.solution("  hello world  "));
    }
}
