package xuan.algorithms.sort;

/**
 * Created by Xuan on 2017/11/1.
 * 归并算法的迭代实现
 */
public class Merge_iterator {
    public static void mergeSort(int array[]) {
        int gap=1;
        int n = array.length;
        while (gap < n) {
            mergePass(array,n,gap);
            gap = gap * 2;
        }
    }

    public static void mergePass(int array[], int n, int gap) {
        int i=0;
        while (i <n - 2 * gap) {
            Merge_recursive.merge(array, i, i + gap - 1, i + 2 * gap - 1);
            i += 2 * gap;
        }
        if (i < n - gap) {
            Merge_recursive.merge(array, i, i + gap - 1, n-1);
        }
    }

    public static void main(String[] args) {
        int array[] = {3,5,4,8,6,9,7,1,12};
        mergeSort(array);
        for (int a : array) {
            System.out.print(a + ",");
        }
    }
}
