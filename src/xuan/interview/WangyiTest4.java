package xuan.interview;

import java.util.Scanner;

/**
 *小易有一个长度为n的整数序列,a_1,...,a_n。然后考虑在一个空序列b上进行n次以下操作:
 1、将a_i放入b序列的末尾
 2、逆置b序列
 小易需要你计算输出操作n次之后的b序列

 思路：1.用两个栈，来回倒 —— 这种思路提交评判，会超时
      2.找规律
 */
public class WangyiTest4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        scanner.nextLine();
        String inputArray = scanner.nextLine();
        String[] numbers = inputArray.split(" ");
        int[] array = new int[size];
        for(int i=0;i<size;i++) {
            array[i] = Integer.parseInt(numbers[i]);
        }
        StringBuilder result = new StringBuilder();
        switch (size % 2) {
            case 0:
                for(int i=size-1;i>0;i-=2  ) {
                    result.append(array[i]+" ");
                }
                for (int i=0;i<size;i+=2) {
                    result.append(array[i]+" ");
                }
                break;
            case 1:
                for(int i=size-1;i>=0;i-=2  ) {
                    result.append(array[i]+" ");
                }
                for (int i=1;i<size;i+=2) {
                    result.append(array[i]+" ");
                }
                break;
            default:
                break;
        }
        System.out.println(result.toString().trim());
    }
}
