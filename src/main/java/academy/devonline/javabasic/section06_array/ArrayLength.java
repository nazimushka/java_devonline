package academy.devonline.javabasic.section06_array;

import java.util.Arrays;

public class ArrayLength {
    public static void main(String[] args) {
        int[] array = {8,2,3,4,5};

        System.out.println(Arrays.toString(array));

        System.out.println(array.length);
        System.out.println(array[array.length-1]); // последний элемент массива
    }
}
