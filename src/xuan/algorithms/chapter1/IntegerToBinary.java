package xuan.algorithms.chapter1;

import java.util.Scanner;

/**
 * Created by Xuan on 2017/6/23.
 */
public class IntegerToBinary {
    public static void main(String[] args) {
        System.out.println('b'); //b
        System.out.println('b' + 'c'); //197
        System.out.println((char)('a'+4)); //e


        //十进制转二进制（方法一）
        System.out.println("请输入一个正整数：");
        Scanner scanner = new Scanner(System.in);
        StringBuilder s = new StringBuilder();
        int num = scanner.nextInt();
        while (num != 0) {
            s.append(num % 2);
            num = num / 2;
        }
        System.out.println(s.reverse().toString());

        //十进制转二进制（方法二）
        System.out.println("请输入一个正整数：");
        String ss = "";
        int num1 = scanner.nextInt();
        for(int n=num1;n>0;n/=2) {
            ss= (n % 2) + ss;
        }
        System.out.println(ss);
        scanner.close();

        //十进制转二进制（方法三）
        //用栈
    }



}
