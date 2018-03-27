package xuan.interview;

import java.util.Scanner;

/**
 * 如果一个数列S满足对于所有的合法的i,都有S[i + 1] = S[i] + d, 这里的d也可以是负数和零,我们就称数列S为等差数列。
 小易现在有一个长度为n的数列x,小易想把x变为一个等差数列。小易允许在数列上做交换任意两个位置的数值的操作,并且交换操作允许交换多次。
 但是有些数列通过交换还是不能变成等差数列,小易需要判别一个数列是否能通过交换操作变成等差数列

 思路：将接收到的数列用快排排序，然后依次判断两两之间的差值。
 */
public class WangyiTest1 {

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


    /**
     * 注意next()和 nextline()：next()不会接收空格、回车、Tab等，但 nextline()会接收
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        sc.nextLine();
        String inputArray = sc.nextLine();
        String[] numbers = inputArray.split(" ");
        int[] array = new int[size];
        for(int i=0;i<size;i++) {
            array[i] = Integer.parseInt(numbers[i]);
        }
        quickSort(array, 0, array.length-1);
        int distance = array[1] - array[0];
        for(int i=2;i<size;i++) {
            if (array[i] - array[i-1] != distance) {
                System.out.println("Impossible");
                return;
            }
        }
        System.out.println("Possible");
    }
}


