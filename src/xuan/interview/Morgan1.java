package xuan.interview;

/**
 * 找出一个无序数组中,后面的数减去前面的数的差的最大值。
 * 例：{7,1,5,4,6,2,3} 结果为：6-1=5
 * 例：{7,6,5,4,3,2,1} 结果为：0（没有符合要求的）
 *
 * 暴力解法：双重遍历，时间复杂度O(n^2)
 *
 * 贪心算法：维持一个最小值min,初始化为array[0]；维持一个差值dif，初始化为0；
 * 遍历数组，对每一个元素比较其与min的大小，若更小则更新min，否则计算差值并与dif比较，若更大则更新dif。
 *
 * 动态规划算法：定义两个数组，dif[]与min[],dif[i]代表array前i个数的最大差值，min[i]代表array前i个数的最小值。
 * 最优子结构；dif[i]=Max{dif[i-1],array[i]-min[i-1]}
 * 转移方程：dif[i]=Max{dif[i-1],array[i]-min[i-1]}
 *          min[i]=Min{min[i-1],array[i]}
 * 边界条件：dif[0]=0
 *          min[0]=array[0]
 *
 */
public class Morgan1 {
    public static void main(String[] args) {
        int[] array = {7, 1, 2, 5, 4, 6, 3};
        System.out.println(getMaxDiffrence1(array));
        System.out.println(getMaxDiffrence2(array));
        System.out.println(getMaxDiffrence3(array));
    }

    //贪心算法
    public static int getMaxDiffrence1(int[] array) {
        int min = array[0];
        int dif=0;
        for (int i = 1; i < array.length-1; i++) {
            if (array[i] < min) {
                min = array[i];
            } else if ((array[i]-min)>dif) {
                dif = array[i] - min;
            }
        }
        return dif;
    }

    //动态规划（备忘录算法）
    public static int getMaxDiffrence2(int[] array) {
        int[] dif = new int[array.length];
        int[] min = new int[array.length];
        dif[0] = 0;
        min[0] = array[0];
        for(int i=1;i<array.length;i++) {
            dif[i] = Math.max(dif[i - 1], array[i] - min[i - 1]);
            min[i] = Math.min(min[i - 1], array[i]);
        }
        return dif[array.length - 1];
    }

    /**
     * 观察上面的备忘录算法实现，我们用两个数组记录了所有子问题的dif和min，但实际上我们要求的只是dif[array.length-1]，
     * 它只与前一位的dif和min有关。因此，我们只用两个变量迭代地去记录每一个子问题的dif和min即可，进一步降低空间复杂度。
     *
     * @param array
     * @return
     */
    public static int getMaxDiffrence3(int[] array){
        int dif=0;
        int min = array[0];
        for(int i=1;i<array.length;i++) {
            dif = Math.max(dif, array[i] - min);
            min = Math.min(min, array[i]);
        }
        return dif;
    }
    /**
     * 可以看到，这样写出来的最简洁的动态规划代码和我们第一种贪心算法的代码是一样的。
     */
}
