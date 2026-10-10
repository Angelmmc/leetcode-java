package problems;

import java.util.Scanner;

/**
 * <a href="https://omegaup.com/arena/problem/Sumando-elementos-opuestos-de-un/#problems">11414.</a> Sumando elementos opuestos de un arreglo
 */
public class AddingOppositeElementsInAnArray {
    static void main() {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] array = new int[n];
            for (int i = 0; i < n; i++) {
                array[i] = sc.nextInt();
            }

            int[] outputNumber = new int[n / 2];
            int i = 0;
            int j = array.length - 1;
            while (i < j) {
                outputNumber[i] = array[i] + array[j];
                i++;
                j--;
            }

            for (int number : outputNumber) {
                System.out.print(number + " ");
            }
        }
    }
}
