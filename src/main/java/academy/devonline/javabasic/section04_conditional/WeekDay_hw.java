package academy.devonline.javabasic.section04_conditional;

import java.util.Scanner;

public class WeekDay_hw {
    public static void main(String[] args) {
        System.out.println("Введите день недели: ");
        int Day = new Scanner(System.in).nextInt();

        if (Day == 1) {
            System.out.println("Monday");
        } else if (Day == 2) {
            System.out.println("Tuesday");
        } else if (Day == 3) {
            System.out.println("Wednesday");
        } else if (Day == 4) {
            System.out.println("Wednesday");
        } else if (Day == 5) {
            System.out.println("Friday");
        } else if (Day == 6) {
            System.out.println("Saturday");
        } else if (Day == 7) {
            System.out.println("Sunday");
        } else {
            System.out.println("Uncorrected");
        }
    }
}
