package academy.devonline.javabasic.section02_structure;

import java.util.Scanner;

public class StructureOfAnyConsoleProgram {
    public static void main(String[] args) {
     // Read source data - чтение данных
     //Processing - обработка данных
     //display result - отобраение данных

        // Read source data - чтение данных
        System.out.println("Pleas Enter the Number: ");
        var number = new Scanner(System.in).nextInt();

        //Processing - обработка данных
        var result = number+1;

        //display result - отобраение данных
        System.out.println(result);
    }
}
