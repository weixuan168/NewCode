package xuan.designPattern.factory;

/**
 * Created by xuanwei on 2018/3/18.
 *
 * 抽象工厂类，所有具体的工厂类都要继承该类
 */
public abstract class Factory {
    public abstract Fruit fruitFactory();
}
