package academy.devonline.javabasic.section05_cycles;

import java.util.Random;
import java.util.Scanner;

public class BrakeValidUsage {
    public static void main(String[] args) {
        // invalid
        for (int i = 0; i < 10; i++) {
            System.out.print( i + " ");
            if (i==5){
                break;
            }
        }
        System.out.println();
        // valid
        for (int i = 0; i <= 5; i++) {
            System.out.print( i + " ");
            }
        System.out.println();

        // valid usage
        // 1. Infinite Loop - выход из есконечного цикла
        // 2.

        var number = new Random().nextInt(10);

        var guessed = false;

        for (int i = 0; i < 10; i++) {
            var userCase = new Scanner(System.in).nextInt();
            if (number > userCase) {
                System.out.println("загаданное число больше чем " + userCase);
            } else if (number < userCase) {
                System.out.println("загаданное число меньше чем " + userCase);
            } else {
                guessed=true;
                System.out.println("Congratulations, you guessed the number! " +
                        "// УРА! Пользователь угадал число");
                break;
            }
        }
        if (!guessed){
            System.out.println("Limit Reached");
        }
    }
}
