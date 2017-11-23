package xuan.algorithms.chapter1;

/**
 * Created by Xuan on 2017/6/7.
 */
public class AboutDevide0 {
    public int x;
    public static void main(String []args)
    {
        //非静态变量不能够被静态方法引用,是编译时错误
//        System. out. println("Value is" + x);

        //Infinity：无穷大
        System.out.println(1.0/0.0);
        System.out.println(1.0/0);
        System.out.println(1/0.0);

        //NaN：Not a Number
        System.out.println(1.0%0.0);
        System.out.println(1.0%0);
        System.out.println(1%0.0);

        String s = "11,22,33,";
        System.out.println(s.split(",").length);

        for (int i=0;i<s.split(",").length;i++) {
            System.out.println(s.split(",")[i]);

        }

    }
}
