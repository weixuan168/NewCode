package xuan.algorithms.search;

/**
 * Created by Xuan on 2017/12/28.
 * 二分查找
 */
public class BinarySearch {
    //迭代式（非递归）
    public int binarySearch1(int key, int[] array) {
        int lo=0;
        int hi = array.length - 1;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (key == array[mid]) {
                return mid;
            }
            if (key < array[mid]) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return -1;
    }

    //递归式
    public int binarySearch2(int lo, int hi, int key, int[] array) {
        if (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (key == array[mid]) {
                return mid;
            }
            if (key < array[mid]) {
                return binarySearch2(lo, mid - 1, key, array);
            } else {
                return binarySearch2(mid + 1, hi, key, array);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = {2, 3, 4, 5, 6, 7, 9};
        BinarySearch binarySearch = new BinarySearch();
        System.out.println(binarySearch.binarySearch1(7, a));
        System.out.println(binarySearch.binarySearch1(8, a));
        System.out.println(binarySearch.binarySearch1(9, a));

        System.out.println(binarySearch.binarySearch2(0,6,7, a));
        System.out.println(binarySearch.binarySearch2(0,6,8, a));
        System.out.println(binarySearch.binarySearch2(0,6,9, a));
    }
}
