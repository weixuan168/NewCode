package xuan.interview;

import java.lang.reflect.Array;
import java.util.*;
public class Main1 {

    static void q3(int[][] dp, int[] A, int[] B){
        HashMap<Integer, Integer> map = new HashMap<>();
        Arrays.sort(dp, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }
        });
        int maxP = 0;
//        for(int i=0; i<dp.length; i++){
//            maxP = Math.max(maxP, dp[i][1]);
//            map.put(dp[i][0], maxP);
//        }
        Arrays.sort(B);
        int l = 0;
        int r = 0;
        while(l<dp.length && r<B.length){
            if(dp[l][0] <= B[r]){
                maxP = Math.max(maxP, dp[l][1]);
                l++;
            }else{
                map.put(B[r], maxP);
                r++;
            }
        }
        while(r<B.length){
            map.put(B[r], maxP);
            r++;
        }
        for(int a : A)
            System.out.println(map.get(a));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] dp = new int[N][2];
        for(int i=0; i<N; i++){
            dp[i][0] = sc.nextInt();
            dp[i][1] = sc.nextInt();
        }
        int[] A = new int[M];
        int[] B = new int[M];
        for(int i=0; i<M; i++){
            A[i] = sc.nextInt();
            B[i] = A[i];
        }
        q3(dp, A, B);
    }
}