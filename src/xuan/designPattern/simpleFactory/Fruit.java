package xuan.designPattern.simpleFactory;

/**
 * Created by xuanwei on 2018/3/18.
 *
 * 所有产品类的抽象祖先。用抽象类体现了一种继承关系
 */
public abstract class Fruit {

    public void printFruit() {
        System.out.println("This is fruit");
    }

}
