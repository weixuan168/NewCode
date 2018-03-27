package xuan.interview;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 小易有一些彩色的砖块。每种颜色由一个大写字母表示。各个颜色砖块看起来都完全一样。
 现在有一个给定的字符串s,s中每个字符代表小易的某个砖块的颜色。小易想把他所有的砖块排成一行。
 如果最多存在一对不同颜色的相邻砖块,那么这行砖块就很漂亮的。请你帮助小易计算有多少种方式将他所有砖块排成漂亮的一行。
 例如: s = "ABAB",那么小易有六种排列的结果:
 "AABB","ABAB","ABBA","BAAB","BABA","BBAA"
 其中只有"AABB"和"BBAA"满足最多只有一对不同颜色的相邻砖块。

 思路：看字符串中有多少种字符，有两种字符就有两种排列，有一种字符自然就是一种排列，剩下的都不可能符合要求。
 */
public class WangyiTest3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        Set<String> set = new HashSet<>();
        for(int i=0;i<s.length();i++) {
            set.add(s.substring(i, i + 1));
        }
        switch (set.size()) {
            case 0:
                System.out.println(0);
                return;
            case 1:
                System.out.println(1);
                return;
            case 2:
                System.out.println(2);
                return;
            default:
                System.out.println(0);
                return;
        }
    }
}
