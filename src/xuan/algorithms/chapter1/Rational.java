package xuan.algorithms.chapter1;

/**
 * 为有理数实现一个不可变数据类型Rational
 * 有理数：成比例的数，整数与分数的集合
 */
public class Rational {
    private long numerator;
    private long denominator;

    public Rational(long numerator, long denominator) {
        if (denominator == 0)
            throw new RuntimeException("Denominator is zero");
        long factor = getFactor(numerator, denominator);
        this.numerator = numerator/factor;
        this.denominator = denominator/factor;
    }

    private long getFactor(long n1, long n2) {
        if (n1 == 0) return 1;
        if (n1 < 0) n1 = -n1;
        if (n2 < 0) n2 = -n2;
        long p, q;
        if (n1 > n2) {
            p = n1;
            q = n2;
        } else {
            p = n2;
            q = n1;
        }
        return p % q == 0 ? q : getFactor(q, p % q);
    }

    //该数与b之和
    public Rational plus(Rational b) {
        long n1 = numerator * b.denominator + denominator * b.numerator;
        long n2 = denominator * b.denominator;
        return new Rational(n1, n2);
    }

    //该数与b之差
    public Rational minus(Rational b) {
        long n1 = numerator * b.denominator - denominator * b.numerator;
        long n2 = denominator * b.denominator;
        return new Rational(n1, n2);
    }

    //该数与b之积
    public Rational times(Rational b) {
        long n1 = numerator * b.numerator;
        long n2 = denominator * b.denominator;
        return new Rational(n1, n2);
    }

    //该数与b之商
    public Rational divides(Rational b) {
        long n1 = numerator * b.denominator;

        long n2 = denominator * b.numerator;
        return new Rational(n1, n2);
    }

    //该数与that相等吗
    public boolean equals(Rational that) {
        if (numerator == that.numerator && denominator == that.denominator) {
            return true;
        }
        return false;
    }

    //对象的字符串表示
    public String toString() {
        if (numerator % denominator == 0) {
            return numerator / denominator+"";
        }
        if (denominator < 0) {
            return -numerator + "/" + (-denominator);
        }
        return numerator + "/" + denominator;
    }

}
