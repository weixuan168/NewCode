package xuan.algorithms.sort;

/**
 * Created by Xuan on 2017/11/3.
 * 堆排序
 */
public class Heap {
    public static void heapSort(int array[]) {
        int n = array.length;
        int newArray[] = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            newArray[i] = array[i - 1];
        }
        for(int i=n/2;i>=1;i--) { //建堆
            sift(newArray, i, n);
        }
        for (int i = 1; i <= n; i++ ) {
            array[i - 1] = newArray[1];
            newArray[1] = newArray[n - i + 1];
            sift(newArray, 1, n - i);

        }
    }

    public static void sift(int array[], int k, int n) {//n为编号最大的叶子节点的编号
        int i = k, j = 2 * i;       //i是要筛选的节点，j是i的左孩子
        while (j <= n) {
            if (j < n && array[j] > array[j + 1]) {   //j是左右孩子中的较小者
                j++;
            }
            if (array[i] > array[j]) {             //根节点与孩子节点交换
                int tmp = array[i];
                array[i] = array[j];
                array[j] = tmp;
                i = j;
                j = 2 * i;                       //继续探索子节点的子节点
            } else break;
        }
    }

    public static void main(String[] args) {
        int array[] = {3, 5, 4, 7, 2, 1};
        heapSort(array);
        for (int i : array) {
            System.out.println(i);
        }
    }
}
