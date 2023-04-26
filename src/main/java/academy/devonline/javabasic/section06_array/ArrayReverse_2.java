package academy.devonline.javabasic.section06_array;

import java.util.Arrays;

public class ArrayReverse_2 {
    public static void main(String[] args) {
        // read source data
        int[] array = {6, 40, 34, 21, 7};
        System.out.println(Arrays.toString(array));
        System.out.println();
        System.out.println(array.length);//5 элементов

        //processing
        for (int i = 0; i < array.length/2; i++) {
            System.out.println(i);
            var temp = array[i];
            array[i] = array[array.length-i-1];
            array[array.length-i-1]=temp;
        }
        //display result
        System.out.println();
        System.out.println(Arrays.toString(array));

    }
}
