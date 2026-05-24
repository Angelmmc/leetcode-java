package leetcode.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Source: <a href="https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/description/?envType=study-plan-v2&envId=leetcode-75">Kids With the Greatest Number of Candies</a>
 */
public class KidsWithTheGreatestNumberOfCandies {
    public static List<Boolean> solution(int[] candies, int extraCandies) {

        int greatestCandies = 0;

        for (int candy : candies) {
            if (candy > greatestCandies) {
                greatestCandies = candy;
            }
        }

        List<Boolean> result = new ArrayList<>();

        for (int candy : candies) {
            result.add(candy + extraCandies >= greatestCandies);
        }

        return result;
    }

    static void main() {
        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;
        System.out.println(solution(candies, extraCandies));
    }
}