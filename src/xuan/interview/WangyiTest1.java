package xuan.interview;

import java.util.Scanner;

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


