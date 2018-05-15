package xuan.interview;

import java.util.Scanner;

public class Meituan {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int[] inputArray = new int[m];
        long[] result = new long[m];
        for(int i=0;i<m;i++ ) {
            inputArray[i] = in.nextInt();
        }
        for (int i = 0; i < m; i++) {
            int length = (inputArray[i] + "").length();

            for(int j=1;j<length;j++) {
               result[i]+= Math.pow(10,j-1)*9*j;
            }
            result[i] += length * (inputArray[i] - Math.pow(10, length - 1) + 1);

        }
        for(int i=0;i<m;i++) {
            System.out.println(result[i]);
        }
    }
}
