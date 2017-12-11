package xuan.algorithms.chapter1;

/**
 * Created by Xuan on 2017/7/20.
 */
public class Exercise124 {
    public static void main(String[] args) {
        String string1 = "hello";
        String string2 = string1;
        string1 = "world";
        System.out.println(string1);//world
        System.out.println(string2);//hello

        String string3 = new String("string3");
        String string4 = string3;
        string3 = "newstring3";
        System.out.println(string3);
        System.out.println(string4);

        String s = "Hello World";
        System.out.println(s.toUpperCase());//生成新的字符串，不改变原字符串的值
        System.out.println(s.substring(6, 11));//生成新的字符串，不改变原字符串的值
        System.out.println(s);//Hello World

        int[] a = {1, 2, 3, 4};
        int i;
        for (i = 0; a[i] != 4; i++) ;//注意这里的分号
        System.out.println(i);
    }
}
