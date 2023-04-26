package academy.devonline.javabasic.section03_exspression;

import java.util.Scanner;

public class SimpleCalculator_homework {
    public static void main(String[] args) {
        // read source data
        System.out.println("Enter 'a':  ");
        var a = new Scanner(System.in).nextInt();
        System.out.println("Enter 'b':  ");
        var b = new Scanner(System.in).nextInt();
        // processing
        var aPlusB = a + b;
        var aMinusB = a - b;
        var aMulB = a * b;
        var aDivB = a / b;
        var aModB = a % b;

        //display result
        System.out.println("a + b = " + aPlusB);
        System.out.println("a - b = " + aMinusB);
        System.out.println("a * b = " + aMulB);
        System.out.println("a / b = " + aDivB);
        System.out.println("a % b = " + aModB);

    }
}
