package array;

import java.util.Arrays;
import java.util.Scanner;

public class MyArrayList {
    private static Scanner scanner = new Scanner(System.in);
    private static int[] base = new int[10];
    public static void main(String[] args) {
        getInput();
        printArray(base);
        resizeArray(base);
        printArray(base);
        System.out.println("base = " + Arrays.toString(base));

    }

    private static void resizeArray(int[] arr) {
        int[] original = arr;

        base = new int[original.length + 10];

        for (int i = 0; i < original.length; i++) {
            base[i] = original[i];
        }

    }

    private static void printArray(int[] base) {
        for (int i = 0; i < base.length; i++) {
            System.out.println(base[i]);
        }
    }

    private static void getInput() {
        System.out.println("갑을 입력해주세요.");
        for (int i = 0; i < base.length; i++) {
            base[i] = scanner.nextInt();
        }

    }
}
