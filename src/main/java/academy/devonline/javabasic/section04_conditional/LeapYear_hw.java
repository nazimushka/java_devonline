package academy.devonline.javabasic.section04_conditional;

import java.util.Scanner;

//год, номер которого кратен 400, — високосный;
//остальные годы, номер которых кратен 4, — високосные;
//остальные годы, номер которых кратен 100, — невисокосные;
//остальные годы - невисокосные.
public class LeapYear_hw {
    public static void main(String[] args) {
        System.out.println("Введите год: ");
        int a = new Scanner(System.in).nextInt();

        String result;
        if ((a % 400 == 0 || a % 4 == 0) & a != 0) {
            result = "Високосный";
        } else if (a % 100 == 0 || a > 0) {
            result = "Невисокосные";
        } else {
            result = "default";
        }

        System.out.println(result);
    }
}
