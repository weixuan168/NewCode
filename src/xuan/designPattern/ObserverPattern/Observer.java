package xuan.designPattern.ObserverPattern;

/**
 * 抽象观察者
 * 定义了一个update()方法，当观察者调用notifyObserver()方法时调用
 */
public interface Observer {
    void update(String message);
}
