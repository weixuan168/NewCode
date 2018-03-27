package xuan.interview;

import java.util.Scanner;
import java.util.Stack;

/**
 * 如果一个01串任意两个相邻位置的字符都是不一样的,我们就叫这个01串为交错01串。例如: "1","10101","0101010"都是交错01串。
 小易现在有一个01串s,小易想找出一个最长的连续子串,并且这个子串是一个交错01串。小易需要你帮帮忙求出最长的这样的子串的长度是多少。

 思路：1. 遍历字符串，用栈来数交错01串，遇到不是交错的就全部倒出，重新数。
      2. 不用栈，直接数，用一个数来记录最终结果，用另一个数来记录中间结果。
 */
public class WangyiTest2 {
    public static int findLargest01(String s) {
        Stack<String> stack = new Stack<>();
        int num = 0;
        stack.push(s.substring(0, 1));
        for (int i = 1; i < s.length(); i++) {
            if (s.substring(i, i + 1).equals(stack.peek())) {
                if (stack.size() > num) {
                    num = stack.size();
                }
                while (!stack.isEmpty()) {
                    stack.pop();
                }
            }
            stack.push(s.substring(i, i + 1));
        }
        return stack.size() > num ? stack.size() : num;
    }

    public static int anotherFindLargest01(String s) {
        int num=1;
        int len=1;
        for(int i=0;i<s.length()-1;i++) {
            if (s.substring(i, i + 1).equals(s.substring(i + 1, i + 2))) {
                if (len > num) {
                    num = len;
                }
                len = 1;
            } else {
                len++;
            }
        }
        return len > num ? len : num;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        System.out.println(anotherFindLargest01(s));
    }
}
