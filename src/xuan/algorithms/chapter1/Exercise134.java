package xuan.algorithms.chapter1;

import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdIn;

/**
 * Created by Xuan on 2017/7/24.
 *
 * 判定括号配对是否完整
 */
public class Exercise134 {
    public static boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++) {
            char c = s.charAt(i);
            if (c=='{'||c=='['||c=='(') stack.push(c);
            else if (c==')') {
                if(stack.isEmpty()||!stack.pop().equals('(')) return false;
            }
            else if (c==']') {
                if(stack.isEmpty()||!stack.pop().equals('[')) return false;
            }
            else if (c=='}') {
                if(stack.isEmpty()||!stack.pop().equals('{')) return false;
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        //约定输入没有空格
        String s = StdIn.readString();
        System.out.println(isBalanced(s));

    }
}
