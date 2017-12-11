package xuan.algorithms.sort;

/**
 * Created by Xuan on 2017/12/11.
 * 冒泡排序
 */
public class BubbleSort {
    public void bubbleSort(int[] a) {
        for(int i=0;i<a.length;i++) {
            for(int j=0;j<a.length-i-1;j++) {
                if (a[j] > a[j + 1]) {
                    int tmp = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = tmp;
                }
            }
            for (int k : a) {
                System.out.print(k + ",");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        int a[] = {7, 5, 2, 8, 4};
        bubbleSort.bubbleSort(a);
    }
}
