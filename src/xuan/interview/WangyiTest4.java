package xuan.interview;

import java.util.Scanner;
import java.util.Stack;

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
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        for(int i=0;i<size;i++) {
            switch (i % 2) {
                case 0:
                    stack1.push(array[i]);
                    while (!stack1.isEmpty()) {
                        stack2.push(stack1.pop());
                    }
                    break;
                case 1:
                    stack2.push(array[i]);
                    while (!stack2.isEmpty()) {
                        stack1.push(stack2.pop());
                    }
                    break;
                default:
                    break;
            }
        }
        String result = "";
        if (!stack1.isEmpty()) {
            while (!stack1.isEmpty()) {
                result = stack1.pop() + " " + result;
            }
        } else {
            while (!stack2.isEmpty()) {
                result = stack2.pop() + " " + result;
            }
        }
        System.out.println(result.trim());
    }
}
