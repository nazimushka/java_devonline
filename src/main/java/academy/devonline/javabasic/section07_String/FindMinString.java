package academy.devonline.javabasic.section07_String;

import java.util.Arrays;

public class FindMinString {
    public static void main(String[] args) {
        String[] array = {"one", "two", "three", "four", "five"};
        String min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (min.compareTo(array[i]) > 0) {
                min = array[i];
            }
        }

        System.out.println(min);
    }
}
