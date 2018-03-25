package xuan.designPattern.ObserverPattern;

/**
 * 具体观察者，实现了抽象观察者接口
 */
public class User implements Observer {

    private String name;
    private String message;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        this.message = message;
        read();
    }

    public void read() {
        System.out.println(name + "收到推送消息：" + message);
    }

}

