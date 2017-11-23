package xuan.newCode;

/**
 * Created by Xuan on 2017/6/1.
 */

/**
 * 枚举类是特殊的Class,枚举值是public static final 的类对象。
 * 枚举类的构造器必须私有
 */

enum AccountType {

    //用构造函数传参
    SAVING(0), FIXED(1), CURRENT(2);


    private int code;

    private AccountType(int code) {
        this.code = code;
        System.out.println("It is an enum type");
    }

    //不复写toString的话则返回字符串名称
    @Override
    public String toString() {
        return String.valueOf(this.code);
    }
}
public class EnumOne {
    public static void main(String[] args) {
        //枚举类中的每个类对象都会被初始化
        System.out.println(AccountType.FIXED);
    }
}
