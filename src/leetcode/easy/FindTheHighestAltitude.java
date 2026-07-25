package leetcode.easy;

public class FindTheHighestAltitude {
    public static int largestAltitude(int[] gain) {
        int maxAltitude = 0;
        int currentAltitude = 0;

        for (int j : gain) {
            currentAltitude += j;
            if (currentAltitude > maxAltitude) {
                maxAltitude = currentAltitude;
            }
        }
        return maxAltitude;
    }

    static void main() {

        int[] gain1 = {-5, 1, 5, 0, -7};
        int[] gain2 = {0, -4, -7, -9, -10, -6, -3, -1};

        System.out.println(largestAltitude(gain1));
        System.out.println(largestAltitude(gain2));

    }
}
