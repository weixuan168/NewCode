package xuan.algorithms.chapter1;

import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdIn;

/**
 * Created by Xuan on 2017/7/24.
 * <p>
 * 中序（缀）表达式转后序（缀）表达式
 * 注意：中序表达式的括号不是完全的，不要仅依赖右括号来判断
 */
public class Exercise1310 {

    public static void InfixToPostfix(String s) {
        Stack<String> ops = new Stack<>();   //存放操作符
        Stack<String> val = new Stack<>();   //存放中间结果
        for (int i = 0; i < s.length(); i++) {
            //从左至右扫描中缀表达式
            String ss = s.substring(i, i + 1);

            //遇到左括号，入ops栈
            if (ss.equals("(")) ops.push(ss);

                //遇到右括号，则一直弹出，直到遇到左括号
            else if (ss.equals(")")) {
                while (!ops.peek().equals("(")) {
                    String tmp = val.pop();
                    val.push(val.pop() + tmp + ops.pop());
                }
                ops.pop();
            }
            //遇到算数运算符
            else if (ss.equals("+") || ss.equals("-") || ss.equals("*") || ss.equals("/")) {
                compareOperator(ss,ops,val);
            }
            //遇到操作数，入栈
            else
                val.push(ss);
        }
        //处理操作符栈中剩下的元素
        while (!ops.isEmpty()) {
            String string = val.pop();
            val.push(val.pop() + string + ops.pop());
        }
        System.out.println(val.pop());
    }

    private static void compareOperator(String ss, Stack<String> ops, Stack<String> val) {
        //若操作符栈空，则入栈
        if (ops.isEmpty()) {
            ops.push(ss);
        } else {
            //若当前操作符优先级大于栈顶操作符，或者栈顶为左括号，则入栈
            boolean b1 = ops.peek().equals("(");
            boolean b2 = (ss.equals("*") || ss.equals("/")) && (ops.peek().equals("+") || ops.peek().equals("-"));
            if (b1 || b2) {
                ops.push(ss);
            } else {
                //否则，弹出val两个，ops一个，构造表达式压入val
                String s1 = val.pop();
                val.push(val.pop() + s1 + ops.pop());
                compareOperator(ss,ops,val);
            }
        }
    }

    public static void main(String[] args) {
        //约定输入没有空格
//        String s = StdIn.readString();
//        InfixToPostfix(s);
        InfixToPostfix("1+2*3+4/3");
        InfixToPostfix("3*(1+2+3)");
    }
}
