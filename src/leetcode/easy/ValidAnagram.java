package leetcode.easy;

import java.util.HashMap;

public class ValidAnagram {

    public static boolean isAnagram(String s, String t) {
        HashMap<String, Integer> mapS = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (mapS.containsKey(String.valueOf(s.charAt(i)))) {
                mapS.put(String.valueOf(s.charAt(i)), mapS.get(String.valueOf(s.charAt(i))) + 1);
            } else {
                mapS.put(String.valueOf(s.charAt(i)), 1);
            }
        }

        HashMap<String, Integer> mapT = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            if (mapT.containsKey(String.valueOf(t.charAt(i)))) {
                mapT.put(String.valueOf(t.charAt(i)), mapT.get(String.valueOf(t.charAt(i))) + 1);
            } else {
                mapT.put(String.valueOf(t.charAt(i)), 1);
            }
        }

        return mapS.equals(mapT);

    }

    public static void main() {

        System.out.println(ValidAnagram.isAnagram("rat", "car"));
        System.out.println(ValidAnagram.isAnagram("amor", "mora"));

    }
}
