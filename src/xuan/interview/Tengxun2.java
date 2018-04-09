package xuan.interview;

import java.util.Scanner;

public class Tengxun2 {
    public static void main(String[] args) {
        int k = 0;
        int A = 0;
        int B = 0;
        int numa = 0;
        int numb = 0;
        long count = 0;
        Scanner in = new Scanner(System.in);
        k = in.nextInt();
        A = in.nextInt();
        numa = in.nextInt();
        B = in.nextInt();
        numb = in.nextInt();
        if (k > (A * numa + B * numb)) {
            System.out.println(0);
            return;
        }
        for (int i = 0; i <= k / A; i++) {
            if ((k - (i * A)) % B == 0) {
                if (i < numa) {
                    int j = (k - (i * A)) / B;
                    if (j < numb) {
                        long counta = 1;
                        long countb = 1;
                        for (int m1 = numa - i + 1; m1 <= numa; m1++) {
                            counta *= m1;
                        }
                        for (int m2 = numb - j + 1; m2 <= numb; m2++) {
                            countb *= m2;
                        }
                        count += (counta * countb);
                    }
                }
            }
        }
        System.out.println(count%1000000007);
    }
}
