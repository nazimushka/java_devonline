package academy.devonline.javabasic.section07_String;

import java.util.Arrays;

public class PrintReverseString {
    public static void main(String[] args) {
        //read source data
        String s = "Hello world!"; // 11=0, 10=1, 9=2, 8=3, 7=4,6=5, 5=6, 4=7, 3=8, 2=9, 1=10, 0=12.

        //processing
        char[] array = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            array[s.length() - i - 1] = s.charAt(i);
            System.out.println(Arrays.toString(array));
        }
        s = new String(array);

        //display result
        System.out.println(s);
    }
}
