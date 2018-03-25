package xuan.designPattern.ObserverPattern;

public class Test {
    public static void main(String[] args) {
        WeChatServer weChatServer = new WeChatServer();

        User user1 = new User("zhangsan");
        User user2 = new User("lisi");
        User user3 = new User("wangwu");

        weChatServer.registerObserver(user1);
        weChatServer.registerObserver(user2);
        weChatServer.registerObserver(user3);

        weChatServer.setMessage("Java是世界上最好的语言");

        System.out.println("*****************************");

        weChatServer.removeObserver(user1);
        weChatServer.setMessage("Java是世界上最好的语言");

    }
}
