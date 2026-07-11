package leetcode.medium;

/**
 * 1546.
 * <a href="https://leetcode.com/problems/maximum-number-of-vowels-in-a-substring-of-given-length">
 * Maximum Number of Vowels in a Substring of Given Length</a>
 */
public class MaximumNumberOfVowelsInASubstringOfGivenLength {
    public static int maxVowels(String s, int k) {
        int maxVowels = 0;
        char[] chars = s.toCharArray();
        for (int i = 0; i < k; i++) {
            if (isVowel(chars[i])) {
                maxVowels++;
            }
        }

        int currentVowels = maxVowels;
        for (int i = k; i < chars.length; i++) {
            if (isVowel(chars[i - k])) {
                currentVowels--;
            }
            if (isVowel(chars[i])) {
                currentVowels++;
            }
            if (currentVowels > maxVowels) {
                maxVowels = currentVowels;
            }
        }

        return maxVowels;
    }

    private static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    static void main() {
        System.out.println(maxVowels("abciiidef", 3));
        System.out.println(maxVowels("aeiou", 2));
        System.out.println(maxVowels("leetcode", 3));
        System.out.println(maxVowels("rhythms", 4));
        System.out.println(maxVowels("a", 1));
        System.out.println(maxVowels("b", 1));
        System.out.println(maxVowels("aaaaa", 3));
        System.out.println(maxVowels("abcde", 5));
        System.out.println(maxVowels("bbbbba", 1));
        System.out.println(maxVowels("bbbbba", 5));
        System.out.println(maxVowels("aeiou", 5));
        System.out.println(maxVowels("bcdfg", 5));
        System.out.println(maxVowels("abababab", 2));
    }
}
