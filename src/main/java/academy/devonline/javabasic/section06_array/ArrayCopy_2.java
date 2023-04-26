package academy.devonline.javabasic.section06_array;

import java.util.Arrays;

public class ArrayCopy_2 {
    public static void main(String[] args) {
        // read source data
        int[] source = {1, 2, 3, 4, 5};

        // processing
        int[] destination = new int[source.length];


        for (int i = 0; i < source.length; i++) {
            destination[i] = source[i];
        }

        // System.arraycopy(source, 0, destination, 0, source.length);
        // II вариант

        // display result
        System.out.println(Arrays.toString(destination));
    }
}
