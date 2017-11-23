package xuan.algorithms.sort;

/**
 * Created by Xuan on 2017/10/31.
 * 归并算法的递归实现
 */
public class Merge_recursive {
    public static void mergeSort(int array[]) {
        mergeSort(array, 0, array.length - 1);
    }
    public static void mergeSort(int array[],  int first, int end) {
        if (first == end) {
            return;
        } else {
            int mid = (first + end) / 2;
            mergeSort(array, first, mid);
            mergeSort(array, mid + 1, end);
            merge(array, first, mid, end);
        }
    }

    public static void merge(int array[], int lo, int mi, int hi) {
        int i = lo, j = mi+1;
        int tem[] = new int[hi - lo+1];
        int start = 0;
        while (i <= mi && j <= hi) {
            if (array[i] <= array[j]) {
                tem[start++] = array[i++];
            } else {
                tem[start++] = array[j++];
            }
        }
        if (i >mi && j <= hi) {
            for(int k=j;k<=hi;k++) {
                tem[start++] = array[k];
            }
        } else if (i <= mi && j > hi) {
            for(int k=i;k<=mi;k++) {
                tem[start++] = array[k];
            }
        }
        for (int t : tem) {
            System.out.print(t + ",");
        }
        System.out.println();
        for (int k = lo; k <= hi; k++) {
            array[k] = tem[k - lo];
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
