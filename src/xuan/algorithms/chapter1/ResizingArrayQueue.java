package xuan.algorithms.chapter1;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Created by Xuan on 2017/7/24.
 *
 * 变长数组实现队列（循环存储）
 */
public class ResizingArrayQueue<Item> implements Iterable<Item>{
    private Item[] a;
    private int n;
    private int first;
    private int last;

    public ResizingArrayQueue() {
        a = (Item[]) new Object[2];
        n=0;
        first=0;
        last = 0;
    }

    public boolean isEmpty() {
        return n == 0;
    }

    public int size() {
        return n;
    }

    public void enqueue(Item item) {
        if (n == a.length) {
            resize(2 * a.length);
        }
        a[last++] = item;
        if (last == a.length) {
            last = 0;
        }
        n++;
    }

    public Item dequeue() {
        if (n == 0) {
            throw new NoSuchElementException("Queue Overflow");
        }
        Item item = a[first++];
        a[first - 1] = null;
        if (first == a.length) {
            first = 0;
        }
        n--;
        if (n > 0 && n == a.length / 4) {
            resize(a.length / 2);
        }
        return item;
    }

    public Item peek() {
        if (n == 0) {
            throw new NoSuchElementException("Queue Overflow");
        }
        return a[first];
    }



    private void resize(int max) {
        assert max >= n;
        Item[] temp = (Item[]) new Object[max];
        for(int i=0;i<n;i++) {
            temp[i] = a[(first + i) % a.length];
        }
        a = temp;
        first=0;
        last = n;
    }

    @Override
    public Iterator<Item> iterator() {
        return new Iterator<Item>() {
            private int i = 0;

            @Override
            public boolean hasNext() {
                return i < n;
            }

            @Override
            public Item next() {
                if (!hasNext()) throw new NoSuchElementException();
                Item item = a[(first + i) % a.length];
                i++;
                return item;
            }
        };
    }

    public static void main(String[] args) {
        ResizingArrayQueue rq = new ResizingArrayQueue();
        rq.enqueue("- ");
        rq.enqueue("to ");
        rq.enqueue("be ");
        rq.dequeue();
        rq.enqueue("or ");
        rq.enqueue("not ");
        rq.enqueue("to ");
        rq.enqueue("be");
        Iterator iterator = rq.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next());
        }
    }
}
