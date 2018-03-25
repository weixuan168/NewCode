package xuan.interview;

import java.util.Scanner;
import java.util.Stack;

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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        System.out.println(findLargest01(s));
    }
}
