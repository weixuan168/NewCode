package xuan.designPattern.ObserverPattern;

/**
 * 抽象被观察者
 * 声明了添加、删除、通知观察者方法
 */
public interface Observerable {
    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObserver();

}
