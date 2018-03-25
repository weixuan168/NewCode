package xuan.interview;

import java.util.Scanner;

public class WangyiTest5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long x = scanner.nextInt();
        long f = scanner.nextInt();
        long d = scanner.nextInt();
        long p = scanner.nextInt();
        long t1 = Math.floorDiv(d, x);
        int t2 = (int)Math.floor((d + f * p)/(x + p));
        System.out.println(t1 < t2 ? t1 : t2);
    }
}
