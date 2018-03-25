package xuan.designPattern.singleton;

/**
 * 线程安全的懒汉模式
 * 优点：线程安全，懒加载
 * 缺点：效率低，因为每次获取单例对象都要进行加锁、解锁，
 * 但其实并发并不经常有，浪费额外资源。
 */
public class Singleton3 {
    private static Singleton3 singleton3;

    private Singleton3() {

    }

    public static synchronized Singleton3 getInstance() {
        if (singleton3 == null) {
            singleton3 = new Singleton3();
        }
        return singleton3;
    }
}
