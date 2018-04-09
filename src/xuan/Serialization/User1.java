package xuan.Serialization;

import java.io.Serializable;

/**
 * Created by xuanwei on 2018/4/9.
 */
public class User1 implements Serializable {
    //静态变量不会被序列化
    public static String className = "User1";
    private static final long serialVersionUID = 1l;
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "className=" + className +
                ",name=" + name +
                ",age=" + age +
                "}";
    }
}
