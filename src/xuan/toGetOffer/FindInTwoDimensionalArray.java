package xuan.toGetOffer;

/**
 * 剑指offer第3题：
 * <p>
 * 在一个二维数组中，每一行都按照从左到右递增，每一列都按照从上到下递增。
 * 输入这样一个二维数组和一个整数，判断数组中是否含有该整数。
 * <p>
 * 思路：从左上角或右下角开始匹配，逐行或逐列筛除
 */
public class FindInTwoDimensionalArray {
    public static boolean find(int[][] array, int key) {
        int row = array.length - 1;
        int col = 0;
        //从左下角开始匹配，如果比键值大，则减一行；如果比键值小，则加一列
        while (row >= 0 && col < array[0].length) {
            if (array[row][col] == key) {
                return true;
            } else if (array[row][col] > key) {
                row--;
            } else {
                col++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] a1 = new int[3][4];
        int[][] a = {{1, 2, 3}, {2, 3, 4}, {3, 4, 5}, {4, 5, 6}};
        System.out.println("二维数组的行数：" + a1.length);
        System.out.println("二维数组的列数：" + a1[0].length);
        System.out.println("*********************************");
        System.out.println("二维数组的行数：" + a.length);
        System.out.println("二维数组的列数：" + a[0].length);
        System.out.println("*********************************");
        System.out.println(find(a1, 0));//true,int数组默认初值为0
        System.out.println(find(a1, 1));//false
        System.out.println(find(a, 5));//true
        System.out.println(find(a, 7));//false
        System.out.println(find(a, 0));//false
    }
}
