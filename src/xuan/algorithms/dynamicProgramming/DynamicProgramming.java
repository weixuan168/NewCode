package xuan.algorithms.dynamicProgramming;


public class DynamicProgramming {
    static int getClimbingWays(int n) {
        if (n < 1) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        int a = 1;
        int b = 2;
        int tmp = 0;
        for(int i=3;i<=n;i++) {
            tmp = a + b;
            a = b;
            b = tmp;
        }
        return tmp;
    }
    public static void main(String[] args) {
        System.out.println(getClimbingWays(3));
        System.out.println(getClimbingWays(4));
        System.out.println(getClimbingWays(5));
        System.out.println(getClimbingWays(6));
    }
}
