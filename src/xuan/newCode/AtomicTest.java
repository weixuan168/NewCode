package xuan.newCode;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by xuanwei on 2018/3/16.
 */
public class AtomicTest {
    public static AtomicInteger race = new AtomicInteger();

    public static void increase() {
        race.incrementAndGet();
    }

    private static final int THREADS_COUNT = 20;
    public static void main(String[] args) {
        Thread[] threads = new Thread[THREADS_COUNT];
        for (int i = 0; i < THREADS_COUNT; i++) {
            threads[i] = new Thread(() -> {
                for (int i1 = 0; i1 < 1000; i1++) {
                    increase();
                }
            });
            threads[i].start();
        }
        while (Thread.activeCount() > 2) {
            Thread.yield();
        }
        System.out.println(race);
    }
}
