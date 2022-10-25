package array;

import java.util.Arrays;
import java.util.Scanner;

public class Array1 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("숫자를 입력해주세요.\r");
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        sort(arr);
    }

    /**
     * 100
     * 50
     * 70
     * 40
     * 10
     */
    public static void sort(int[] arr) {


        int[] sortedArray = Arrays.copyOf(arr, arr.length);

        int tmp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (sortedArray[i] < sortedArray[i + 1]) {
                tmp = sortedArray[i];
                sortedArray[i] = sortedArray[i + 1];
                sortedArray[i + 1] = tmp;
            }
        }

        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));

    }

    public static void sort2(int[] arr) {
        int[] sortedArray = new int[arr.length];
        int tmp = 0;
        boolean flag = true;
        for (int i = 0; i < arr.length; i++) {
            sortedArray[i] = arr[i];
        }

        while (flag) {
            flag = false;
            for (int i = 0; i < sortedArray.length - 1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {
                    tmp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = tmp;
                    flag = true;
                }
            }
        }

        System.out.println("so = " + Arrays.toString(sortedArray));

    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
