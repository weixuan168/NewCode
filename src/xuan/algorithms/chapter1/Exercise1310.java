package xuan.algorithms.chapter1;

import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdIn;

/**
 * Created by Xuan on 2017/7/24.
 *
 * 中序（缀）表达式转后序（缀）表达式
 * 注意：中序表达式的括号不是完全的，不要仅依赖右括号来判断
 */
public class Exercise1310 {

    public static void InfixToPostfix(String s) {
        Stack<String> ops = new Stack<>();
        Stack<String> val = new Stack<>();
        for(int i=0;i<s.length();i++) {
            String ss = s.substring(i, i + 1);
            if(ss.equals("(")) ;
            else if (ss.equals("+") || ss.equals("-") || ss.equals("*") || ss.equals("/")) {
                if (ops.isEmpty())  ops.push(ss);
                else if (ss.equals("+") || ss.equals("-")) {
                    String s1 = val.pop();
                    val.push( val.pop() +s1+ ops.pop() );
                    ops.push(ss);
                } else if ((ss.equals("*") || ss.equals("/")) && (ops.peek().equals("+") || ops.peek().equals("-"))) {
                    ops.push(ss);
                } else if ((ss.equals("*") || ss.equals("/")) && (ops.peek().equals("*") || ops.peek().equals("/"))) {
                    String s1 = val.pop();
                    val.push( val.pop() +s1+ ops.pop() );
                    ops.push(ss);
                }
                } else {
                    if (ss.equals(")")) {
                        String s1 = val.pop();
                        val.push(val.pop() + s1 + ops.pop());
                    } else
                        val.push(ss);
                }
        }
//        for (String st : val) {
//            System.out.println(st);
//        }
        while (!ops.isEmpty()) {
            String string = val.pop();
            val.push(val.pop() + string + ops.pop());
        }

        System.out.println(val.pop());
    }

    public static void main(String[] args) {
        //约定输入没有空格
        String s = StdIn.readString();
        InfixToPostfix(s);
    }
}
