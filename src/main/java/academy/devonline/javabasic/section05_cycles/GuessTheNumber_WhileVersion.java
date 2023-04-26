package academy.devonline.javabasic.section05_cycles;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber_WhileVersion {
    public static void main(String[] args) {
        //read source data
        var number = new Random().nextInt(10);

        // processing
        while (true) {
            var userCase = new Scanner(System.in).nextInt();

            if (number > userCase) {
                System.out.println("загаданное число больше чем " + userCase);
            } else if (number < userCase) {
                System.out.println("загаданное число меньше чем " + userCase);
            } else {
                break;
            }
        }
        // display results
        System.out.println("Congratulations, you guessed the number! // УРА! Пользователь угадал число");
    }
}

