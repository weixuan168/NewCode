package xuan.algorithms.chapter1;

/**
 * Created by Xuan on 2017/7/20.
 */
public class RationalTest {
    public static void main(String[] args) {
        Rational rational = new Rational(1, 2);
        Rational rational1 = new Rational(2, -4);
        System.out.println(rational);
        System.out.println(rational1);
        System.out.println(rational.plus(rational1));
        System.out.println(rational.minus(rational1));
        System.out.println(rational.times(rational1));
        System.out.println(rational.divides(rational1));
        System.out.println(rational.equals(rational1));


    }
}
