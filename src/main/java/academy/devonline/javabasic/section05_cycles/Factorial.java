package academy.devonline.javabasic.section05_cycles;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        System.out.println("Введите число: ");
        int number = new Scanner(System.in).nextInt();

        int i = 1;
        int count = 1;

        if (number <= 0) {
            while (true) {
                System.out.println("Value should be >= 0");
                System.out.println("Введите число: ");
                number = new Scanner(System.in).nextInt();
                if (number>0){
                    break;
                }
            }
        }

        while (i <= number) {
            count *= i;
            i++;
        }
        if (count<=0){
            System.out.println("Int overflow");
        } else {
            System.out.println(count);
        }
    }
}