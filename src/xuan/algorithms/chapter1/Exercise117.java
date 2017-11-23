package xuan.algorithms.chapter1;

/**
 * Created by Xuan on 2017/6/23.
 */
public class Exercise117 {
    public static void main(String[] args) {
        double t = 9.0;
        while (Math.abs(t - 9.0 / t) > 0.01) {
            t = (9.0 / t + t) / 2.0;
            System.out.println(t);
        }
        System.out.printf("%.5f\n", t);

        int sum=0;
        for(int i=1;i<1000;i++)
            for(int j=0;j<i;j++)
                sum++;
        System.out.println(sum);

        int sum1 = 0;
        for(int i=1;i<1000;i*=2)
            for(int j=0;j<1000;j++)
                sum1++;
        System.out.println(sum1);
    }


}
