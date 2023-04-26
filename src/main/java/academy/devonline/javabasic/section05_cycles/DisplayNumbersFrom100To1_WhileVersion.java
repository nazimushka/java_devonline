package academy.devonline.javabasic.section05_cycles;

import java.util.Scanner;

public class DisplayNumbersFrom100To1_WhileVersion {
    public static void main(String[] args) {
        var a = new Scanner(System.in).nextInt();
        int i = 100;
        while (i >= a) {
            System.out.println(i + " ");
            i--;
        }
    }
}
