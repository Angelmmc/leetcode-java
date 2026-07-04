package leetcode.medium;

/**
 * 11.
 * <a href="https://leetcode.com/problems/container-with-most-water/submissions/2056039025/?envType=study-plan-v2&envId=leetcode-75">Container With Most Water</a>
 */
public class ContainerWithMostWater {

    public static int solution(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int maxArea = 0;

        while (i < j) {
            int auxArea = (j - i) * (Math.min(height[i], height[j]));

            if (auxArea > maxArea) {
                maxArea = auxArea;
            }

            if (height[j] > height[i]) {
                i++;
            } else {
                j--;
            }
        }

        return maxArea;
    }

    static void main() {
        int[] height1 = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int[] height2 = {1, 2};
        int[] height3 = {5, 5, 5, 5};
        int[] height4 = {1, 2, 3, 4, 5};
        int[] height5 = {5, 4, 3, 2, 1};
        int[] height6 = {1, 2, 10, 2, 1};
        int[] height7 = {10, 1, 1, 1, 10};
        int[] height8 = {0, 0, 0, 0, 0};
        int[] height9 = {0, 2, 0, 4, 0};
        int[] height10 = {1, 100, 1};
        int[] height11 = {10000, 10000};
        int[] height12 = {2, 3, 4, 5, 18, 17, 6};

        System.out.println(solution(height1));
        System.out.println(solution(height2));
        System.out.println(solution(height3));
        System.out.println(solution(height4));
        System.out.println(solution(height5));
        System.out.println(solution(height6));
        System.out.println(solution(height7));
        System.out.println(solution(height8));
        System.out.println(solution(height9));
        System.out.println(solution(height10));
        System.out.println(solution(height11));
        System.out.println(solution(height12));
    }
}
