package array;

import java.util.Arrays;

public class TypeVS {
    public static void main(String[] args) {
        int myInt = 10;
        int anotherInt = myInt;

        System.out.println("myInt = " + myInt);
        System.out.println("anotherInt = " + anotherInt);

        anotherInt++;

        System.out.println("myInt = " + myInt);
        System.out.println("anotherInt = " + anotherInt);

        int[] myIntArr = new int[5];
        int[] anotherArr = myIntArr;

        System.out.println("myIntArr = " + Arrays.toString(myIntArr));
        System.out.println("anotherArr = " + Arrays.toString(anotherArr));

        anotherArr[0] = 1;

        System.out.println("after change myIntArr = " + Arrays.toString(myIntArr));
        System.out.println("after change anotherArr = " + Arrays.toString(anotherArr));

        anotherArr = new int[]{4, 5, 6, 7, 8};
        int[] ints = modifyArray(myIntArr);

        System.out.println("ints = " + Arrays.toString(ints));
        System.out.println("after modify myIntArr = " + Arrays.toString(myIntArr));
        System.out.println("after modify anotherArr = " + Arrays.toString(anotherArr));
    }

    private static int[] modifyArray(int[] array) {
        array[0] = 2;
        array[1] = 3;
        array = new int[]{1, 2, 3, 4, 5,};
        array[1] = 3;
        return array;
    }
}
