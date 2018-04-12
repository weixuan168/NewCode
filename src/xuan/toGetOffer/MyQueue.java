package xuan.toGetOffer;

import java.util.Stack;

/**
 * Created by xuanwei on 2018/4/12.
 * 第7题。用两个栈实现队列，并实现appendTail和deleteHead函数，即在队列尾部插入结点和在队列头部删除结点。
 */
public class MyQueue<Item> {

    private Stack<Item> stack1;
    private Stack<Item> stack2;

    private int length;

    public MyQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
        length = 0;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public void appendTail(Item item) {
        stack1.push(item);
        length++;
    }

    public Item deleteHead() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        if (stack2.isEmpty()) {
            return null;
        }
        length--;
        return stack2.pop();
    }

    public static void main(String[] args) {
        MyQueue<String> stringMyQueue = new MyQueue<>();
        stringMyQueue.appendTail("1");
        stringMyQueue.appendTail("2");
        System.out.println(stringMyQueue.deleteHead());
        System.out.println(stringMyQueue.deleteHead());
        stringMyQueue.appendTail("3");
        stringMyQueue.appendTail("4");
        System.out.println(stringMyQueue.deleteHead());
        stringMyQueue.appendTail("5");
        System.out.println(stringMyQueue.deleteHead());
        System.out.println(stringMyQueue.deleteHead());
        System.out.println(stringMyQueue.deleteHead());
    }
}
