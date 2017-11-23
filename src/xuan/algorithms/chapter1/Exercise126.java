package xuan.algorithms.chapter1;

/**
 * 判断两个字符串是否为回环变位
 */
public class Exercise126 {
    /**
     * 遍历t，各位置截断重组，与s比较
     *
     * @param s
     * @param t
     * @return
     */
    public static boolean judgeCircularRotation1(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        for (int i = 0; i < t.length(); i++) {
            String temp = t.substring(i, t.length()) + t.substring(0, i);
            if (temp.equals(s)) {
                return true;
            }
        }
        return false;
    }

    /**
     * 若s与t互为回环变位，则将t与其自身连接，一定会包含s
     *
     * @param s
     * @param t
     * @return
     */
    public static boolean judgeCircularRotation2(String s, String t) {
        //写法一
        return (s.length() == t.length()) && ((t + t).contains(s));
    }

    public static boolean judgeCircularRotation3(String s, String t) {
        //写法二
        //如果string1中不包含string2，则string1.indexof(string2)返回-1
        return (s.length() == t.length()) && (t.concat(t).indexOf(s) >= 0);
    }

    public static void main(String[] args) {
        String s = "ACTGACG";
        String t = "TGACGAC";
        System.out.println(judgeCircularRotation1(s, t));
        System.out.println(judgeCircularRotation2(s, t));
        System.out.println(judgeCircularRotation3(s, t));


    }
}
