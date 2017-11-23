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

        String s = "Hello World";
        s.toUpperCase();
        s.substring(6, 11);
        System.out.println(s);//Hello World
    }
}
