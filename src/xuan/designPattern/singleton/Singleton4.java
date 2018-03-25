package xuan.designPattern.singleton;

/**
 * 静态内部类实现单例模式
 * 优点：懒加载，线程安全
 * 说明；singleton4作为内部类的对象，在外部类加载时不会实例化，
 * 第一次调用getInstance时将加载内部类，此时初始化singleton4，
 * 由Java虚拟机来保证其线程安全性，确保该成员变量只能初始化一次。
 */
public class Singleton4 {

    private Singleton4() {

    }

    private static class SingletonHolder {
        private static Singleton4 singleton4 = new Singleton4();
    }

    public static Singleton4 getInstance() {
        return SingletonHolder.singleton4;
    }


}
