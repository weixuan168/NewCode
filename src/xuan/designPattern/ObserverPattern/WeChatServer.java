package xuan.designPattern.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体被观察者，实现抽象被观察者接口，以微信公众号为例
 */
public class WeChatServer implements Observerable {

    private List<Observer> observerList;

    private String message;

    public WeChatServer() {
        observerList = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        if (!observerList.isEmpty()) {
            observerList.remove(observer);
        }
    }

    @Override
    public void notifyObserver() {
        observerList.forEach(it->{
            it.update(message);});
    }

    public void setMessage(String s) {
        this.message = s;
        System.out.println("微信服务更新消息：" + s);
        notifyObserver();
    }
}
