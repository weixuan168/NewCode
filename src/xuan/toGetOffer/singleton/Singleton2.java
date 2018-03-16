package xuan.toGetOffer.singleton;

/**
 * Created by xuanwei on 2018/3/14.
 *
 * 单例模式实现2：单线程实现
 * 优点：简单，可以实现延迟加载。
 * 缺点（致命）：线程不安全。
 * （说明：如果两个线程同时判断singleton2==null,则会创建出两个实例）
 */
public class Singleton2 {

    //构造器私有化，杜绝new实例
    private Singleton2() {
    }

    //定义一个静态私有实例
    private static Singleton2 singleton2 = null;

    //在需要的时候创建它
    public static Singleton2 getSingleton2() {
        if (singleton2 == null)
            singleton2 = new Singleton2();
        return singleton2;
    }
}
