package xuan.interview;

import java.util.Stack;

/**
 * Created by Xuan on 2017/12/19.
 * 2017.12.18百度面试题：单链表逆序输出
 */
public class ReverseSingleList<Item> {
    Node first;

    class Node{
        Item item;
        Node next;
    }

    public void createLinkList(Item[] x) {
        for (Item item : x) {
            Node node = new Node();
            node.item = item;
            node.next = first;
            first = node;
        }
    }

    public void printLinkList() {
        Node tmp = first;
        while (tmp!= null) {
            System.out.print(tmp.item + " ");
            tmp = tmp.next;
        }
    }

    /**
     * 用栈实现链表的逆序输出
     */
    public void reversePrintLinkList() {
        Stack<Item> stack = new Stack<>();
        Node tmp = first;
        while (tmp != null) {
            stack.push(tmp.item);
            tmp = tmp.next;
        }
        while (stack.size() > 0) {
            System.out.print(stack.pop() + " ");
        }
    }

    /**
     * 用递归实现链表的逆序输出（也是一个先压栈后出栈的过程）
     */
    public void reversePrintLinkList1() {
        recursion(first);
    }

    private void recursion(Node first) {
        if (first == null) {
            return;
        }
        if (first.next != null) {
            recursion(first.next);
        }
        System.out.print(first.item + " ");
    }
    /**
     * 实现链表反序
     */
    public void reverseLinkList() {
        //如果链表为空或只有一个节点，则逆序还是原来的链表
        if (first == null || first.next == null) {
            return;
        }
        //设定两个相邻的节点one、two，将two指向节点的next设为one。循环。
        Node one = first;
        Node two = one.next;
        Node three = two.next;
        while (three != null) {
            two.next = one;
            one = two;
            two = three;
            three = two.next;
        }
        //调整链表头和链表尾
        first.next = null;
        two.next = one;
        first = two;
    }

    public static void main(String[] args) {
        ReverseSingleList<String> list = new ReverseSingleList<>();
        String[] a = {"a", "b", "c", "d", "e"};
        //构建链表
        list.createLinkList(a);
        //正序输出链表：e d c b a
        list.printLinkList();
        System.out.println();
        //逆序输出链表：a b c d e
        list.reversePrintLinkList1();
        System.out.println();
        //将链表逆序
        list.reverseLinkList();
        //输出逆序后的链表：a b c d e
        list.printLinkList();


    }
}
