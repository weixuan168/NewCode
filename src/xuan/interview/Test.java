package xuan.interview;

public class Test {
    public static void main(String[] args) {
        System.out.println((123+"").length());

        System.out.println(gcd(1,2));
    }

    public static int gcd(int num1, int num2) {
        int remainder = num1%num2;
        int n1=num1,n2=num2;

        while(remainder!=0) {
            n1 = n2;
            n2 = remainder;
            remainder = n1 % n2;
        }
        return n2;
    }
}
