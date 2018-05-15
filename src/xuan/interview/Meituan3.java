package xuan.interview;

import java.util.ArrayList;
import java.util.Scanner;

public class Meituan3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < T; i++) {
            int m = in.nextInt();
            int n = in.nextInt();
            int k = in.nextInt();

            int p = (int)Math.ceil(1.0*m/k);
            int q = (int)Math.ceil(1.0*n/k);
            result.add(p*q);
        }
        for (int r :
                result) {
            System.out.println(r);
        }
    }
}
