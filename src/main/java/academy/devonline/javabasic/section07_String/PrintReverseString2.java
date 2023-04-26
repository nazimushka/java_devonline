package academy.devonline.javabasic.section07_String;

import java.util.Arrays;

public class PrintReverseString2 {
    public static void main(String[] args) {
        //read source data
        String s = "Hello world!"; // 11=0, 10=1, 9=2, 8=3, 7=4,6=5, 5=6, 4=7, 3=8, 2=9, 1=10, 0=12.

        // processing and display result
        for (int i = s.length() - 1; i >= 0; i--) {
            System.out.print(s.charAt(i));
        }
        System.out.println();
    }
}
