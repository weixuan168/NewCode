package xuan.interview;

import java.util.Scanner;

public class Tengxun1 {
    public static void main(String[] args) {
        long n = 0;
        long m = 0;
        Scanner in = new Scanner(System.in);
        n = in.nextLong();
        m = in.nextLong();
        long sum1 = 0;
        long sum2 = 0;
        for (long i = 1; i < n; i += 2 * m) {
            for (long j = 0; j < m; j++) {
                sum1 += i + j;
            }
        }
        for (long i = m + 1; i <= n; i += 2 * m) {
            for (long j = 0; j < m; j++) {
                sum2 += i + j;
            }
        }
        System.out.print(sum2 - sum1);
    }
}
