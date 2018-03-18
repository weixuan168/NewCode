package xuan.designPattern.simpleFactory;

/**
 * Created by xuanwei on 2018/3/18.
 *
 * 简单工厂模式，定义一个工厂来生产各种类的对象。杜绝使用new来直接生成对象。
 */
public class TestSimpleFactory {
    public static void main(String[] args) {
        SimpleFactory simpleFactory = new SimpleFactory();
        Apple apple = (Apple) simpleFactory.fruitFctory("apple");
        Banana banana = (Banana) simpleFactory.fruitFctory("banana");
        apple.printFruit();
        banana.printFruit();
    }
}
