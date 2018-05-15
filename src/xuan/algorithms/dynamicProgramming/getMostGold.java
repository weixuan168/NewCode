package xuan.algorithms.dynamicProgramming;

public class getMostGold {
    /**
     *
     * @param n 金矿的数量
     * @param w 工人的数量
     * @param g 金矿的黄金量数组
     * @param p 金矿的用工量数组
     * @return
     */
    static int getMostGold(int n, int w, int[] g, int[] p) {
        int[] preResults = new int[w+1];
        int[] results = new int[w+1];

        preResults[0] = 0;

        //填充边界格子的值
        for (int i=1;i<=w;i++) {
            if (i < p[0]) {
                preResults[i] = 0;
            } else {
                preResults[i] = g[0];
            }
        }

        //填充其余格子的值，外层循环是金矿数量，内层循环是工人数
        for(int i=1;i<n;i++) {
            for (int j=1;j<=w;j++) {
                if (j < p[i]) {
                    results[j] = preResults[j];
                } else {
                    results[j] = Math.max(preResults[j], preResults[j - p[i]] + g[i]);
                }
            }
            for(int k=0;k<results.length;k++) {
                preResults[k] = results[k];
            }
        }
        return results[w];
    }

    public static void main(String[] args) {
        int[] g = {200, 300,350, 400, 500};
        int[] p = {3, 4, 3, 5, 5};
        System.out.println(getMostGold(5, 10, g, p));
    }
}
