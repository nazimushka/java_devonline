package academy.devonline.javabasic.section05_cycles;

import java.util.Scanner;

public class InfiniteLoopExample {
    public static void main(String[] args) {
        while (true){ // while лучшая из всех бесконечных циклов
            var number = new Scanner(System.in).nextInt();
            if (number==0){
                break;
            }
            System.out.println(number * number);
        }
        System.out.println("Bye");
    }
}
