package xuan.toGetOffer.singleton;

/**
 * Created by xuanwei on 2018/3/14.
 *
 * 单例模式：我们只能生成该类的一个实例
 *
 * 单例实现1：第一次引用该类时就创建该类的一个对象
 * 优点：简洁明了.
 * 缺点：无法延迟假造，增大内存负载.
 * （说明：singleton1实例不是在我们调用getSingleton1()方法时才被创建，
 *   而是第一个用到Singleton1类的时候就会被创建。
 *   假设我们在Singleton1类中增加另外一个静态方法，调用该静态方法是不需要创建实例的，
 *   但按照此种写法就会过早地创建实例，从而降低内存使用效率）
 */
public class Singleton1 {

    //将构造器私有化，使得外部无法new Singleton1
    private Singleton1() {
    }

    //类装载的时候就创建一个singleton1实例
    private static Singleton1 singleton1 = new Singleton1();

    //静态工厂方法，对外提供自身实例
    public static Singleton1 getSingleton1() {
        return singleton1;
    }
}
