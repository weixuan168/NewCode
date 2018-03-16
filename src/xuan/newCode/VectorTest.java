package xuan.newCode;

import java.util.Vector;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by xuanwei on 2018/3/16.
 */
public class VectorTest {
    private static Vector<Integer> vector = new Vector<>();

    public static void main(String[] args) {

            for (int i = 0; i < 10; i++) {
                vector.add(i);
            }

        Thread removeThread = new Thread(() -> {
            for (int i1 = 0; i1 < vector.size(); i1++) {
                vector.remove(i1);
            }
        });
        Thread printThread = new Thread(() -> {
            for (int i2 = 0; i2 < vector.size(); i2++) {
                System.out.println(vector.get(i2));
            }
        });
        removeThread.start();
        printThread.start();

        while (Thread.activeCount() > 20) ;
    }
}
