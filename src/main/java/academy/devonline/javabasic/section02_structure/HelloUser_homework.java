package academy.devonline.javabasic.section02_structure;

import java.util.Scanner;

public class HelloUser_homework {
    public static void main(String[] args) {
        System.out.println("What is your name?");

        var user = new Scanner(System.in).nextLine();;

        System.out.println("Hello, " + user);
    }
}
