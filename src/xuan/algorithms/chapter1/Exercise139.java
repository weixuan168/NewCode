package xuan.algorithms.chapter1;

import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdIn;

/**
 * Created by Xuan on 2017/7/24.
 *
 * 补全左括号
 */
public class Exercise139 {

    public static void complete(String s) {
        Stack<String> ops = new Stack<>();
        Stack<String> val = new Stack<>();
        for(int i=0;i<s.length();i++) {
            String ss = s.substring(i, i + 1);
            if (ss.equals("+") || ss.equals("-") || ss.equals("*") || ss.equals("/")) {
                ops.push(ss);
            } else if (ss.equals(")")) {
                String s1 = val.pop();
                val.push("(" + val.pop() + ops.pop() + s1 + ")");
            }
            else
            val.push(ss);
        }
//        for (String st : val) {
//            System.out.println(st);
//        }
        System.out.println(val.pop());
    }

    public static void main(String[] args) {
        //约定输入没有空格
        String s = StdIn.readString();
        complete(s);

    }
}
