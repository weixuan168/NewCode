package xuan.interview;

import java.util.Scanner;

/**
 * 小易为了向他的父母表现他已经长大独立了,他决定搬出去自己居住一段时间。
 * 一个人生活增加了许多花费: 小易每天必须吃一个水果并且需要每天支付x元的房屋租金。
 * 当前小易手中已经有f个水果和d元钱,小易也能去商店购买一些水果,商店每个水果售卖p元。
 * 小易为了表现他独立生活的能力,希望能独立生活的时间越长越好,小易希望你来帮他计算一下他最多能独立生活多少天。
 *
 * 思路：设能独立生活t天，满足xt<=d和 xt+(t-f)*p<=d，直接算t即可。
 * 注意：int类型溢出
 */
public class WangyiTest5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long x = scanner.nextInt();
        long f = scanner.nextInt();
        long d = scanner.nextInt();
        long p = scanner.nextInt();
        long t1 = Math.floorDiv(d, x);
        long t2 = (long) Math.floor((d + f * p) / (x + p));
        System.out.println(t1 < t2 ? t1 : t2);
    }
}
