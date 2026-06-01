package leetcode.easy;

import java.util.Arrays;

/**
 * 2144. Minimum Cost of Buying Candies With Discount
 * <a href="https://leetcode.com/problems/minimum-cost-of-buying-candies-with-discount/description/?envType=daily-question&envId=2026-06-01">Source</a>
 */
public class MinimumCostOfBuyingCandiesWithDiscount {

    public static int solution(int[] cost) {
        Arrays.sort(cost);
        int minimumCost = 0;
        int candiesPaid = 0;

        for (int i = cost.length - 1; i >= 0; i--) {
            if (candiesPaid != 2) {
                minimumCost += cost[i];
                candiesPaid++;
            } else {
                candiesPaid = 0;
            }
        }
        return minimumCost;
    }

    static void main() {
        int[] cost = {7, 6, 78, 85, 23, 34, 78, 99, 56, 33, 1};
        System.out.println(solution(cost));
    }
}
