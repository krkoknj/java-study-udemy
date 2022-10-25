package array;

import java.util.Arrays;
import java.util.Scanner;

public class Array2 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] integer = getInteger(5);
        int[] ints = sortInteger(integer);
        print(ints);
    }

    private static void print(int[] ints) {
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
    }

    private static int[] sortInteger(int[] integer) {
        int[] ints = Arrays.copyOf(integer, integer.length);
        int tmp = 0;
        boolean flag = true;

        while (flag) {
            flag = false;
            for (int i = 0; i < ints.length - 1; i++) {
                if (ints[i] < ints[i + 1]) {
                    tmp = ints[i];
                    ints[i] = ints[i + 1];
                    ints[i + 1] = tmp;
                    flag = true;
                }
            }
        }

        return ints;
    }

    private static int[] getInteger(int i) {
        int[] arr = new int[i];

        for (int j = 0; j < i; j++) {
            arr[j] = scanner.nextInt();
        }

        return arr;

    }
}
