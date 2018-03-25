package xuan.interview;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

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
