package academy.devonline.javabasic.section05_cycles;

import java.util.Scanner;

public class DisplayNumbersFrom100To1 {
    public static void main(String[] args) {
        var a = new Scanner(System.in).nextInt();
        for (int i = 1; i <= a ; i++) {
            System.out.println(i);
        }
    }
}
