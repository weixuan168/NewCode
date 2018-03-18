package xuan.designPattern.simpleFactory;

/**
 * Created by xuanwei on 2018/3/18.
 *
 */
public class SimpleFactory {
    public Fruit fruitFctory(String string) {
        if (string.equals("apple")) {
            return new Apple();
        }
        if (string.equals("banana")) {
            return new Banana();
        }
        return null;
    }
}
