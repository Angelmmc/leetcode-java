package leetcode.easy;

import java.util.*;

/**
 * 345. Reverse Vowels of a String
 * <a href="https://leetcode.com/problems/reverse-vowels-of-a-string/description/?envType=study-plan-v2&envId=leetcode-75">Source</a>
 */
public class ReverseVowelsOfAString {

    static Set<Character> vowels = Set.of('A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u');

    public static String solution(String s) {
        int vowelCount = 0;
        for (int i = 0; i < s.length(); i++) {
            if (vowels.contains(s.charAt(i))) {
                vowelCount++;
            }
        }

        int[] replacementPositions = new int[vowelCount];
        char[] foundVowels = new char[vowelCount];
        int positionIndex = 0;
        int vowelIndex = 0;
        for (int i = 0, j = s.length() - 1; i < s.length(); i++, j--) {
            if (vowels.contains(s.charAt(i))) {
                foundVowels[vowelIndex] = s.charAt(i);
                vowelIndex++;

            }
            if (vowels.contains(s.charAt(j))) {
                replacementPositions[positionIndex] = j;
                positionIndex++;
            }
        }

        StringBuilder returnString = new StringBuilder(s);
        for (int i = 0; i < foundVowels.length; i++) {
            returnString.setCharAt(replacementPositions[i], foundVowels[i]);
        }
        return returnString.toString();
    }

    static void main() {
        System.out.println(solution("IceCreAm"));
    }
}
