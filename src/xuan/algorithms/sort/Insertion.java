package xuan.algorithms.sort;

/**
 * Created by Xuan on 2017/10/31.
 * 插入排序
 */
public class Insertion {
    public static void insertion(int array[]) {
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j >0; j--) {
                if (array[j] < array[j-1]) {
                    int tmp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = tmp;
                }
            }

        }
    }

    public static void main(String[] args) {
        int array[] = {3, 5, 4, 7, 2, 1};
        insertion(array);
        for (int i : array) {
            System.out.println(i);
        }
    }
}
