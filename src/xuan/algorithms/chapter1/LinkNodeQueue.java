package xuan.algorithms.chapter1;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Created by Xuan on 2017/8/7.
 * 用环形链表实现队列，只能使用一个Node类型的实例变量last。
 */
public class LinkNodeQueue<Item> implements Iterable<Item> {
    private Node last;
    private int N;

    private class Node {
        Item item;
        Node next;
    }


    public void enqueue(Item item) {
//        System.out.println("enqueue");
        Node node = new Node();
        node.item = item;
        if (N == 0) {
            node.next = node;
        } else {
            node.next = last.next;
            last.next = node;
        }
        last = node;
        N++;
    }

//    //循环链表入栈的写法
//    public void enqueue(Item item) {
////        System.out.println("enqueue");
//        Node node = new Node();
//        node.item = item;
//        if (N == 0) {
//            node.next = node;
//            last = node;
//        } else {
//            node.next = last.next;
//            last.next = node;
//        }
//        N++;
//    }

    public Item dequeue() {
//        System.out.println("dequeue");
        if (N == 0) {
            throw new NoSuchElementException("Queue Overflow");
        }
        Item item = last.next.item;
        last.next = last.next.next;
        N--;
        return item;
    }

    public Item peek() {
//        System.out.println("peek");
        if (N == 0) {
            throw new NoSuchElementException("Queue Overflow");
        }
        return last.next.item;
    }

    public int size() {
        return N;
    }

    public boolean isEmpty() {
        return N == 0;
    }

    @Override

    public Iterator<Item> iterator() {
        return new Iterator<Item>() {
            int i = N;
            Node node = last;
            @Override
            public boolean hasNext() {
                return i > 0;
            }

            @Override
            public Item next() {
                Item item = node.next.item;
                node.next = node.next.next;
                i--;
                return item;
            }
        };
    }

    public static void main(String[] args) {
        LinkNodeQueue queue = new LinkNodeQueue();
        queue.enqueue("--");
//        System.out.println(queue.peek());
        queue.enqueue("to");
//        System.out.println(queue.peek());
        queue.enqueue("be");
        queue.enqueue("or");
        queue.dequeue();
        queue.enqueue("not");
        queue.enqueue("to");
        queue.enqueue("be");
        Iterator iterator = queue.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
