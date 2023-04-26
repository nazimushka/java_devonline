package academy.devonline.javabasic.section07_String;

import java.util.Objects;
import java.util.Scanner;

public class MathHelper {
    public static void main(String[] args) {
        System.out.println("Enter cmd: {pi, e, exit or quit}");
        String pi = "pi";
        String e = "e";
        String exit = "exit";
        String quit = "quit";

        while (true) {
            String input = new Scanner(System.in).nextLine();
            if (input.equals(pi)) {
                System.out.println(Math.PI);
                break;
            } else if (input.equals(e)) {
                System.out.println(Math.E);
                break;
            } else if (input.equals(exit) || input.equals(quit)) {
                break;
            } else {
                System.out.println("cmd. Try again!");
            }
        }
    }
}
