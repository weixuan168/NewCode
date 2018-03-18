package xuan.designPattern.factory;

/**
 * Created by xuanwei on 2018/3/18.
 */
public class AppleFactory extends Factory {
    @Override
    public Fruit fruitFactory() {
        return new Apple();
    }
}
