package xuan.designPattern.factory;

/**
 * Created by xuanwei on 2018/3/18.
 *
 * 工厂模式：不同的工厂生产不同的东西
 */
public class TestFactory {
    public static void main(String[] args) {
        Factory appleFactory = new AppleFactory();
        Factory bananaFactory = new BananaFactory();
        appleFactory.fruitFactory().printFruit();
        bananaFactory.fruitFactory().printFruit();
    }
}
