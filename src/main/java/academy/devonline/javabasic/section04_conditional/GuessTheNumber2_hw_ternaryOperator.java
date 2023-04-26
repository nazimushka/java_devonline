package academy.devonline.javabasic.section04_conditional;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber2_hw_ternaryOperator {
    public static void main(String[] args) {
        //read source data
        var number = new Random().nextInt(10);
        var userCase = new Scanner(System.in).nextInt();

        //processing
        String result = number == userCase ? "Congratulations, you guessed the number!" :
                "Sorry, but your number is invalid! Try again later...";

        //display  result
        System.out.println(result);
    }
}

