package academy.devonline.javabasic.section06_array;

import java.util.Arrays;

public class ArrayCopyRang_2 {
    public static void main(String[] args) {
        // read data source
        int [] source = {1,-2,3,-4,5};

        int startIndex = 2;
        int endIndex = 4;

        // processing
        int [] destination = new int[endIndex-startIndex];

        for (int i = 0; i < destination.length; i++) {
            destination [i] = source [i+startIndex];

        }

        System.out.println(Arrays.toString(destination));
    }
}
