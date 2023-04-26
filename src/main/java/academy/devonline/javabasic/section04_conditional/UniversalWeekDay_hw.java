package academy.devonline.javabasic.section04_conditional;

import java.util.Scanner;

public class UniversalWeekDay_hw {
    public static void main(String[] args) {
        System.out.println("Введите день недели: ");
        int Day = new Scanner(System.in).nextInt();
        System.out.println("Сегодня понедельник?");
        boolean isMondayFirst = new Scanner(System.in).nextBoolean();

        if (Day == 1 & isMondayFirst == true) {
            System.out.println("Monday");
        } else if (Day == 2 & isMondayFirst == true) {
            System.out.println("Tuesday");
        } else if (Day == 3 & isMondayFirst == true) {
            System.out.println("Wednesday");
        } else if (Day == 4 & isMondayFirst == true) {
            System.out.println("Wednesday");
        } else if (Day == 5 & isMondayFirst == true) {
            System.out.println("Friday");
        } else if (Day == 6 & isMondayFirst == true) {
            System.out.println("Saturday");
        } else if (Day == 7 & isMondayFirst == true) {
            System.out.println("Sunday");
        } else if (Day == 1 & isMondayFirst == false) {
            System.out.println("Sunday");
        } else if (Day == 2 & isMondayFirst == false) {
            System.out.println("Monday");
        } else if (Day == 3 & isMondayFirst == false) {
            System.out.println("Tuesday");
        } else if (Day == 4 & isMondayFirst == false) {
            System.out.println("Wednesday");
        } else if (Day == 5 & isMondayFirst == false) {
            System.out.println("Thursday");
        } else if (Day == 6 & isMondayFirst == false) {
            System.out.println("Friday");
        } else if (Day == 7 & isMondayFirst == false) {
            System.out.println("Friday");
        } else {
            System.out.println("Uncorrected");
        }

    }
}
