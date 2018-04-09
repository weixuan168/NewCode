package xuan.newCode;

public class NoVisibility {
    private static boolean ready;
    private static int number;

    private static class ReaderTread extends Thread {
        @Override
        public void run() {
            while (!ready) {
                Thread.yield();
            }
            System.out.println(number);
        }
    }

    public static void main(String[] args) {
        new ReaderTread().start();
        number = 42;
        ready = true;
    }

}
