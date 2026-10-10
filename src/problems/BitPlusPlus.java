package problems;

import java.util.Scanner;

/**
 * <a href="https://codeforces.com/contest/282/problem/A">A. Bit++</a>
 */
public class BitPlusPlus {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int numStatements = sc.nextInt();
        sc.nextLine();
        String[] statements = new String[numStatements];
        for (int i = 0; i < numStatements; i++) {
            statements[i] = sc.nextLine();
        }

        int x = 0;
        for (String s : statements) {
            if (s.contains("++")) {
                x += 1;
            } else {
                x -= 1;
            }
        }
        System.out.println(x);
        sc.close();
    }
}
