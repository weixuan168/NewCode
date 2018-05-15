package xuan.algorithms.dynamicProgramming;

import java.util.HashMap;
import java.util.Map;

public class MemorandumAlgorithm {
    static int getClimbingWays(int n, Map<Integer, Integer> map) {
        if (n < 1) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        if (map.containsKey(n)) {
            return map.get(n);
        } else {
            int value = getClimbingWays(n - 1, map) + getClimbingWays(n - 2, map);
            map.put(n, value);
            return value;
        }
    }
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        System.out.println(getClimbingWays(3, map));
        System.out.println(getClimbingWays(4, map));
        System.out.println(getClimbingWays(5, map));
        System.out.println(getClimbingWays(6, map));
    }
}
