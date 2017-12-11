package xuan.algorithms.sort;

import java.util.Random;

/**
 * Created by Xuan on 2017/10/31.
 * 快速排序
 */
public class Quick {
    //有序序列进行快速排序会退化成冒泡排序，因此在排序前对序列进行随机化，可使时间复杂度基本控制在O(nlogn)。
    public static void shuffle(int array[]) {
        Random random = new Random();
        for (int k = 0; k < array.length; k++) {
            int r = k + random.nextInt(array.length - k);
            int t = array[k];
            array[k] = array[r];
            array[r] = t;
        }
    }

    public static void quickSort(int array[]) {
        //StdRandom.shuffle(array); 随机打乱，消除对输入的依赖
        shuffle(array);
        for (int a : array) {
            System.out.print(a + ",");
        }
        System.out.println();

        quickSort(array, 0, array.length - 1);
    }

    public static void quickSort(int array[], int first, int end) {
        if (first < end) {
            int tmp = array[first];
            int i = first, j = end;
            while (i != j) {
                while (i < j && array[j] >= tmp) {
                    j--;
                }
                array[i] = array[j];
                while (i < j && array[i] <= tmp) {
                    i++;
                }
                array[j] = array[i];
            }
            array[i] = tmp;
            quickSort(array, first, i - 1);
            quickSort(array, i + 1, end);
        }
        return;
    }

    public static void main(String[] args) {
        int array1[] = {49, 38, 65, 97, 76, 13, 27};
        int array2[] = {1, 2, 3, 4, 1, 1, 2, 2, 3, 3};
        int array3[] = {1, 2, 3, 4, 5, 6, 7};
        quickSort(array1);
        quickSort(array2);
        quickSort(array3);
        for (int i : array1) {
            System.out.print(i + ",");
        }
        System.out.println();
        for (int i : array2) {
            System.out.print(i + ",");
        }
        System.out.println();
        for (int i : array3) {
            System.out.print(i + ",");
        }
    }
}
