package academy.devonline.javabasic.section03_exspression;

import java.util.Scanner;

public class SwapVariable_homework {
    public static void main(String[] args) {
        //считывание исходных данных
        System.out.println("Введите число 'a': ");
        var a = new Scanner(System.in).nextInt();
        System.out.println("Введите число 'b': ");
        var b = new Scanner(System.in).nextInt();
        var c = 0;
        // обработка
        c=b;
        b=a;
        // вывод
        System.out.println(c);
        System.out.println(b);
    }
}
