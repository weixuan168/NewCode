package xuan.Serialization;

/**
 * Created by xuanwei on 2018/4/9.
 */
public class User2 {
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
                "name=" + name +
                ",age=" + age +
                "}";
    }
}
