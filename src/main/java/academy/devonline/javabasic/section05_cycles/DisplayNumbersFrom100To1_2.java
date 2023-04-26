package academy.devonline.javabasic.section05_cycles;

import java.util.Scanner;

public class DisplayNumbersFrom100To1_2 {
    public static void main(String[] args) {
        var a = new Scanner(System.in).nextInt();
        for (int i = 100; i >= a ; i--) {
            System.out.println(i);
        }
    }
}
