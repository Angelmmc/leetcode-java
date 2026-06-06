package leetcode.medium;

/**
 * 151. Reverse Words in a String
 * <a href="https://leetcode.com/problems/reverse-words-in-a-string">Source</a>
 */
public class ReverseWordsInAString {

    public static String solution(String s) {
        char[] charArray = s.toCharArray();

        int i = 0;
        int j = charArray.length - 1;

        StringBuilder resultString = new StringBuilder();
        while (i < j) {


            while (charArray[i] == ' ') {
                i++;

            }

            StringBuilder strings = new StringBuilder();
            while (charArray[i] != ' ') {
                strings.append(charArray[i]);
                i++;
            }

            while (charArray[j] == ' ') {
                j--;
            }

            StringBuilder strings2 = new StringBuilder();
            int wordEnd= j;
            while (charArray[j] != ' ') {
                j--;
            }
            int wordBegin = j + 1;

            for (int k = wordBegin; k<= wordEnd; k++) {
                strings2.append(charArray[k]);
            }

            resultString.append(strings2);
            resultString.append(' ');
            resultString.append(strings);

        }

        return resultString.toString();
    }

    static void main() {

        System.out.println(ReverseWordsInAString.solution("hello my good man"));
    }
}
