package xuan.toGetOffer;

import java.util.Stack;

/**
 * 面试题5：
 * <p>
 * 输入一个链表的头结点，从尾到头打印出每个节点的值。
 */
public class ReversePrintList {

    public static void reversPrint(ListNode first) {
        Stack<ListNode> stack = new Stack<>();
        ListNode tmp = first;

        while (tmp != null) {
            stack.push(tmp);
            tmp = tmp.getNext();
        }
        while (!stack.isEmpty()) {
            System.out.println(stack.pop().getValue());
        }
    }

    public static void main(String[] args) {
        reversPrint(null);
        System.out.println("***************************");
        ListNode last = new ListNode(5, null);
        ListNode midian = new ListNode(4, last);
        ListNode first = new ListNode(3, midian);
        reversPrint(first);
    }
}
