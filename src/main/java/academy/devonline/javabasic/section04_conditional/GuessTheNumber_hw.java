package academy.devonline.javabasic.section04_conditional;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber_hw {
    public static void main(String[] args) {
        var number = new Random().nextInt(10);
        System.out.println("Напишите число, которое как вы думаете загадал компьютер?");
        var user = new Scanner(System.in).nextInt();

        if (number==user){
            System.out.println("Congratulations, you guessed the number!");
        } else {
            System.out.println("Sorry, but your number is invalid! Try again later...");
        }
    }
}
