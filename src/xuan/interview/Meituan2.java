package xuan.interview;

import java.util.Scanner;

public class Meituan2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        int n = in.nextInt();
        int m = in.nextInt();
        int p = in.nextInt();
        int result=0;
        int[] array = new int[length];
        array[0]=p;
        for(int i=1;i<length;i++) {
            array[i]=(array[i-1]+153)%p;
        }
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=m;j++) {
                if(i<j){
                    int temp=i;
                    i=j;
                    j=temp;
                }
                result += array[gcd(i, j)-1];
            }
        }
        System.out.println(result);
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
