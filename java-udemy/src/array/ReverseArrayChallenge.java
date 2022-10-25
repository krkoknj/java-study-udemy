package array;

import java.util.Arrays;

public class ReverseArrayChallenge {
    public static void main(String[] args) {
        int[] arr = {10, 3, 3, 4, 5, 6};

        System.out.println("arr = " + Arrays.toString(arr));

        int[] ints = reverseArray(arr);
        reverseArrayHalf(arr);
        System.out.println("reverse arr = " + Arrays.toString(arr));
        System.out.println("ints = " + Arrays.toString(ints));
    }

    private static void reverseArrayHalf(int[] arr) {
        int maxIdx = arr.length - 1;
        int halfLength = arr.length / 2;
        int tmp;
        for (int i = 0; i < halfLength; i++) {
            tmp = arr[i];
            arr[i] = arr[maxIdx - i];
            arr[maxIdx - i] = tmp;
//            maxIdx--;
        }
    }

    private static int[] reverseArray(int[] arr) {
        int count = 0;
        int[] reverseArr = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {
            reverseArr[count] = arr[i];
            count++;
        }

        return reverseArr;
    }

}
